package aplicacioncomercio.productosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;




/**
 *
 * @author J P Salmeron Dittamo
 */
public class conexion {
    //C:\Users\Pedro\OneDrive\Desktop\DBAplicacionJavaComercio
    String rutaDB = "jdbc:sqlite:C:/Users/facundo/Desktop/Apicación Java Comercio/DBAplicacionJavaComercio/DataBaseProductos.s3db";
    Connection conn = null;
    
   
    public conexion(){//CONSTRUCTOR
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(rutaDB);
            
            System.out.println("Successfully connected to Data Base.");
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "It couldn´t be possible to conect DB! ", JOptionPane.ERROR_MESSAGE);
            System.out.println("It couldn´t be possible to conect DB! " + e);
            
        }
        
    }
    
    public int ejecutarSentenciaSQL(String sentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(sentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
        
    }
    
    
    public ResultSet consultarRegistros(String sentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(sentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        }
    }
    
    

    
}
