package Aula001;

public class Shopping {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Felipe";
		p1.nome = "Caio";
		
		p2.idade = 23;
		p1.idade = 19;
		
		p2.endereco = "Rua Humberto Pimentel Costa";
		p1.endereco = "Rua Humberto Pimentel Costa";
		
		p1.comer("Laranja");
		p2.comer("Laranja");
		
		p1.dormir();
		p2.dormir();
		
		p1.apresentar();
		p2.apresentar();
	}

}
