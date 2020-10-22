/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author Larry
 */
public class prac1part2p1 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("ingrese nombre");
        String nombre = Lector.leerString();
        persona.setNombre(nombre);  
        System.out.println("ingrese DNI");
        int dni = Lector.leerInt();
        persona.setDNI(dni);
        System.out.println("ingrese edad");
        int edad = Lector.leerInt();
        persona.setEdad(edad);
         System.out.println(persona.toString());
}
}