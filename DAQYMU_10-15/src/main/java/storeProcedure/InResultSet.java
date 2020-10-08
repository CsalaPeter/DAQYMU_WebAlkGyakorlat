package storedProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InResultSet {
    private static Connection con = null;
    public static void main(String[] args) {
        Connection();
        storedProcedure();
        DisConnect();

    }

    public static void Connection() {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            String url = "";
            String user = "DAQYMU";
            String pswd = "password";
            con = DriverManager.getConnection(url, user, pswd);
            System.out.println("Connection successful!");
            System.out.println("------------------------");
        } catch (Exception ex) {
            System.err.println("Connection Erorr" + ex.getMessage());
        }
    }

    public static void storedProcedure() {
        try {
            CallableStatement cs=conn.prepareCall("{call storedProcedures(?)}");
            cs.setString(1, "Mekk Elek");
            ResultSet rs=cs.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String breed = rs.getString("breed");
                int age = rs.getInt("age");
                String owner = rs.getString("owner");
                System.out.println(id + " " + name + " " + breed + " " + age + " " + owner + " ");
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println("Query failed" + e.getMessage());
        }
    }


        public static void DisConnect() {
            try {
                con.close();
                System.out.println("Successful disconnection!");
            } catch (SQLException e) {
                System.err.println("Insert Error:" + e.getMessage());
            }

    }

}