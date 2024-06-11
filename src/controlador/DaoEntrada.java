/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Entrada;
import modelo.conexion;

public class DaoEntrada {
    
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Entrada et){
        String SQL="insert into entrada (nomProd,stock,idCategoria,fecha,idProveedor,precio,precioVenta,total) VALUES (?,?,?,?,?,?,?,?)";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setString(1, et.getNomProd());
            ps.setInt(2, et.getStock());
            ps.setInt(3, et.getIdCategoria());
            ps.setDate(4, et.getFecha());
            ps.setInt(5, et.getIdProveedor());
            ps.setDouble(6, et.getPrecio());
            ps.setDouble(7, et.getPrecioVenta());
            ps.setDouble(8, et.getTotal());
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