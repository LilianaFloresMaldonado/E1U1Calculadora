package operaciones;

import java.util.Scanner;

/**
 *
 * @author lilliana
 */
public class operaciones {
    double Num, Num2,Resul;
     
     public void DatosSuma(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Digita el primer número:"); 
         Num=leer.nextInt(); 
         System.out.println("Digita el segundo número: "); 
         Num2=leer.nextInt(); 
         Resul=Num+Num2; 
         System.out.println("Resultado: "+Resul);
     }
     public void DatosResta(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Digita el primer número: "); 
         Num=leer.nextInt(); 
         System.out.println("Digita el segundo número: "); 
         Num2=leer.nextInt(); 
         Resul=Num-Num2; 
         System.out.println("Resultado: "+Resul);
     }
     public void DatosMultiplicación(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Digita el primer número: "); 
         Num=leer.nextInt(); 
         System.out.println("Digita el segundo número: "); 
         Num2=leer.nextInt(); 
         Resul=Num*Num2; 
         System.out.println("Resultado: "+Resul);
     }
     public void DatosDivision(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Introduce un numerador: "); 
         Num=leer.nextInt(); 
         System.out.println("Introduce un denominador: "); 
         Num2=leer.nextInt(); 
         Resul=Num/Num2; 
         System.out.println("Resultado: "+Resul);
     }
     public class Suma {
    double Num,Num2, Resul;
     
      void setNumero(double num1){
         Num = num1;
     }
       void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }
}
     public class Resta {
    double Num,Num2, Resul;
     
      void setNumero(double num1){
         Num = num1;
     }
       void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }
         }
     public class Multiplicación {
    double Num,Num2, Resul;
     
      void setNumero(double num1){
         Num = num1;
     }
       void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }

}
public class Division {
    
double Num,Num2, Resul;
     
      void setNumero(double num1){
         Num = num1;
     }
       void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }

}
     
}
