package bai2;

import java.util.Scanner;

public class ManageNhanVien {
    NhanVien[] nhanViens = new NhanVien[0];

    public NhanVienParttime creatParttime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho ten: ");
        String name = scanner.nextLine();
        System.out.println("Tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("So buoi: ");
        int sobuoi = Integer.parseInt(scanner.nextLine());

        NhanVienParttime nhanVienParttime = new NhanVienParttime(name, age, gender, sobuoi);
        return nhanVienParttime;
    }

    public void addParttime(NhanVienParttime nhanVienParttime) {
        NhanVien[] nhanViens1 = new NhanVien[nhanViens.length + 1];

        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens1[i] = nhanViens[i];
        }

        nhanViens1[nhanViens1.length - 1] = nhanVienParttime;

        nhanViens = nhanViens1;
    }

    public NhanVienFulltime creatFulltime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho ten: ");
        String name = scanner.nextLine();
        System.out.println("Tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("He so: ");
        double heso = Double.parseDouble(scanner.nextLine());

        NhanVienFulltime nhanVienFulltime = new NhanVienFulltime(name, age, gender, heso);
        return nhanVienFulltime;
    }

    public void addFulltime(NhanVienFulltime nhanVienFulltime) {
        NhanVien[] nhanViens1 = new NhanVien[nhanViens.length + 1];

        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens1[i] = nhanViens[i];
        }

        nhanViens1[nhanViens1.length - 1] = nhanVienFulltime;

        nhanViens = nhanViens1;
    }
}
