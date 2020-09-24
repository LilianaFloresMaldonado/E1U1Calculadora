package calculadora;

import java.util.Scanner;
import operaciones.operaciones;



public class Calculadora {

   
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
          operaciones opera= new operaciones();
         
         int opc;
         
         System.out.println("*******MENÚ********** ");
         System.out.println("1.-Suma");
         System.out.println("2.-Resta");
         System.out.println("3.-Multiplicacion");
         System.out.println("4.-Division");
         System.out.println("5.-Salir");
         opc=leer.nextInt();
         
         switch (opc){
             case 1:
                  System.out.println("OPCIÓN 1: Suma");
                 opera.DatosSuma();
                 
                 break;
             case 2:
                  System.out.println("OPCIÓN 2: Resta");
                 opera.DatosResta();
                 break;
             case 3:
                  System.out.println("OPCIÓN 3: Multiplicación");
                 opera.DatosMultiplicación();
                 
                 break;
             case 4:
                  System.out.println("OPCIÓN 4: División");
                 opera.DatosDivision();
                 
                 break;
             case 5:
                
                     System.out.println("Programa Finalizado");
                     break;  
                 default:
                     System.out.println("Valor no existente");
                     
         }
         System.out.println("\" Si deseas elegir otra opción del menu pon: 1.-Si  / 2.- No \"");
        int op = leer.nextInt();
                 if(op==1){
                     Calculadora.main(args);
                 } else{
                     System.out.println("Programa Finalizado");
                     System.exit(0);                     
                 }
         
    }

    private static void main() {
        throw new UnsupportedOperationException("Not supported yet."); 
         }
     }
        
   

   

