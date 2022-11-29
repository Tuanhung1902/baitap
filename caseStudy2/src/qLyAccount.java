import java.util.ArrayList;
import java.util.Scanner;

public class qLyAccount {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Admin> admins = new ArrayList<>();
    public Admin taoAccount(){

        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();
        Admin admin = new Admin(username, password);
        return admin;
    }
    public void add(Admin admin){
        admins.add(admin);
    }
}
