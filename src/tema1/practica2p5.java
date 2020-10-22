/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**

 */
public class practica2p5 {
     public static void main(String[] args) {
        int[][] edificio = new int[8][4];
        for (int i=0;i<8;i++){// inicializo matriz
          for(int j=0;j<4;j++){
            edificio[i][j] =0; 
             }
         }
          //simulacion ingreso
         System.out.println("ingrese numero de piso");
         int p = Lector.leerInt();
         System.out.println("ingrese numero de oficina");
         int o = Lector.leerInt();
         while(p!=9){
         edificio[p-1][o-1]= edificio[p-1][o-1]+1;
         System.out.println("ingrese numero de piso");
          p = Lector.leerInt();
         System.out.println("ingrese numero de oficina");
         o = Lector.leerInt();
         }
         //informar cantidad de personas
         for (int i=0;i<8;i++){
          for(int j=0;j<4;j++){
            System.out.println("la cantidad de personas que ingresaron al piso :"+(i+1)+",oficina :"+(j+1)+"es de: "+edificio[i][j]);  
            } 
         }      
}
}
