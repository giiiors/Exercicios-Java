package pck;

import java.util.Scanner;

public class ExercicioRepeti��o06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
		
		int n,soma=0;
		float media=0, contador=0;
		
		
		do
		{System.out.println("Digite um n�mero");
		n=leia.nextInt();
		    if(n%3==0 && n!=0)
			{
		    	
				soma = soma + n;// soma = soma + 3
				//0 = 0 + 3
				//soma= 0 + 3
			    //soma= 3 + 6
			    //soma = 9 + 0
			    //9 
				contador++;
			
		    }
		  media= soma/contador;

				
		}
		
		while (n!=0);
		
			System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: "+media);
		
	}

}
