/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author ProGram
 */
public class Prueba {
   public static void main(String []args){
   Procesos pr=new Procesos();
   Persona dato; 
   dato=pr.consulta();
   JOptionPane.showMessageDialog(null,dato.nombres);
   } 
}
