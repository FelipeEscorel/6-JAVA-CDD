package Encapsulamento;

public class Zoo {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		a1.nome = "Neko";
		a1.tutor = "Felipe";
		a1.rg = "23.456.789";
		a1.raca = "Gato";
		a1.mesVersario = "02/07";
		a1.idade = 4;
		
		System.out.printf("Nome do animal: %s\nRaça: %s\nIdade: %d\nMêsversário: %s\nTutor: %s\nRG do Tutor: %s", a1.nome, a1.raca, a1.idade, a1.mesVersario, a1.tutor, a1.rg);

	}

}
