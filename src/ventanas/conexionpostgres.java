/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bladimr Chavez
 */
public class conexionpostgres {
    private Connection conexionBD;
    public Connection getConexion() {
        return conexionBD;
    }       
    public void setConexion(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }
    public conexionpostgres conectar1() {
        try {
          Class.forName("org.postgresql.Driver");// carga el driver y oracle 

         String BaseDeDatos = "jdbc:postgresql://localhost:5432/postgres"; //crea una variable con la direccion el puerto y la instancia (express)
         conexionBD = DriverManager.getConnection(BaseDeDatos, "postgres","10marzo2013");  // carga la conexion (usuario contraseña)
         

         if (conexionBD != null) {
             JOptionPane.showMessageDialog(null, "Conectado a la base de datos Postresql!");
         } else {
             JOptionPane.showMessageDialog(null, "Error en la Conexión !");
         }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage()+"aqui es");
        }
        return this;
    }
    
    public boolean ejecutar(String sql) { //
        try {
            Statement sentencia; // objetos para sentencias de oracle 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); 
            sentencia.executeUpdate(sql); //ejecuta el insert delete y el updte 
            
            getConexion().commit();
            
            
            
            //sentencia.getConnection().setAutoCommit(false);
        
        } catch (SQLException e) {
            if (e.getErrorCode()==0) return false; //Por error "Cannot commit when autocommit is enabled"
            JOptionPane.showMessageDialog(null, e.getErrorCode());
            return false;
        }        return true;
    }
}
