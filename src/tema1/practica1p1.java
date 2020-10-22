/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.Lector;

/**
 *
 * @author Larry
 */
public class practica1p1 {
    public static void main(String[] args) {
    System.out.println("ingrese un numero");
    int n = Lector.leerInt();
    int f=1;
    while (n !=0){
        f=f*n;
        n=n-1;
 }
  System.out.println("el factorial del numero ingresadoes: "+f);  
}
}