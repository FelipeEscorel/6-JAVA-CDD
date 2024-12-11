package Heranca;

public class Escola {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Felipe", "00000000000", "81997413372");
		Professor p1 = new Professor("Wellington", "11111111111", "81988567890");
				
		p1.aplicarProva();
		a1.sofrer();
	}

}
