package banco;

public class GerenciadorContas {

	public static void main(String[] args) {
		
		
		
		Conta c1 = new Conta(1, 1000);
		Conta c2 = new Conta(2, 400);
		Conta c3 = new Conta(3, 10);
		Conta c4 = new Conta(4, 100);

		Conta[] contas = new Conta[5];
		contas[0] = c1;
		contas[1] = c2;
		contas[2] = c3;
		contas[3] = c4;

		try {
			c1.debitar(500);
			c4.debitar(110);
			c4.debitar(50);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Transações encerradas");
		}

		for (Conta conta : contas) {
			
			try {
				System.out.println(conta.listar());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
