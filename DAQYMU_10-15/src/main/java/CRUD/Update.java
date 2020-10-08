package CRUD;

public class Update {
    private static Connection con = null;

    public static void main(String[] args) {
        Connection();
        catsUpdate();
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
            System.err.println("connection Erorr" + ex.getMessage());
        }
    }

    public static void catsUpdate() {
        Statement s = null;
        try {
            String sqlp = "Update cats set owner='Piros Ferenc' where breed='sziami'";
            s = conn.createStatement();
            s.executeUpdate(sqlp);
            System.out.println("Update successful!");
        } catch (SQLException e) {
            System.err.println("Update Error: " + e.getMessage());
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
