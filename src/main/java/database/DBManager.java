package database;






import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.mysql.jdbc.Driver;
import javax.sql.DataSource;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import model.Model;

public class DBManager{


    private static final String databaseUrl = "jdbc:mysql://127.13.43.130:3306/tochka";
    private static final String userName = "adminhtPlGMW";
    private static final String password = "NrIGpl-qyA_R";


    public DBManager(){
           }

    public List<Model> getItems() throws SQLException, ClassNotFoundException {
    		List<Model> list = new ArrayList<Model>();
       
    		Class.forName("com.mysql.jdbc.Driver");
    		
          Connection conn = DriverManager.getConnection(databaseUrl, userName, password);
          Statement stmt =  (Statement) conn.createStatement();
          String query =  "SELECT * FROM Model";
          
          ResultSet rs = stmt.executeQuery(query);
          
          while (rs.next()) {
        	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
          }
            return list;
        
                  
        

    }
   
        
}