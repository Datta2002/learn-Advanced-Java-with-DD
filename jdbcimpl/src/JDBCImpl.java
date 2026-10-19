import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCImpl {

    public static void main(String[] args) {
        try {

            // step 1 : Register a driver.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded");

            // Step 2 : Create a connection
//            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system", "admin");
            // for mysql
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rs_igniter","root","admin");
            System.out.println("Connected to database");

            // Step 3 : create Statement
            Statement stmt = conn.createStatement();
            System.out.println("Statement created");

            // Execute stmt.
            String query = "insert into demo values(200, 'RS')";

            int count = stmt.executeUpdate(query);
            System.out.println(count+" row(s) inserted.");

            // Step 5 : Close connection
            conn.close();
            System.out.println("Connection closed");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
