/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author Larry
 */
public class practica1p2 {
    public static void main(String[] args) {
    for (int i = 1; i <= 10; i++){ //para que sea solo numeros impares cambio el ++ por un +2 
          int f=1;
          int n=i;
          while (n !=0){
          f=f*n;
          n=n-1;
         }
     System.out.println("el factorial del numero "+i+" es : "+f);
    }
}
}