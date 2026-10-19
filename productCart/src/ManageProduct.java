import java.sql.SQLException;
import java.util.Scanner;

public class ManageProduct {
    public static void main(String[] args) throws SQLException {
        System.out.println("Please Select the Operation \n 1 ) Add Product : 1 \n" +
                "2) Update Product : 2" +
                "3) Delete Product : 3" +
                "4) View All Products : 4");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1: InsertProduct.insertProduct();
                    break;
//            case 2: updateProduct();
//            break;
//            case 3: deleteProduct();
//            break;
//            case 4: viewAllProduct();
//            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
