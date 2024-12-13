package conta.model;

public class ContaCorrente extends Conta { // extends(herança)

	// Atributos / variaveis
	private float limite;

	/* Método Construtor ** ele tem que ter o mesmo nome da classe */
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero,agencia, tipo, titular, saldo); //Invocando o metodo construtor
		this.limite = limite;
		
	}

	// Polimorfismo de sobrecarga 
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) { //poliformismo 
		super(numero,agencia, tipo, titular, saldo);
		this.limite = 5000.0f; 
	} 

	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//Poliformismo de Sobrecrista  - > adiciona mais logica um codigo existente
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Limite de credito: " + this.limite);
	} 
	
	
	
	
}
