package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageNhanVien manageNhanVien = new ManageNhanVien();

        while(true) {
            System.out.println("QUAN LY NHAN VIEN\n" +
                    "1. Them nhan vien\n" +
                    "2. Xoa nhan vien\n" +
                    "3. Hien thi luong\n" +
                    "4. Hien thi nhan vien\n" +
                    "5. Thoat\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chon loai nhan vien\n" +
                            "1. Part time\n" +
                            "2. Full time\n");
                    int chon = Integer.parseInt(scanner.nextLine());
                    switch (chon) {
                        case 1:
                            NhanVienParttime nhanVienParttime = manageNhanVien.creatParttime();
                            manageNhanVien.addParttime(nhanVienParttime);
                            break;
                        case 2:
                            NhanVienFulltime nhanVienFulltime = manageNhanVien.creatFulltime();
                            manageNhanVien.addFulltime(nhanVienFulltime);
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }

}
