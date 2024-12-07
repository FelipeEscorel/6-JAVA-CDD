package Aula001;

public class Pessoa {
	String nome, endereco;
	int idade;
	
	public void dormir() {
		System.out.printf("%s foi dormir.\n", nome);		
	}
	
	public void comer(String comida) {
		System.out.printf("%s foi comer %s.\n", nome, comida);
	}
	
	public void apresentar() {
		System.out.printf("Me chamo %s, tenho %d anos e moro na rua %s\n", nome, idade, endereco);
	}
}
