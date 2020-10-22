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
public class pract2p3 {
    public static void main(String[] args) {
        entrenadores e;
        System.out.println("nombre");
        String nombre=Lector.leerString();
        System.out.println("sueldo");
        double sueldo=Lector.leerDouble();
        System.out.println("campeonatos");
        int campeonatos=Lector.leerInt();
        e=new entrenadores(nombre,sueldo,campeonatos);
        System.out.println(e.sueldoaCobrar());
    }   
}
