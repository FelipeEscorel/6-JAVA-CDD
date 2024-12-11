package Heranca;

public class Professor extends Pessoa {
	double salario; 
	
	public Professor(){
		
	}
	
	public Professor(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}
	
		public void aplicarProva() {
			System.out.printf("O professor %s aplicou a prova.\n", nome);
		}
		
		public void certificar() {
			System.out.printf("O professor %s certificou o aluno.\n", nome);
		}
}

