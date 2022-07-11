package pck;

import java.util.Scanner;

public class ExercicioRepetição04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		int  idade, sexo, temperamento, p=0, pessoasc=0, mulheresn=0, homensa=0, outrosc=0 ,pessoasnmais40=0,pessoascmenos18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(p<3)
		{
			System.out.println("Digite a sua idade");
			idade=leia.nextInt();
			
			System.out.println("Digite 1-feminino / 2-masculino / 3-Outros para o seu sexo");
			sexo=leia.nextInt();
			
			System.out.println("Digite 1, se você é calma(o); 2, se você é nervoso(a) e 3, se você é agressivo(a)");
			temperamento=leia.nextInt();
			
			if(temperamento==1)
			{
				pessoasc++;
			}
			
			if(temperamento==2 && sexo==1)
			{
				mulheresn++;
			}
			if(temperamento==3 && sexo==2)
			{
				homensa++;
			}
			if(temperamento==1 && sexo==3)
			{
				outrosc++;
			}
			if(temperamento==2 && idade>40)
			{
				pessoasnmais40++;
			}
			if(temperamento==1 && idade<18)
			{
				pessoascmenos18++;
			}
			p++;
			
		}
		System.out.println("A quantidade de pessoas calmas é: "+pessoasc);
		System.out.println("A quantidade de mulheres nervosas é: "+mulheresn);
		System.out.println("A quantidade de homens agressivos é: "+homensa);
		System.out.println("A quantidade de outros calmos é: "+outrosc);
		System.out.println("A quantidade de pessoas nervosas com mais de 40 anos é: "+pessoasnmais40);
		System.out.println("A quantidade de pessoas calmas com menos de 18 anos é: "+pessoascmenos18);
	}

}
