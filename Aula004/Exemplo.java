package Aula004;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o limite: ");
		int x = sc.nextInt();
				
		for (int i = 1; i <= x; i+= 2) {
			System.out.println(i);
		}
		sc.close();
	}
}
