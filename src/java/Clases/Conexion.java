/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;

/**
 *
 * @author ProGram
 */
public class Conexion {
public Connection Cadena(){
Connection cn= null;
try{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
cn=DriverManager.getConnection("jdbc:sqlserver://plimoYfel-PC\\PRO_PROGRAMACION:1433;databaseName=ControlIG","Plimo","plimo#16");
}    catch (Exception e) {
    
    }
    return cn;
}   
}
