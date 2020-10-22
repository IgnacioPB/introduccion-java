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
public class prac1part2p2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona vector[]=new Persona[2];
        for (int i=0;i<2;i++){
        System.out.println("ingrese nombre");
        String nombre = Lector.leerString();
        persona.setNombre(nombre);  
        System.out.println("ingrese DNI");
        int dni = Lector.leerInt();
        persona.setDNI(dni);
        System.out.println("ingrese edad");
        int edad = Lector.leerInt();
        persona.setEdad(edad);
        System.out.println("se guarda en el vector"+persona.toString());
        vector[i]=persona;
        }
        int posmin=0;
        int cant=0;
        int min=99999999;
       for (int i=0;i<2;i++){ 
         if(65<vector[i].getEdad()){
          cant=cant++;
           }
         if( +min<vector[i].getDNI()){
             min=vector[i].getDNI();
            posmin=i;
            }         
        }
       System.out.println("la cantidad de personas mayores a 65 años es: "+cant+"y la persona con menor dni es:"+vector[posmin].toString());
       }
}
