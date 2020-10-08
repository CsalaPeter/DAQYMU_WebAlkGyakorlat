package storeProcedure;

public class InParameters {

    private static Connection con = null;
    public static void main(String[] args) {
        Connection();
        TwoParaStoredProcedure();
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

    public static void TwoParaStoredProcedure() {
        try {
            CallableStatement cs = conn.prepareCall("{call twoprocedure(?,?)}");
            cs.setString(1, "Gal Dora");
            cs.setString(2, "Perzsa");
            cs.execute();
            System.out.println("Successful modification!");
        } catch (SQLException e) {
            System.err.println("Update Error:" + e.getMessage());
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
