package pck;

import java.util.Scanner;

public class ExercicioRepeti��o05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
	
		
		int x; 
		double soma=0;
		

		do
		{     
			System.out.println("Digite um n�mero");
		    x=leia.nextInt();
			soma = soma + x;
			
			
		}while(x!=0);
		
		System.out.printf("A soma total dos n�meros �: "+soma);
	}

}
