package Aula002;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		System.out.print("\nDigite a segunda nota: ");
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.printf("\nA média das notas %.1f e %.1f é de %.1f", nota1, nota2, media);

	}

}
