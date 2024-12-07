package Metodos;

public class JavaMetodos {
	
	public int idade(int anoNascimento) {
		int idade = 2024 - anoNascimento;
		return idade;
	}
	public double valor(double valorHora, double horas) {
		double salario = valorHora * horas; 
		return salario;
	}
	public String nome(String valor) {
		return valor;
	}
	public boolean estado(int anos) {
		boolean resposta;
		if (anos > 3) {
			resposta = true;
		}
		else {
			resposta = false;
		}
		return true;
	}
}
