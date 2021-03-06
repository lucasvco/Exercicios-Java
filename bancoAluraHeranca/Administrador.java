package bancoAluraHeranca;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;
    
	@Override
	public double getBonus() {
		System.out.println("Bonus Administrador");
		return 500;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
	}

}
