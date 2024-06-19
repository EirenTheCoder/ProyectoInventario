/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.boletaPago;
import modelo.conexion;

/**
 *
 * @author EirenGG
 */
public class DaoBoletaPago {
   Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
 public List Listar(){
        List<boletaPago> lista=new ArrayList<>();
        String SQL="select * from boleta_pago";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
               boletaPago b = new boletaPago();
               b.setNumBol(rs.getInt(1));
               b.setDNI(rs.getInt(2));
               lista.add(b);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);    
        }
        return lista;
    }
 
}

    

