import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {

    public static void main(String[] args) {
        try {
            // step 1 : registr a driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step 2 : create connection
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "system";
            String password = "admin";
            Connection conn = DriverManager.getConnection(url,user, password);

            // step 3: create stmt
            String query = "UPDATE employee SET salary = ? WHERE emp_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, 50000);
            pstmt.setInt(2, 5);

            // Step 4 : execute stmt
            int count = pstmt.executeUpdate();
            System.out.println(count + " records updated");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
