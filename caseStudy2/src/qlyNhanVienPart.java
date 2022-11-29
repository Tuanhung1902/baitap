import java.util.ArrayList;
import java.util.Scanner;

public class qlyNhanVienPart {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<nhanVienPart> nhanVienParts = new ArrayList<>();

    public void show() {
        for (int i = 0; i < nhanVienParts.size(); i++) {
            System.out.println(nhanVienParts.get(i).toString());
        }
    }

    public nhanVienPart taoNhanVien() {
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
        int sobuoi = Integer.parseInt(scanner.nextLine());
        nhanVienPart nhanVienPart = new nhanVienPart(username, password, name, age, gender, sobuoi);
        return nhanVienPart;
    }

    public void add(nhanVienPart nhanVienPart) {
        nhanVienParts.add(nhanVienPart);
    }

    public int findIndexByUsername(String username) {
        for (int i = 0; i < nhanVienParts.size(); i++) {
            if (username.equals(nhanVienParts.get(i).getUsername())) {
                return i;
            }

        }
        return -1;
    }

    public void delete(String username) {
        int index = findIndexByUsername(username);
        if (index != -1) {
            nhanVienParts.remove(index);
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
                        nhanVienParts.get(index).setPassword(newPassWord);
                        break;
                    case 2:
                        System.out.println("Nhập hệ số lương mới");
                        int newSoBuoi = Integer.parseInt(scanner.nextLine());
                        nhanVienParts.get(index).setSoBuoi(newSoBuoi);
                        break;
                    default:
                        System.out.println("Nhập lại");
                        break;
                }
            }
        }
    }

    public void tinhLuong() {
        for (int i = 0; i < nhanVienParts.size(); i++) {
            System.out.println(nhanVienParts.get(i).getName() + "có lương:" + nhanVienParts.get(i).tinhLuong());
        }
    }
}

