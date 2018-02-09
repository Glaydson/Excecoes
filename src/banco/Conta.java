package banco;

public class Conta {

	private int numero;
	private double saldo;

	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.saldo = saldo + valor;
		System.out.println("Cr�dito de " + valor + " efetuado na conta " + this.numero);
	}
	
	public void debitar(double valor) throws SaldoInsuficienteException {
		if (this.saldo >= valor) {
			this.saldo = saldo - valor;
			System.out.println("D�bito de " + valor + " efetuado na conta " + this.numero);
		} else {
			// Lan�ar uma exce��o
			throw new SaldoInsuficienteException(this.numero);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String listar() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}

}
