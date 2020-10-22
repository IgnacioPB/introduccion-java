/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import PaqueteLectura.Lector;


public class DemoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(10,"Rojo", "Negro");
        System.out.println("Color linea: " + cuad.getColorLinea()); 
        System.out.println("Area: " + cuad.calcularArea()); 
        System.out.println("Representacion del cuadrado: " + cuad.toString());
        System.out.println("ingrese lado 1");
        double l1= Lector.leerDouble();
        System.out.println("ingrese lado 2");
        double l2= Lector.leerDouble();
        System.out.println("ingrese lado 3");
        double l3= Lector.leerDouble();
        System.out.println("ingrese color de linea ");
        String cl=Lector.leerString();
        System.out.println("ingrese color de relleno ");
        String cr=Lector.leerString();
        Triangulo trian= new Triangulo(l1,l2,l3,cr,cl);
        System.out.println("Color linea: " + trian.getColorLinea()); 
        System.out.println("Area: " + trian.calcularArea()); 
        System.out.println("Representacion del triangulo: " + trian.toString());
        
    }
    
    
    
}
