package Aula002;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		char genero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 'F' para feminino ou 'M' para masculino: ");
		genero = sc.next().charAt(0);
		
		if (genero == 'f' || genero == 'F') {
			System.out.println("Molier");
		}
		else {
			if (genero == 'm' || genero == 'M') {
				System.out.println("Homi");
			}else {
				System.out.println("Pode não man");
			}
		}

	}

}
