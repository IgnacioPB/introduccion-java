package tema3;
public class triangulo {
       private double lado1,lado2,lado3,altura;
       private String colorR, colorL;

        public void triangulo(double unlado1, double unlado2, double unlado3, double unaltura,String uncolorR, String uncolorL) {
            this.lado1 = unlado1; //c1/
            this.lado2 = unlado2; //c2/
            this.lado3 = unlado3; //base/
            this.colorR = uncolorR;
            this.colorL = uncolorL;
        }
        
        
        public void triangulo(){
        }
        
        public double getlado1(){
         return lado1;
        }
        
         public double getlado2(){
          return lado2;
         }
        
         public double getlado3(){
          return lado3;
         }

         
        public String getcolorL(){
        return colorL;
       }
        
        
        public String getcolorR(){
        return colorR;
       }
        
        public void setColorR(String uncolorR){
        colorR = uncolorR;
       }
       
       public void setColorL(String uncolorL){
         colorL = uncolorL;
       }
       
       public void setlado1(double unlado1){
         lado1 = unlado1;
       }        
       
       public void setlado2(double unlado2){
         lado2 = unlado2;
       }
       
       
       public void setlado3(double unlado3){
         lado3 = unlado3;
       }
       
       public double obtenerPerimetro(){
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
       }
       
       public double obtenerArea(){
        double s = (lado1+lado2+lado3)/2;
        double area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return area;
       }
   }