package sampleProjectPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBCDemo {
    public static void main(String[] argv) {
 
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "Leela@1982");
            System.out.println("SQL Connection to database established!");
            
 
       
        Statement sta = connection.createStatement();
       //int count = sta.executeUpdate("INSERT INTO employeedb.employee(empid,name,salary) values(700,'Dolly',50000)");
       sta.executeUpdate("COMMIT");
 
       ResultSet rs = sta.executeQuery("select * from employeedb.employee");
        
       // System.out.println("count========"+count);
       while(rs.next())
        {
        	System.out.println("employee ID :::"+rs.getInt(1));
        	System.out.println("employee Name :::"+rs.getString(2));
        	System.out.println("employee Salary:::"+rs.getDouble(3));
        }
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return;
        } 
        
        finally {
            try
            {
                if(connection != null)
                    connection.close();
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
