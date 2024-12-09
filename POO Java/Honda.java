package Metodos;

public class Honda extends Carro {
	
	private String motor;
	
	public Honda() {
		
	}
	
	public Honda(String modelo) {
	super(modelo);
		}
	
	public Honda(String modelo, String cor) {
	super(modelo, cor);
		}
	
	public Honda(String modelo, String cor, double preco) {
	super(modelo, cor, preco);
		}
}

