package Metodos;

public class Carro {
	String modelo, cor;
	double preco;
	boolean ligado, acelerando;
	public Carro() {
		
	}
	
	public Carro(String modelo1) {
		this.modelo = modelo1;
		
	}
	
	public Carro(String modelo1, String cor1) {
		this.modelo = modelo1;
		this.cor = cor1;
		
	}
	
	public Carro(String modelo1, String cor1, double preco1) {
		this.modelo = modelo1;
		this.cor = cor1;
		this.preco = preco1;
		this.ligado = false;
		this.acelerando = false;
	}
	
		public void ligar() {
			if (this.ligado == false) {
				System.out.println("O carro ligou!");
				this.ligado = true;
			}
			if (this.ligado == true) {
				System.out.println("O carro já está ligado!");
			}
			
		}
		
		public void desligar() {
			if (this.ligado == true) {
				System.out.println("O carro desligou!");
				this.ligado = false;
			}
			if (this.ligado == false) {
				System.out.println("O carro já está desligado!");
			}
			
		}
		
		public void acelerar() {
			if (this.ligado == true) {
				System.out.println("O carro está acelerando!");
				this.acelerando = true;
			}
			System.out.println("O carro está acelerando!");
		}
		
		public void frear() {
			System.out.println("O carro está freando!");
		}
}
