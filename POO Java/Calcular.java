package Metodos;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora c1 = new Calculadora();
		
		double resp1 = c1.somar(4.5, 100.45, 1);
		System.out.println(resp1);
		
		double resp2 = c1.subtracao(10, 2, 2);
		System.out.println(resp2);
		
		double resp3 = c1.multiplicacao(10, 2, 2);
		System.out.println(resp3);
		
		double resp4 = c1.divisao(10, 2, 2);
		System.out.println(resp4);
	}

}
