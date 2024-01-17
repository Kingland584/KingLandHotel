package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // method connection
    public static Connection createConnection() {
        Connection con = null;

        try {
            // declare driver and connection string
            String driver = "org.apache.derby.jdbc.ClientDriver";
            String connectionString = "jdbc:derby://localhost:1527/KingLandHotel;create=true;user=app;password=app";

            // load driver
            Class.forName(driver);
            
            // Return connection to database
            con = DriverManager.getConnection(connectionString);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // Print the full stack trace for debugging
        }
        return con;
    }
    
}
