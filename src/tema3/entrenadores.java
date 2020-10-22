/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Larry
 */
public class entrenadores {
    private String nombre;
    private double sueldo;
    private int campeonatos;
    
   public entrenadores(String nombre,double sueldo,int campeonatos){
       this.nombre=nombre;
       this.sueldo=sueldo;
       this.campeonatos=campeonatos;   
}
   public void entrenadores(){
       
   }
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

    /**
     * @return the campeonatos
     */
    public int getCampeonatos() {
        return campeonatos;
    }

    /**
     * @param campeonatos the campeonatos to set
     */
    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
  public double sueldoaCobrar(){
      double plus= sueldo;
      if ((1<=campeonatos ) && (campeonatos<=4)){
      plus+=5000;      
  }
      else
          if((5<=campeonatos ) && (campeonatos<=10)){
              plus+=30000;
          }
      else
              if(10<campeonatos ){
                  plus+=50000;
              }
      return plus;
  }
}