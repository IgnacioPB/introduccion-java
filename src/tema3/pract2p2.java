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
public class pract2p2 {
    public static void main(String[] args) {
       balanza balanza=new balanza();
       balanza.iniciarCompra();
       System.out.print("ingrese el peso en kg del producto: ");
       double pesoenkg =(Lector.leerDouble());
       System.out.print("ingrese el precio por kg del producto: ");
       double precioporkg =(Lector.leerDouble());
       while (precioporkg !=0){
          balanza.registrarProducto(pesoenkg,precioporkg);
          System.out.println("monto del producto actual");
          System.out.println(balanza.devolverMontoaPagar());
          System.out.println("pasando al siguiente producto: ");
          balanza.iniciarCompra();
         System.out.print("ingrese el peso en kg del producto: ");
         pesoenkg =(Lector.leerDouble());
         System.out.print("ingrese el precio por kg del producto: ");
         precioporkg =(Lector.leerDouble());
         
       }
       System.out.println(balanza.devolverResumenDeCompra());
    }
}
