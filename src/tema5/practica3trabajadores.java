/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Larry
 */
public class practica3trabajadores {
    public static void main(String[] args) {
    Trabajadores trab=new Trabajadores("Nacho",18,4333,"progamador");
    Personas pers=new Personas("flor",22,345);
    System.out.println(trab.toString());
    System.out.println(pers.toString());
}
}