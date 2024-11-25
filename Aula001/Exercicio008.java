package Aula001;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		double num2 = sc.nextDouble();
		double calculo = num1 * num2;
		System.out.printf("O resultado da multiplicação dos dois números é %.2f", calculo);
		sc.close();
	}
}