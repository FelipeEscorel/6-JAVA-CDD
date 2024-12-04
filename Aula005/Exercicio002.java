package cddAula005;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto qualquer: ");
		StringTokenizer texto = new StringTokenizer (sc.nextLine());
		System.out.print("O número de palavras no texto é de: ");
		System.out.print(texto.countTokens());
		
		
	}

}
