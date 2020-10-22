/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class teoria1punto2 {
public static void main(String[] args) {
    GeneradorAleatorio.iniciar();
    int patente;
    boolean[][] tabla = new boolean[5][10];
    patente=GeneradorAleatorio.generarInt(10);
    while (patente != 0){
            System.out.println("La patente "+patente+" tiene permitido el paso");
            System.out.println("ingrese fila para asignar");
            int f = Lector.leerInt(); 
            System.out.println("ingrese columna para asignar"); 
            int c = Lector.leerInt();
            tabla[f][c]=true;
        patente=GeneradorAleatorio.generarInt(10);
        }
    int cant,i,j,max,maxFila;
    max=0;
    maxFila=0;
    cant=0;
    for ( i = 0; i < 5; i++){
      for ( j = 0; j < 10; j++) {
        if ((tabla[i][j])!=false);{
             cant++;
           }   
      }
      if( max < cant){
          max=cant;
          maxFila=i; 
      }
     cant=0;
    }
    System.out.println("El piso con mas autos es "+maxFila);
  } 
 }
