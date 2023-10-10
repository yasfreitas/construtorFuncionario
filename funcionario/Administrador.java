package funcionario;

public class Administrador extends Funcionario {
	private int cra;

	public Administrador(String nome, String matricula, double salario, String telefone, String endereco,
			String nascimento, int cra) {
		super(nome, matricula, salario, telefone, endereco, nascimento);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}

	public void setCra(int cra) {
		this.cra = cra;
	}
	
	

}
