package Aula004;

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrayUm [] = new int [4];
		int arrayDois [] = new int [4];
		int arrayTres [] = new int [4];
		int arrayQuatro [] = new int [4];
		
	System.out.println("Digite os valores do ArrayUm: ");
		for (int a = 0; a < 4; a++) {
			arrayUm[a] = sc.nextInt();
		}	
	System.out.println("Digite os valores do ArrayDois: ");
		for (int a = 0; a < 4; a++) {
			arrayDois[a] = sc.nextInt();
		}
	System.out.println("Digite os valores do ArrayTres: ");
		for (int a = 0; a < 4; a++) {
			arrayTres[a] = sc.nextInt();
		}
	System.out.println("Digite os valores do ArrayQuatro: ");
		for (int a = 0; a < 4; a++) {
			arrayQuatro[a] = sc.nextInt();
		}
		
		for (int i : arrayUm)
			System.out.print(i + " ");
		System.out.println();
		for (int i : arrayDois)
			System.out.print(i + " ");
		System.out.println();
		for (int i : arrayTres)
			System.out.print(i + " ");
		System.out.println();
		for (int i : arrayQuatro)
			System.out.print(i + " ");
	}
}
