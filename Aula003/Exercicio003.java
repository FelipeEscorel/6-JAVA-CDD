package Aula003;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2;
		
		System.out.print("Digite o limite: ");
		num2 = sc.nextInt();
		
		while (num1 < num2) {
			++num1;			
			if (num1 % 2 == 1) {
				System.out.println(num1);				
			}
		}
		
	}

}