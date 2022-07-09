package pck;

import java.util.Scanner;

public class ExercicioDecisao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercise 01: 3 whole numbers; which one is bigger;
		int n1, n2, n3, maiorNumero;
		
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite um número: ");
			n1=leia.nextInt();
					
			System.out.println("\nDigite um número: ");
			n2=leia.nextInt();
			
			System.out.println("\nDigite um número: ");
			n3=leia.nextInt();
			
			if(n1 > n2 && n1 > n3)
				
			System.out.println(n1 + " é o maior número");
			
			else if (n2 > n3 && n2 > n1)
				
			System.out.println(n2 + " é o maior número");
			
			else 
				
			System.out.println(n3 + " é o maior número");
			
			}
	
	}
