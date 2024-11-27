package Aula004;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double soma = 0, media;
		
		System.out.println("Quantos alunos possuem na sala?");
		int alunos = sc.nextInt();
		System.out.println("Digite as respectivas notas: ");
		for (int i = 0; i < alunos; i++) {
			double notas = sc.nextDouble();
			soma = soma + notas;		
		}
		media = soma / alunos;
		System.out.printf("A média das notas é de %.2f", media);
	}
}
