package funcionario;

public class Medico extends Funcionario{
	private int crm;

	public Medico(String nome, String matricula, double salario, String telefone, String endereco, String nascimento,
			int crm) {
		super(nome, matricula, salario, telefone, endereco, nascimento);
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	

}
