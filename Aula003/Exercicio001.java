package Aula003;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		int alunos, cont = 0;
		double nota, notaTotal = 0, media;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos tem na sua sala?");
		alunos = sc.nextInt();
		System.out.println("\nDigite as notas dos alunos: ");
		
		while (cont < alunos) {
			nota = sc.nextDouble();
			notaTotal = notaTotal + nota;
			++cont;
		}		
		
		media = notaTotal / alunos;
		System.out.printf("A média de todas as notas é %.2f.", media);
	}

}
