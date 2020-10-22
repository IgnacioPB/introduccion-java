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
public class pract1part2p5 {
     public static void main(String[] args) {
        String vector[]=new String[5];
         for (int i = 0; i < 5; i++) {
             System.out.print("ingrese palabra xd ");
             String string=(Lector.leerString());
             vector[i]=string;
         }
         for (int i = 0; i < 5; i++) {
        System.out.println(vector[i].charAt(0));
     }
}
}