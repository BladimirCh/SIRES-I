/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import ventanas.conexionbasededatosoracle;
import ventanas.formlogin;
/**
 *
 * @author Bladimr Chavez
 */
public class valida_ingreso {
    String DataBase = "jdbc:oracle:thin:@localhost:1521:XE";
    String Usuario ="system";
    String password = "10marzo2013";
    
    Connection connect= null;
    Statement sta =null;
    ResultSet rs=null;
    public int validar (){
    String usuario = formlogin.usuario.getText();
    String pass = String.copyValueOf(formlogin.contrasenia.getPassword());
    
    int resultado=0;
    String SSQL ="select*from ACCESO where CEDULA_IDENTIDAD='"+usuario+"'AND CONTRASENIA='"+pass+"')";
         try{
      connect =(Connection) DriverManager.getConnection(DataBase,Usuario,password);
     sta= connect.createStatement();
     rs= sta.executeQuery(SSQL);
     if(rs.next()){
       resultado=1;
     }
     }
     catch(Exception e)
     {
     JOptionPane.showMessageDialog(null,e,"Error al tratar de conectar",JOptionPane.ERROR_MESSAGE);
     }finally{
        try {
            connect.close();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e,"Error al tratar de desconectar",JOptionPane.ERROR_MESSAGE);
        }
         }
         return resultado;
         }
         
    }
    

    

