package bancoAluraHeranca;

public class Main {

	public static void main(String[] args) {
		Administrador adm1 = new Administrador();
		adm1.setSalario(5000);
		adm1.setSenha(4555);
		
		Gerente g1 = new Gerente();
		g1.setSalario(4000);
		g1.setSenha(2222);
		
		Designer d1 = new Designer();
		d1.setSalario(2000);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(ev1);
		controle.registra(d1);
		controle.registra(g1);
		controle.registra(adm1);
		System.out.println(controle.getSoma());
		
		Cliente cliente1 = new Cliente();
		cliente1.setSenha(2222);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(adm1);
		si.autentica(cliente1);
		
	}

}
