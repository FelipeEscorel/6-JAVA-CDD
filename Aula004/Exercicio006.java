package Aula004;

public class Exercicio006 {

	public static void main(String[] args) {
		int x = 0, y = 0;
		for (int i = 1; i <= 20 ; i++) {
			if (i % 3 == 0) {
				x = x + i;
			}
			if (i % 5 == 0) {
				y = y + i;
			}			
		}
		int somaTotal = x + y; 
		System.out.printf("Soma dos múltipos de 3: %d", x);
		System.out.printf("\nSoma dos múltipos de 5: %d", y);
		System.out.printf("\nA soma total é %d", somaTotal);
	}
}
