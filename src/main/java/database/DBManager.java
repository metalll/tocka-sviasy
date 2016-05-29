package database;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.db.DatabaseTypeUtils;
import com.j256.ormlite.db.MysqlDatabaseType;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;

import model.Model;
import com.j256.ormlite.table.TableUtils;
import com.mysql.jdbc.Statement;

public class DBManager{


    private static final String databaseUrl = "jdbc:mysql://$OPENSHIFT_MYSQL_DB_HOST:$OPENSHIFT_MYSQL_DB_PORT/";
    private static final String userName = "admin8hfKxZ7";
    private static final String password = "u854gGHu_pZz";


    public DBManager(){
           }

    public List<Model> getItems() throws SQLException {
    		List<Model> list = new ArrayList<Model>();
       
        	
          Connection conn = DriverManager.getConnection(databaseUrl,userName,password);
          
          Statement stmt =  (Statement) conn.createStatement();
          String query =  "SELECT * FROM Model";
          
          ResultSet rs = stmt.executeQuery(query);
          
          while (rs.next()) {
        	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
          }
            return list;
        
                  
        

    }
}