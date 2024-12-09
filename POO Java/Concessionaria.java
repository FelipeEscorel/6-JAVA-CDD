package Metodos;

public class Concessionaria {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro("Ferrari");
		Carro c3 = new Carro("Ferrari", "Vermelha");
		Carro c4 = new Carro("Ferrari", "Vermelha", 300000);		
		System.out.printf("O carro é uma %s de cor %s. Valor: R$%.2f\n", c4.modelo, c4.cor, c4.preco);
		
		Honda h1 = new Honda();
		Honda h2 = new Honda("Civic");
		Honda h3 = new Honda("Civic", "Preto");
		Honda h4 = new Honda("Civic", "Preto", 80000);
		System.out.printf("O carro é uma %s de cor %s. Valor: R$%.2f\n", h4.modelo, h4.cor, h4.preco);
		
		c1.ligar();
		c1.ligar();
		c1.desligar();
		c1.desligar();
	}

}
