import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertProduct {

    static void insertProduct() throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int pid = input.nextInt();
        System.out.println("Enter product name:");
        String name = input.next();
        System.out.println("Enter product price:");
        double price = input.nextDouble();
        System.out.println("Enter product quantity:");
        int quantity = input.nextInt();

        Connection con = DBConnection.getCon();

        String query = "insert into product values (?, ?, ?, ?)";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, pid);
        pst.setString(2, name);
        pst.setDouble(3, price);
        pst.setInt(4, quantity);

        int count = pst.executeUpdate();
        System.out.println(count + "Product Inserted Successfully !!");

    }
}
