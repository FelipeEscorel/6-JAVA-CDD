package Aula001;

public class Exercicio005 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 7;
		
		if (a++ >= b)
			System.out.println(--c);
		else
			System.out.println(c++); //Acrescenta depois
	}

}
