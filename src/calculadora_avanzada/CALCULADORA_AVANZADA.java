/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora_avanzada;

/**
 *
 * @author vesprada
 */
public class CALCULADORA_AVANZADA {

    /**
     * @param args the command line arguments
     */
    /*
 * calculadora01.java
 */

import java.util.Scanner;
	
	public static void main (String args[]) {
		Scanner introducir;
		introducir=new Scanner(System.in);
		
		int a,b;
		String op;
		
		System.out.print("Introduce el primer numero: ");
		a=introducir.nextInt();
		
		System.out.print("Introduce el operador: ");
		op=introducir.nextLine(); // este absorbe el intro
		op=introducir.nextLine(); // este absorbe el operador
		
		switch(op){
			case "+":
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("suma= "+(a+b));
				break;
			case "-":
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("resta= "+(a-b));
				break;
			
			case "*":
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("mult= "+(a*b));
				break;
						
			case "/":
				double aa, bb;
				aa= (double)a;
				do{
					System.out.print("Introduce el segundo numero: ");
					bb=introducir.nextInt();
					if(bb!=0) System.out.print("division= "+(aa/bb)+"\n");
					else System.out.println("Vuelve a introducir");
					}while(bb==0);
				break;
			default: System.out.print("Has introducido mal el operador!");
			}
	}
}
