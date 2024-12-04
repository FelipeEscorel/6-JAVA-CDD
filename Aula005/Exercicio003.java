package cddAula005;

public class Exercicio003 {

	public static void main(String[] args) {
		String texto1 = "Será que são iguais?";
		String texto2 = "Será que são iguais?";
		boolean resultado = texto1.equals(texto2);
		if (resultado == true) {
			System.out.println("Os textos são iguais!");
		}
		else {
			System.out.println("Os textos são diferentes!");
		}
	}

}
