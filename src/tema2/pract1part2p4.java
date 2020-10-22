/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;
public class pract1part2p4 {
    public static void main(String[] args) {
         Persona [][] matriz;
        matriz = new Persona[5][8];
        int i=0,j=0; // i=dia j=Personas
        
        System.out.print("Escriba su nombre: ");
        String nombre=Lector.leerString();
        while ((i < 5) && (!"ZZZ".equals(nombre))){
            while ((j < 8) && (!"ZZZ".equals(nombre))){
                Persona alguien = new Persona();
                alguien.setNombre(nombre);
                if(!"ZZZ".equals(nombre)){
                    System.out.print("Escriba su edad: ");
                    alguien.setEdad(Lector.leerInt());
                    System.out.print("Escriba su DNI: ");
                    alguien.setDNI(Lector.leerInt());
                    matriz[i][j]=alguien;
                    j++;
                    System.out.print("Escriba su nombre: ");
                    nombre=Lector.leerString();
                }
            }
        j=0;
        i++;
        }
        for (i=0;i<5;i++){
            for (j=0;j<8;j++){
                if (matriz[i][j] != null){
                    System.out.println("El dia "+(i+1)+" debe entrevistar a: ");
                    System.out.println((j+1)+") "+ matriz[i][j].toString());
                }
            }
        }
            
    }
}