/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora_avanzada;
import java.util.Scanner;
import java.lang.Math ;
/**
 *
 * @author vesprada
 */
 
public class CALCULADORA_AVANZADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner introducir=new Scanner(System.in); 
        int menu,x,y,i=0,resultado=0;
        double resul=0;
        System.out.println("Calculadora avanzada.");
        System.out.println("Introducir ");
        System.out.println("Elige una opcion: ");
        menu=introducir.nextInt();
        
        switch (menu) {
            case 1: 
                System.out.println("introduce el primer numero");
                x=introducir.nextInt();
                System.out.println("introduce el segundo numero");
                y=introducir.nextInt();
                resultado=x+y;
                System.out.println("el sesultado es "+resultado);
                     break;
            case 2: 
                     break;
            case 3: 
                System.out.println("introduce el primer numero");
                x=introducir.nextInt();
                System.out.println("introduce el segundo numero");
                y=introducir.nextInt();
                resultado=x*y;
                System.out.println("el sesultado es "+resultado);
                
                     break;
            case 4:  
             
                     break;
            case 5: 
                System.out.println("introduce el numero");
                x=introducir.nextInt();
                System.out.println("introduce el exponente");
                y=introducir.nextInt();
                
                resul=Math.pow(x,y);
                
                System.out.println("el sesultado es "+resultado);
                
                     break;
            case 6:  
                     break;
            
        }
        
        
       
    }
    
}
