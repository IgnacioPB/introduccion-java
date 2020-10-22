
package tema1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
//Paso 1: Importar la funcionalidad para lectura de datos


public class Ej03Jugadores {

  
    public static void main(String[] args) {
        double[]tabla;//Paso 2: Declarar la variable vector de double 
        GeneradorAleatorio.iniciar();
        tabla=new double[15];//Paso 3: Crear el vector para 15 double 
        double suma=0;
        for (int i = 0; i < 15; i++){ //Pafso 4: Declarar indice 
            double a = GeneradorAleatorio.generarDouble(2);
            System.out.println("altura del jugador"+1+"es de"+a);//Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas 
            tabla[i]=a;
            suma=suma+a;
            }
         double prom=suma/15.0;//Paso 7: Calcular el promedio de alturas, informarlo
         System.out.println("el promedio de alturas es: "+prom); 
         int cant=0;
         for (int i = 0; i < 10; i++){//Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
            if(prom<tabla[i]){ 
                cant=cant+1;
            }
          }
       System.out.println("la cantidad de jugadroes que superan la altura promedio es de: "+cant); //Paso 9: Informar la cantidad. 
 }   
}
