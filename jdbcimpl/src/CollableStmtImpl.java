import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CollableStmtImpl {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBConnection.getConnection();

        String query = "{call get_emp_details(?,?,?)}";


        CallableStatement cstmt = conn.prepareCall(query);

        cstmt.setInt(1, 5);

        cstmt.registerOutParameter(2, Types.VARCHAR);
        cstmt.registerOutParameter(3, Types.NUMERIC);

        cstmt.execute();

        //System.out.println("Employee ID : "+cstmt.getInt(1) +"EMPLOYEE NAME: " + cstmt.getString(2)+ "EMPLOYEE Salary: " + cstmt.getDouble(3));

        System.out.println(cstmt.getString(2));
        System.out.println(cstmt.getInt(3));

    }

}



//CREATE OR REPLACE PROCEDURE get_emp_details (
//        p_emp_id   IN  NUMBER,
//        p_emp_name OUT VARCHAR,
//        p_salary   OUT NUMBER
//) AS
//BEGIN
//        SELECT fname, salary
//        INTO p_emp_name, p_salary
//FROM employee
//WHERE emp_id = p_emp_id;
//EXCEPTION
//WHEN NO_DATA_FOUND THEN
//p_emp_name := 'Not Found';
//p_salary := 0;
//END;
///
