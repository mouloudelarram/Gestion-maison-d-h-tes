/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.*;

/**
 *
 * @author mouloud
 */
public class ConnectionGMHDB {
    Connection connector;
    Statement statementAdmin;
    ResultSet ResultAdmin;
    
    //constructeur.
    public ConnectionGMHDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/GMHDB","root","");
            statementAdmin = connector.createStatement();
            System.out.println("connection etablie");
        }catch (Exception e){
            System.out.println("connection non etablie "+e);
        }
    }
    
    public static void main(String[] args) {
        new ConnectionGMHDB();
    }
}
