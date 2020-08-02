
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chathani
 */
public class DBconnection {
      
public static void main(String args[]){
    connect();
}
public static Connection connect(){
 
Connection conn=null;
try{

    Class.forName("com.mysql.jdbc.Driver");
    
    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst" ,"root","");
    
    System.out.println("connection ok");

}catch(Exception e){
   System.out.println("Error DBconnection class:"+e); 
    
}
return conn;
}
}