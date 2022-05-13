/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aDMIN
 */
public class MySQLConnection {
   /* public static Connection getConnection() throws Exception{
          String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "tutorials";
        String dbUrl = dbRoot+hostName+dbName;
        String hostUsername = "root";
        String hostPassword = "";
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorials", "root", "");
        return myConn;
    }
}*/
public static Connection getCon(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorials","root","");
           return con;
           
       }catch(Exception e){
           return null;
       }
}
}