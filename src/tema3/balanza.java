/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.Lector;

/**
 *
 * @author Larry
 */
public class balanza {
    private int cantidad;
    private double precioporkg,cantidadFinal;
    
    public  void iniciarCompra(){

}
   public void registrarProducto(double elpesoenkg,double elprecioenkg){
     precioporkg = elpesoenkg*elprecioenkg;
     cantidad=cantidad+1;
     cantidadFinal = cantidadFinal+precioporkg;
  }  
   public double devolverMontoaPagar(){
           return cantidadFinal;           
}
  public String devolverResumenDeCompra(){
      String resumen= "Total a pagar: "+cantidadFinal+" por la  compra de: "+cantidad+" productos";
      return resumen;
  }
 }