package bancoAluraHeranca;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Augusta M.");
		g1.setCpf("888888888-88");
		g1.setSalario(5000);
		g1.setSenha(1985);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(2004));
		System.out.println(g1.getBonus());

	}

}
