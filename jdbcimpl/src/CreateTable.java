import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

    public static void main(String[] args) throws SQLException {
         Connection conn = DBConnection.getConnection();

         String query= "create table Engg_student (roll_no number(3), name varchar(20), div varchar2(20))";
         PreparedStatement pstmt = conn.prepareStatement(query);
         pstmt.executeUpdate();

        System.out.println("Table Created");
        conn.close();
    }
}
