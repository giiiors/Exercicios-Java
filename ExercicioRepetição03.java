package pck;

import java.util.Scanner;

public class ExercicioRepetição03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int mv=0, mc=0 ,idade;
		
		System.out.println("Digite sua idade");
		idade =leia.nextInt();
		
		while(idade!=-99)
		{
			if (idade<21) {
				 mv++;
			}
			    
			if (idade>50) {
				 mc++;
			}
			    
	        
		 System.out.println("Digite sua idade");
		 idade =leia.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos é: "+mv);
		System.out.println("Total de pessoas com mais de 50 anos é: "+mc);
	}

}
