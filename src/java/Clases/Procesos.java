/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ProGram
 */
public class Procesos extends Conexion{
Connection cn;
String estado;
public Persona consulta(){
    Persona p=new Persona();
    cn=Cadena();
    try{
    PreparedStatement ps= null;
    ResultSet rs=null;
    ps=cn.prepareStatement("Select * from Persona ");
    rs=ps.executeQuery();
    if(rs.next()){
    p.nombres=rs.getString("Nombre");
    }
    }catch(Exception e){}
    return p;
}
        
            
}
