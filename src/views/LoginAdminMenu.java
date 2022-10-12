package views;

import managers.ProductManager;

import java.util.Scanner;

public class LoginAdminMenu {
    Scanner scanner = new Scanner(System.in);
    MenuAdmin menuAdmin = new MenuAdmin();

    public void loginAdmin() {
        while (true){
            System.out.println("==============(!LOGIN-ADMIN!)==================");
            System.out.println("Nhập userName :");
            String username = scanner.nextLine();
            System.out.println("Nhập passWord");
            String pass = scanner.nextLine();
            if (username.equals("admin") && pass.equals("123456")){
                menuAdmin.menuAdmin();
                break;
            } else {
                System.out.println("Mày đéo phải admin, gọi nó đến nhập lại");
            }
        }
    }
}
