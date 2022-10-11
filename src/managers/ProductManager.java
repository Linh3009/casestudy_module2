package managers;

import io.ReadAndWrite;
import models.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    File fileProduct = new File("D:\\IntelliJ IDEA\\casestudy_module2\\src\\file_text\\fileProduct.txt");
    ReadAndWrite<Product> productReadAndWrite = new ReadAndWrite<>();
    ArrayList<Product> productArrayList = productReadAndWrite.read(fileProduct);

    public void showProduct(){
        for (Product product : productArrayList) {
            System.out.println(product.toString());
        }
    }

    public void addProduct(Product product){
        productArrayList.add(product);
        productReadAndWrite.write(fileProduct,productArrayList);
    }
    public int findIndexById(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Product create() {
        int id;
        int index;
        while (true) {
            System.out.println("Nhập id :");
            id = Integer.parseInt(scanner.nextLine());
            index = findIndexById(id);
            if (index == -1) {
                break;
            }
            System.out.println("Nhập trùng id rồi.");
        }
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập describe");
        String describe = scanner.nextLine();
        System.out.println("Nhập price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập amount");
        int amount = Integer.parseInt(scanner.nextLine());
        return new Product(id, name, describe, price, amount );
    }

    public void edit() {
        System.out.println("Nhập id bạn muốn sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findIndexById(id);
        if (index != -1) {
            productArrayList.set(index, create());
        }else {
            System.out.println("Không có id nào trùng với id sản phẩm cần sửa");
        }
        productReadAndWrite.write(fileProduct,productArrayList);
    }
    public void remove(){
        System.out.println("Nhập id sản phẩm bạn muốn xóa :");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findIndexById(id);
        if (index != -1) {
                productArrayList.remove(productArrayList.get(index));
            } else {
                System.out.println("Không có id nào trùng với id sản phẩm cần xóa");
            }
        productReadAndWrite.write(fileProduct,productArrayList);
        }

        public void findProduct(){
            System.out.println("Nhập tên cần tìm kiếm");
        }
    }

