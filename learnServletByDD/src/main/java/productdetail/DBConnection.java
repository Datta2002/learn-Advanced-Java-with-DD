package productdetail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String username = "system";
    private static final String passwd = "admin";

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
            return con;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Class not loaded !!");
            throw new RuntimeException(e);
        }
    }
}
