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
public class pract2p4 {
    public static void main(String[] args) {
        circulos c= new circulos();
        System.out.println("ingrese color de linea");
        c.setColorLinea(Lector.leerString());
        System.out.println("ingrese color del relleno");
        c.setColorRelleno(Lector.leerString());
        System.out.println("ingrese radio");
        c.setRadio(Lector.leerDouble());
        System.out.println("el area es: "+c.calcularArea());
        System.out.println("el perimetro es: "+c.calcularPerimetro());
    }
}
