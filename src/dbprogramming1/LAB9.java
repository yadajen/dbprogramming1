/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming1;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement; 
import java.sql.*;
/**
 *
 * @author Student
 */
public class LAB9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String URL ="jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            Statement statement= connection.createStatement();
            String sql ="INSERT INTO student(studentID,firstName,lastName,email,deptID)"
                    + "VALUES('65130500017','yada','jenrungrotsakul','yada.jenr@gmail.com','IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
