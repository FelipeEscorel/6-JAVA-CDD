package Metodos;

import java.util.Scanner;

public class UsoMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JavaMetodos j1 = new JavaMetodos();
		
		System.out.print("Digite seu ano de nascimento: ");
		int ano = sc.nextInt();
		System.out.println(j1.idade(ano));
		
		System.out.print("Digite o valor da sua hora trabalhada: ");
		double horaTrab = sc.nextDouble();
		System.out.print("Digite quantas horas você trabalhou: ");
		int horas = sc.nextInt();
		System.out.println(j1.valor(horaTrab, horas));
		
		
		String nome = j1.nome("Felipe");
		System.out.println(nome);
	}

}
