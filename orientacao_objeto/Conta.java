
public class Conta {
	double saldo;
	int agencia;
	int numero;
	int cpf;
	String titular;
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;		
	}
}
