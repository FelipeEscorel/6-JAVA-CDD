package Aula002;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		int cont = 0;
		int opcao;
		Scanner sc = new Scanner(System.in);
			System.out.println("É O ASSASSINO? (Digite 1 para sim e qualquer outro valor pra não)?\n");
			
				System.out.print("Essa pessoa telefonou para vítima?");
				opcao = sc.nextInt();
				if (opcao == 1) {
					++cont;
				}
				System.out.print("Esteve no local do crime?");
				opcao = sc.nextInt();
				if (opcao == 1) {
					++cont;
				}
				System.out.print("Mora perto da vítima?");
				opcao = sc.nextInt();
				if (opcao == 1) {
					++cont;
				}
				System.out.print("Devia dinheiro para ela?");
				opcao = sc.nextInt();
				if (opcao == 1) {
					++cont;
				}
				System.out.print("Já trabalhou com a vítima?");
				opcao = sc.nextInt();
				if (opcao == 1) {
					++cont;
				}
		if (cont == 0 || cont == 1) {
			System.out.println("Essa pessoa é inocente");
		}else {
			if (cont == 2) {
				System.out.println("Essa pessoa é um suspeito.");
			}else {
				if (cont == 3 || cont == 4) {
					System.out.println("Essa pessoa é cumplice.");
				}else {
					if (cont == 5) {
						System.out.println("Essa é pessoa é a assassina!");
					}
				}
			}
		}
	}
}
