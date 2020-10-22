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
public abstract class empleados {
    private String nombre;
    private double sueldo;
    
    public empleados(String nombre,double sueldob){
        setNombre(nombre);
        setSueldo(sueldob);
    }
    public String toString(){
        String aux = "nombre: " + getNombre() +
                     ", sueldo: "  + this.calcularSueldo();              
             return aux;
       }
    public abstract double calcularSueldo();
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
