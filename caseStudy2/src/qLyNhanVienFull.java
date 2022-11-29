import java.util.ArrayList;
import java.util.Scanner;

public class qLyNhanVienFull {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<nhanVienFull> nhanVienFulls = new ArrayList<>();

    public void show() {
        for (int i = 0; i < nhanVienFulls.size(); i++) {
            System.out.println(nhanVienFulls.get(i).toString());
        }
    }

    public nhanVienFull taoNhanVien() {
        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập hệ số");
        double heso = Double.parseDouble(scanner.nextLine());
        nhanVienFull nhanVienFull = new nhanVienFull(username, password, name, age, gender, heso);
        return nhanVienFull;


    }

    public void add(nhanVienFull nhanVienFull) {
        nhanVienFulls.add(nhanVienFull);
    }

    public int findIndexByUsername(String username) {
        for (int i = 0; i < nhanVienFulls.size(); i++) {
            if (username.equals(nhanVienFulls.get(i).getUsername())) {
                return i;
            }

        }
        return -1;
    }

    public void delete(String username) {
        int index = findIndexByUsername(username);
        if (index != -1) {
            nhanVienFulls.remove(index);
        }
    }

    public void edit(String username) {
        int index = findIndexByUsername(username);
        if (index != -1) {
            System.out.println(" Chọn nhân viên muốn sửa ");
            System.out.println("1. Nhân viên FullTime");
            System.out.println("2. Nhân viên PartTime");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("1. Sửa password");
                System.out.println("2. Sửa hệ số lương");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        System.out.println("Nhập password mới");
                        String newPassWord = scanner.nextLine();
                        nhanVienFulls.get(index).setPassword(newPassWord);
                        break;
                    case 2:
                        System.out.println("Nhập hệ số lương mới");
                        double newHeSo = Double.parseDouble(scanner.nextLine());
                        nhanVienFulls.get(index).setHeso(newHeSo);
                        break;
                    default:
                        System.out.println("Nhập lại");
                        break;
                }
            }
        }

    }

    public void tinhLuong() {
        for (int i = 0; i < nhanVienFulls.size(); i++) {
            System.out.println(nhanVienFulls.get(i).getName() + "có lương:" + nhanVienFulls.get(i).tinhLuong());
        }
    }

}
