import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateProduct {
    public static void main(String[] args) throws SQLException {

        Connection con = DBConnection.getCon();

        String query = "create table product (id number(3), name varchar(20), price number(5), quantity number(5))";

        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();

        System.out.println("Table Created Successfully !!");

    }
}
