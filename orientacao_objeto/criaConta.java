public class criaConta {
	public static void main(String[] args) {
		Cliente lucasV = new Cliente();
		lucasV.setNome("Lucas V.");
		lucasV.setCpf("111.111.111-11");
		lucasV.setEndereco("Taguatinga Norte");
		lucasV.setProfissao("Desenvolvedor");
		
		Cliente luizaV = new Cliente();
		luizaV.setNome("Luiza V.");
		luizaV.setCpf("222.222.222-22");
		luizaV.setEndereco("Taguatinga Sul");
		luizaV.setProfissao("Ambientalista");
		
		Cliente brunaV = new Cliente();
		brunaV.setNome("Bruna V.");
		brunaV.setCpf("333.333.333-33");
		brunaV.setEndereco("Taguatinga Centro");
		brunaV.setProfissao("Professora");
		
		
		Conta primeiraConta = new Conta();
		primeiraConta.setAgencia(123456);
		primeiraConta.setNumero(155);
		primeiraConta.setTitular(lucasV);
		
		Conta segundaConta = new Conta();
		segundaConta.setAgencia(223456);
		segundaConta.setNumero(255);
		segundaConta.setTitular(brunaV);
		
		Conta terceiraConta = new Conta();
		terceiraConta.setAgencia(323456);
		terceiraConta.setNumero(355);
		terceiraConta.setTitular(luizaV);
		

		primeiraConta.depositar(900);
		System.out.println(primeiraConta.getSaldo());
		
		segundaConta.depositar(400);
		segundaConta.sacar(150);
		System.out.println(segundaConta.getSaldo());
		
		terceiraConta.depositar(1000);
		terceiraConta.transferir(200, segundaConta);
		System.out.println(segundaConta.getSaldo());
		
		System.out.println(terceiraConta.getSaldo());
		
		System.out.println(terceiraConta.getTitular().getEndereco());
		
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		System.out.println(segundaConta.getAgencia());
		System.out.println(segundaConta.getNumero());
		System.out.println(terceiraConta.getAgencia());
		System.out.println(terceiraConta.getNumero());
		
		System.out.println(primeiraConta.getTitular().getNome());
	}
}
