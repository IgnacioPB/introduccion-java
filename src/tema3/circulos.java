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
public class circulos {
    private double radio;
    private String colorLinea,colorRelleno;
    
    
   public void circulo(){
       
   }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the colorLinea
     */
    public String getColorLinea() {
        return colorLinea;
    }

    /**
     * @param colorLinea the colorLinea to set
     */
    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }

    /**
     * @return the colorRelleno
     */
    public String getColorRelleno() {
        return colorRelleno;
    }

    /**
     * @param colorRelleno the colorRelleno to set
     */
    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    public double calcularArea(){
        double area= Math.PI*radio*radio;
        return area;
    }
    public double calcularPerimetro(){
            double perimetro=2*Math.PI*radio;
    return perimetro;
    }
}
