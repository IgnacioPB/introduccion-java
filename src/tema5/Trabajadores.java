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
public class Trabajadores extends Personas{
    private String tarea;
    
    public Trabajadores(String nombre,int edad,int dni,String tarea){
        super(nombre,edad,dni);
        this.tarea=tarea;       
    }
    public String toString(){
       return super.toString()+".Soy: "+this.getTarea();
    }

    public String getTarea(){
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
}
