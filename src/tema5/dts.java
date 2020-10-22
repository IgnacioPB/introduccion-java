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
public class dts extends empleados {
    private int campeonatos;
    
    public dts(String nombre,double sueldo,int campeonatos){
        super(nombre,sueldo);
        setCampeonatos(campeonatos);
    }
    public double calcularSueldo(){
        double sueldo=getSueldo();
        if ((1<=campeonatos ) && (campeonatos<=4)){
     sueldo+=5000;      
  }
      else
          if((5<=campeonatos ) && (campeonatos<=10)){
             sueldo+=30000;
          }
      else
              if(10<campeonatos ){
                  sueldo+=50000;
              }
      return sueldo;
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
    
    
}
