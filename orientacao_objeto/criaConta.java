
public class criaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 123456;
		primeiraConta.cpf = 03612312310;
		primeiraConta.numero = 155;
		primeiraConta.saldo = 200;
		primeiraConta.titular = "Lucas V.";
		
		Conta segundaConta = new Conta();
		segundaConta.agencia = 223456;
		segundaConta.cpf = 03612312311;
		segundaConta.numero = 256;
		segundaConta.saldo = 300;
		segundaConta.titular = "Bruna V.";
		
		Conta terceiraConta = new Conta();
		terceiraConta.agencia = 323456;
		terceiraConta.cpf = 03612312312;
		terceiraConta.numero = 357;
		terceiraConta.saldo = 400;
		terceiraConta.titular = "Luiza V.";
		
		primeiraConta.depositar(900);
		System.out.println(primeiraConta.saldo);
		segundaConta.sacar(150);
		System.out.println(segundaConta.saldo);
		terceiraConta.transferir(200, segundaConta);
		System.out.println(segundaConta.saldo);
		System.out.println(terceiraConta.saldo);
	}
}
