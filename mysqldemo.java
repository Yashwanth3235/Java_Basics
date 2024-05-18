// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

// public class mysqldemo {
//     public static void main(String[] args) {
//         try{
//             Class.forName("com.mysql.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/friends","root","yashuyashu");
//             Statement stmt = con.createStatement();
//             ResultSet rs=stmt.executeQuery("select * from student");
//             while(rs.next())
//                 System.out.println(rs.getInt(1)+' ' + rs.getString(2) + ' ' + rs.getString(3));
//                 con.close();
//                 }
//                 catch(Exception e){
//                     System.out.println(e);
//                 }

//         }
//     }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqldemo {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/friends";
        String username = "root";
        String password = "yashuyashu";

        // Register the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
            return;
        }

        // Establish the connection
        try (Connection con = DriverManager.getConnection(jdbcUrl, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM friends")) {

            // Process the ResultSet
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
            }

        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


