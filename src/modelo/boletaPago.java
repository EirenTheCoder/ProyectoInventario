/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author EirenGG
 */
public class boletaPago {
    int numBol,Dni,id_prod,cant_prod;
    public boletaPago(int numBol,int Dni,int id_prod,int cant_prod){
     this.numBol = numBol;
     this.Dni = Dni;
     this.id_prod = id_prod;
     this.cant_prod = cant_prod;
        
    }   

    public boletaPago() {   }
    public int getNumBol(){
    
        return numBol;
        
    }
    public int getDNI(){
    
        return Dni;
       
    }
    
     public int getId_Prod(){
    
        return id_prod;
       
    }
     public int getCant_Prod(){
    
        return cant_prod;
       
    }
     public void setNumBol(int numero_boleta){
     
         numBol = numero_boleta;
     }
    
        public void setDNI(int nuevo_dni){
     
         Dni = nuevo_dni;
     }
        public void setID_Producto(int id_produc){
     
         
            id_prod = id_produc;
     }
        public void setCantidad_Producto(int cant_produc){
     
         cant_prod = cant_produc;
     }
       
    
}
