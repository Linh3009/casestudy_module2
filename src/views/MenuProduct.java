package views;

import managers.ProductManager;
import models.Product;

import java.util.Scanner;

public class MenuProduct {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();
    public void menuProduct(){
        while (true){
            System.out.println("=====Quản Lý Sản Phẩm=====");
            System.out.println("*******************************");
            System.out.println("Mời nhập lựa chọn");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm theo giá");
            System.out.println("7. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productManager.showProduct();
                    break;
                case 2:
                    Product product = productManager.create();
                    productManager.addProduct(product);
                    break;
                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.remove();
                    break;
                case 5:
                    break;
                case 6:

            }
        }
    }
}
