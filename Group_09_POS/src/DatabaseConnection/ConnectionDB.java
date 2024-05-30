
package DatabaseConnection;

import java.sql.*;

public class ConnectionDB {
    
    public static Connection conn;
    
    public static void openConnection() {

        String url = "jdbc:mysql://localhost:3306/orio_pos_db";
        String user = "root";
        String pass = "*ROOT0055root#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);

        } catch (Exception d) {
            System.out.println("open conn err : ");
        }

    }
    
    public static void closeConnection() {
        try {
            conn.close();
            System.out.println("Connection closed.");
        } catch (Exception m) {
            System.out.println("close conn err : ");
        }
    }

    
}
