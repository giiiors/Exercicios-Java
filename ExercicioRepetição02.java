// 10 numbers; print how many are even and how many are odd

package pck;

import java.util.Scanner;

public class ExercicioRepetição02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, num;
	
		
		System.out.println("\nPor favor, insira 10 números inteiros: ");
		Scanner leia = new Scanner(System.in);
		
		n1=leia.nextInt();
		n2=leia.nextInt();
		n3=leia.nextInt();
		n4=leia.nextInt();
		n5=leia.nextInt();
		n6=leia.nextInt();
		n7=leia.nextInt();
		n8=leia.nextInt();
		n9=leia.nextInt();
		n10=leia.nextInt();
				
		
		num = (n1%2);
		if(num==0);{
			System.out.println("1 número par");
		}
				}

}
