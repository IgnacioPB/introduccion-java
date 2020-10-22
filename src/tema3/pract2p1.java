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
public class pract2p1 {
    public static void main(String[] args) {
        triangulo triangulo=new triangulo();
        System.out.print("ingrese lado 1 del triangulo :");
        double lado1 =(Lector.leerInt());
        triangulo.setlado1(lado1);
        System.out.print("ingrese lado 2 del triangulo :");
        double lado2 =(Lector.leerInt());
        triangulo.setlado2(lado2);
        System.out.print("ingrese lado 3 del triangulo :");
        double lado3 =(Lector.leerInt());
        triangulo.setlado3(lado3);
        System.out.print("ingrese color del triangulo");
        String colorR =(Lector.leerString());
        triangulo.setColorR(colorR);
        System.out.print("ingrese color de lineas del triangulo");
        String colorL =(Lector.leerString());
        triangulo.setColorL(colorR);
        System.out.print("el perimetro del triangulo es:"+triangulo.obtenerPerimetro()+" y el area es: "+triangulo.obtenerArea());       
}
}