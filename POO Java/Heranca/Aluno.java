package Heranca;

public class Aluno extends Pessoa {
	double nota;
	
	public Aluno(){
		
	}
	
	public Aluno(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}
	
		public void sofrer() {
			System.out.printf("O aluno %s está sofrendo...\n", nome);
		}

}
