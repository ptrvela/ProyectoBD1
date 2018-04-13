package clases;




import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;

public class conexion {
    

    static Connection con = null;
    
    static String url="jdbc:mysql://localhost/clinica";
    static String user="root";
    static String pass="ViendoTele.01";
    
    public static Connection conexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            try {
                con = (Connection) DriverManager.getConnection(url, user, pass);
                //JOptionPane.showMessageDialog(null, "conectado");
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con; 
    }
    
}
