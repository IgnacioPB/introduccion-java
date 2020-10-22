/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;


public class Ej04Matrices {

    public static void main(String[] args) {
    GeneradorAleatorio.iniciar(); 
   int[][] tabla = new int[10][10]; //1. definir la matriz de enteros de tamaño 10x10 e iniciarla con números aleatorios entre 0 y 200 
   for (int i=0;i<10;i++){
        for(int j=0;j<10;j++)
            tabla[i][j] = GeneradorAleatorio.generarInt(200);
        }
    for (int i=0;i<10;i++){
        for(int j=0;j<10;j++) 
             System.out.println("el numero en la fila"+i+" columna "+j+" es:"+tabla[i][j]);
        }//2. mostrar el contenido de la matriz en consola
    int suma=0;
    for (int i=2;i<10;i++){
        for(int j=0;j<4;j++){ //3. calcular e informar la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
            suma=suma+tabla[i][j];
        }
        }
    int[]vector;
    int suma2=0;
    vector=new int[10];//4. generar un vector de 10 posiciones donde cada posición i contiene la suma de la columna i de la matriz 
    for (int k = 0; k < 10; k++){
        for (int i=0;i<10;i++){
        for(int j=0;j<10;j++){ 
            suma2=suma2+tabla[i][j];
        }
        }
         vector[k]=suma2;
         }
   boolean esta=false;
   System.out.println("ingrese numero a buscar"); //5. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna) 
   int n = Lector.leerInt(); //   y en caso contrario imprima "No se encontró el elemento".
     for (int i=0;i<10;i++){
        for(int j=0;j<10;j++){
           if((tabla[i][j])==n){ 
              esta=true;
             System.out.println("el numero ingresado se encuentra en la fila: "+i+",columna"+j);
              i=10;
              j=10;
              
        }
           }
        }
     if(esta==false){
          System.out.println("No se encontró el numero");
     }
    }
    }
