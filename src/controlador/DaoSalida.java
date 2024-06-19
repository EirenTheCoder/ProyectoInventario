
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Salida;
import modelo.conexion;

public class DaoSalida {
    
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Salida s){
        String SQL="insert into salida (numSalida,idCliente,fecha,subtotal,igv,total) VALUES (?,?,?,?,?,?)";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, s.getNumSalida());
            ps.setInt(2, s.getIdCliente());
            ps.setDate(3, s.getFecha());
            ps.setDouble(4, s.getSubttotal());
            ps.setDouble(5, s.getIgv());
            ps.setDouble(6, s.getTotal());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public String numSalida(){
        String numero="";
        String SQL="select max(idSalida) from salida";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
                numero=rs.getString(1);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return numero;
    }
    
    public boolean calcularStock(int idSalida, int cantidad){
        String SQL="UPDATE entrada set stock=stock-"+cantidad+" WHERE idEntrada="+idSalida;
        
        try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
