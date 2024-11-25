package Aula002;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		int diaSemana = sc.nextInt();
		sc.close();
		String nomeDia;
		
		switch(diaSemana) {
			case 1:
				nomeDia = "Domingo";
				break;
			case 2:
				nomeDia = "Segunda-Feira";
				break;
			case 3:
				nomeDia = "Terça-Feira";
				break;
			case 4: 
				nomeDia = "Quarta-Feira";
				break;
			case 5:
				nomeDia = "Quinta-Feira";
				break;
			case 6:
				nomeDia = "Sexta-Feira";
				break;
			case 7:
				nomeDia = "Sábado";
				break;
			default:
				nomeDia = "Dia da semana inválido";
				
	}
		System.out.printf("\nO dia %d da semana é %s.", diaSemana, nomeDia );

	}
}
