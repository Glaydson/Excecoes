package banco;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(int numero) {
		super("A conta " + numero + " não possui saldo suficiente");

	}

}
