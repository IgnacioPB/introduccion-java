/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;



public class Triangulo extends Figura {
    private double lado1,lado2,lado3;
    
    public Triangulo(double lado1,double lado2,double lado3, String unColorR, String unColorL){
      super(unColorR,unColorL);
      setLado1(lado1);
      setLado2(lado2);
      setLado3(lado3);
    }

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double s = (lado1+lado2+lado3)/2;
        double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    public String toString(){
       String aux = super.toString() + 
                    " Lado1: " + getLado1()+
                    "Lado2: "+ getLado2()+
                    "Lado3: "+getLado3();
       return aux;
    }

}
