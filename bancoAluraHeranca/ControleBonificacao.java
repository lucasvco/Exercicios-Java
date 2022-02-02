package bancoAluraHeranca;

public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario func) {
	    double bonificacao = func.getBonus();
	    this.soma = this.soma + bonificacao;
	}

	public double getSoma() {
	    return this.soma;
	}

}
