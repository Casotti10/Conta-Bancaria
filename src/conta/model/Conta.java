package conta.model;

public class Conta {

	// Atributos / variaveis
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	// Metodos(comportamentos) 
	// private - Somente a classe em que foi criada consegue ter acesso para modificar (celular pessoal)
	// protected - é protegido e pode ser chamado por todas as classes que compõe o pacote package(telefone residencial)
	// public - Um Método ou Atributo public poderá ser acessado por qualquer classe em qualquer pacote(orelhao)
	
	/*Método  da Classe Conta - com todos os parâmetros*/ 
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		
	//  This -> classe conta 
	//	Conta.numero = atributo 
	//	Numero = 6; 
	//	this.numero = 6;
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
 
		//METODOS
		//METODOS DE ACESSO 
	
	
	// Get - para pegar o preço
	public int getNumero() {
		return numero;
	}

	// Setter para alterar o preço
	public void setNumero(int numero) {
		this.numero = numero; 
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//METODOS 
	//METODOS DE ACESSO 
	
	


}

