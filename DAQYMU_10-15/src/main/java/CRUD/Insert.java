package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Insert {
    private static Connection con = null;

    public static void main(String[] args) {
        Connection();
        //InsertCats();
        catsSelectAll();
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
    public static void InsertCats() {
        Statement s=null;
        try {
            String sqlp="insert into cats values(5,'Sanyika','Bengáli',7,'Koszsos Sanyi')";
            s=conn.createStatement();
            s.executeUpdate(sqlp);
            System.out.println("Cat recorded");
            s.close();
        }catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void catsSelectAll() {
        ResultSet rs = null;
        Statement s=null;
        if (conn != null) {
            String sqlparancs = "select * from cats";
            try {
                s = conn.createStatement();
                rs = s.executeQuery(sqlparancs);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String breed = rs.getString("breed");
                    int age = rs.getInt("age");
                    String owner = rs.getString("owner");
                    System.out.println(id +" "+ name +" "+ breed +" "+ age +" "+ owner + " ");
                }
                rs.close();
            } catch (Exception ex) {
                System.err.println("Query failed!" + ex.getMessage());
            }
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
