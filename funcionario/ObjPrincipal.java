package funcionario;

public class ObjPrincipal {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario("adilson","728949",2300.5,"(11)99534-5249","rua céu azul, número 300","23/10/1987");
		System.out.println("Funcionario: "+ fun.getNome());
		System.out.println("Matrícula: "+ fun.getMatricula());
		System.out.println("Salário: "+ fun.getSalario());
		System.out.println("Telefone: "+ fun.getTelefone());
		System.out.println("Endereço: "+ fun.getEndereco());
		System.out.println("Data de nascimento: "+ fun.getNascimento());
		
		Administrador ad = new Administrador("Beatriz","90123",2700.5,"(11)99534-1630","rua céu azul, número 307","23/10/1987",6283);
		System.out.println("---------------------------------");
		System.out.println("Funcionario: "+ ad.getNome());
		System.out.println("Matrícula: "+ ad.getMatricula());
		System.out.println("Salário: "+ ad.getSalario());
		System.out.println("Telefone: "+ ad.getTelefone());
		System.out.println("Endereço: "+ ad.getEndereco());
		System.out.println("Data de nascimento: "+ ad.getNascimento());
		System.out.println("Cra: "+ ad.getCra());
		
		Engenheiro en = new Engenheiro ("osvaldo","728949",3300.5,"(11)99534-2387","rua céu azul, número 380","23/10/1987",3471);
		System.out.println("----------------------------------");
		System.out.println("Funcionario: "+ en.getNome());
		System.out.println("Matrícula: "+ en.getMatricula());
		System.out.println("Salário: "+ en.getSalario());
		System.out.println("Telefone: "+ en.getTelefone());
		System.out.println("Endereço: "+ en.getEndereco());
		System.out.println("Data de nascimento: "+ en.getNascimento());
		System.out.println("Cra: "+ en.getNumCrea());
		
		Medico med = new Medico("luciana","728949",5300.5,"(11)99534-1989","rua céu azul, número 450","23/10/1987",64729);
		System.out.println("----------------------------------");
		System.out.println("Funcionario: "+ med.getNome());
		System.out.println("Matrícula: "+ med.getMatricula());
		System.out.println("Salário: "+ med.getSalario());
		System.out.println("Telefone: "+ med.getTelefone());
		System.out.println("Endereço: "+ med.getEndereco());
		System.out.println("Data de nascimento: "+ med.getNascimento());
		System.out.println("Cra: "+ med.getCrm());

	}

}
