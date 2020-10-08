package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    private static Connection con = null;

    public static void main(String[] args) {

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
            System.err.println("connection Erorr" + ex.getMessage());
        }
    }

    public static void catsDelete() {
        Statement s = null;
        try {
            String sqlp = "Delete from cats where breed='Perzsa' and owner='Gal Dora'";
            s = conn.createStatement();
            s.executeUpdate(sqlp);
            System.out.println("Update OK!");
        } catch (SQLException e) {
            System.err.println("Delete Error: " + e.getMessage());
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
