package Experiment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Experiment_29 {
    public void connection()
    {
        try{
        	Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/";
            String user_name="root";
            String pass_word="ayan";
            Connection cn=DriverManager.getConnection(url,user_name,pass_word);
            Statement stm=cn.createStatement();
            String query="create database myDb";
            stm.execute(query);
            System.out.println(" Database created Successfully");
            cn.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void create() {
        try{
            String url="jdbc:mysql://localhost:3306/employee";
            //String db="employee";
            String user_name="root";
            String pass_word="ayan";

            Connection cn=DriverManager.getConnection(url,user_name,pass_word);
            Statement stm=cn.createStatement();

            String query="create table employee_details (emp_id int(3),name varchar(20))";
            stm.execute(query);
            
            System.out.println("Table created  Successfully");
            cn.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void createData() {
    try{
        String url="jdbc:mysql://localhost:3306/employee";
        //String db="employee";
        String user_name="root";
        String pass_word="ayan";

        Connection cn=DriverManager.getConnection(url,user_name,pass_word);
        Statement stm=cn.createStatement();

        String query="INSERT into employee_details VALUES (233,'Anuj Sriwastav') ";
        stm.execute(query);
        
        System.out.println(" Data Inserted  Successfully");
        cn.close(); 
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
}
