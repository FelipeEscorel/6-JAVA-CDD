package Aula005;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto: ");
		String texto = sc.nextLine();
		String resultado = texto.toUpperCase();
		System.out.println(resultado);

	}

}
