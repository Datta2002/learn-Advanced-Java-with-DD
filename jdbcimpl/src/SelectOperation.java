import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOperation {

    public static void main(String[] args) throws SQLException {
        Connection conn = DBConnection.getConnection();

        String selectSql = "SELECT * from employee";

        String UpdateSql =  "UPDATE employee set salary= 500 where emp_id=1";

        Statement stmt = conn.createStatement();
        boolean result = stmt.execute(selectSql);

        if(result== true){
            ResultSet rs = stmt.getResultSet();
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        }
        else{
            int  count = stmt.getUpdateCount();
            System.out.println(count + " rows affected");
        }

    }
}
