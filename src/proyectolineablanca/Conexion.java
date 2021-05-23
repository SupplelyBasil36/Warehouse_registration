package proyectolineablanca;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis Montoya Moreno 172315
 */
public class Conexion {
    Connection con;
    String cadena = "";
    static boolean flag = false;
    public Conexion() /*throws SQLException*/{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/linea_blanca", "root", "");
            if(con != null){
                JOptionPane.showMessageDialog(null, "Conexión Exitosa");
                flag = true;
            }else{
                JOptionPane.showMessageDialog(null, "Error de conexión ");
            }
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error" + e);
        }
    }
}
