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
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.mysql.jdbc.Driver;
import javax.sql.DataSource;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import model.Model;

public class DBManager{
	
	private static DBManager instance = null;
	
	public static DBManager getInstance(){
		if(instance==null){
			instance = new DBManager();
		}
		return instance;	
	}

    private static final String databaseUrl = "jdbc:mysql://127.13.43.130:3306/tochka";
    //private static final String databaseUrl = "jdbc:mysql://localhost:3307/tochka";
	private static final String userName = "adminhtPlGMW";
    private static final String password = "NrIGpl-qyA_R";
    private	Connection conn = null;

    private DBManager(){}

    public List<Model> getAllItems()  {
    	  
    	List<Model> list = new ArrayList<Model>();
       try{
    	Class.forName("com.mysql.jdbc.Driver");
       }catch(Exception e){
    	   e.printStackTrace();
       }
       
       try{
    	  conn = DriverManager.getConnection(databaseUrl, userName, password);
          Statement stmt =  (Statement) conn.createStatement();
          
          String query =  "SELECT * FROM Model";
          
          ResultSet rs = stmt.executeQuery(query);
          
          while (rs.next()) {
        	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
          }
            return list;
        
                  
       }catch(Exception e){
    	   e.printStackTrace();
    	   
       }
       		return null;
    }
   
    public List<Model> getGSMItems(){
    	List<Model> list = new ArrayList<Model>();
        try{
     	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
     	   e.printStackTrace();
        }
        
        try{
     	  conn = DriverManager.getConnection(databaseUrl, userName, password);
           Statement stmt =  (Statement) conn.createStatement();
           
           String query =  "SELECT * FROM Model	WHERE category = 'GSM'";
           
           ResultSet rs = stmt.executeQuery(query);
           
           while (rs.next()) {
         	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
           }
             return list;
         
                   
        }catch(Exception e){
     	   e.printStackTrace();
     	   
        }
        		return null;
    }
    public List<Model> getETCItems(){
    	List<Model> list = new ArrayList<Model>();
        try{
     	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
     	   e.printStackTrace();
        }
        
        try{
     	  conn = DriverManager.getConnection(databaseUrl, userName, password);
           Statement stmt =  (Statement) conn.createStatement();
           
           String query =  "SELECT * FROM Model	WHERE category = ETC";
           
           ResultSet rs = stmt.executeQuery(query);
           
           while (rs.next()) {
         	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
           }
             return list;
         
                   
        }catch(Exception e){
     	   e.printStackTrace();
     	   
        }
        		return null;
    	
    }
    public List<Model> getCDMAItems(){
    	List<Model> list = new ArrayList<Model>();
        try{
     	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
     	   e.printStackTrace();
        }
        
        try{
     	  conn = DriverManager.getConnection(databaseUrl, userName, password);
           Statement stmt =  (Statement) conn.createStatement();
           
           String query =  "SELECT * FROM Model	WHERE category = CDMA";
           
           ResultSet rs = stmt.executeQuery(query);
           
           while (rs.next()) {
         	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
           }
             return list;
         
                   
        }catch(Exception e){
     	   e.printStackTrace();
     	   
        }
        		return null;
    	
    }
    public List<Model> getCDMA_GSMItems(){
    	List<Model> list = new ArrayList<Model>();
        try{
     	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
     	   e.printStackTrace();
        }
        
        try{
     	  conn = DriverManager.getConnection(databaseUrl, userName, password);
           Statement stmt =  (Statement) conn.createStatement();
           
           String query =  "SELECT * FROM Model	WHERE category = CDMA_GSM";
           
           ResultSet rs = stmt.executeQuery(query);
           
           while (rs.next()) {
         	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
           }
             return list;
         
                   
        }catch(Exception e){
     	   e.printStackTrace();
     	   
        }
        		return null;
    }
    public List<Model> getModemItems(){
    	List<Model> list = new ArrayList<Model>();
        try{
     	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
     	   e.printStackTrace();
        }
        
        try{
     	  conn = DriverManager.getConnection(databaseUrl, userName, password);
           Statement stmt =  (Statement) conn.createStatement();
           
           String query =  "SELECT * FROM Model	WHERE category = MODEM";
           
           ResultSet rs = stmt.executeQuery(query);
           
           while (rs.next()) {
         	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
           }
             return list;
         
                   
        }catch(Exception e){
     	   e.printStackTrace();
     	   
        }
        		return null;
    }
    public List<Model> getMiFiItems(){
    	List<Model> list = new ArrayList<Model>();
        try{
     	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
     	   e.printStackTrace();
        }
        
        try{
     	  conn = DriverManager.getConnection(databaseUrl, userName, password);
           Statement stmt =  (Statement) conn.createStatement();
           
           String query =  "SELECT * FROM Model	WHERE category = MIFI";
           
           ResultSet rs = stmt.executeQuery(query);
           
           while (rs.next()) {
         	  list.add(new Model(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
           }
             return list;
         
                   
        }catch(Exception e){
     	   e.printStackTrace();
     	   
        }
        		return null;
    }
    
        
}