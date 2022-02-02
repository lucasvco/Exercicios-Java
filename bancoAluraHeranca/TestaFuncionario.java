package bancoAluraHeranca;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Jaime O.");
		f1.setCpf("777777777-77");
		f1.setSalario(3000);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		System.out.println(f1.getBonus());
	}

}
