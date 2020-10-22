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
public class jugadores extends empleados {
    private int goles;
    private int partidos;
    
    public jugadores(String nombre,double sueldob,int goles,int partidos){
        super(nombre,sueldob);
        setGoles(goles);
        setPartidos(partidos);
    }
    public double calcularSueldo(){
        double sueldo=getSueldo();
        if((0.5)<(this.goles/this.partidos)){
           sueldo=sueldo+sueldo;
        }
        return sueldo;
    }
    /**
     * @return the goles
     */
    public int getGoles() {
        return goles;
    }

    /**
     * @param goles the goles to set
     */
    public void setGoles(int goles) {
        this.goles = goles;
    }

    /**
     * @return the partidos
     */
    public int getPartidos() {
        return partidos;
    }

    /**
     * @param partidos the partidos to set
     */
    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }
    
    
    
}
