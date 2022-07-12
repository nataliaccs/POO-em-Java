package POO;

public class ExPaciente {

	public static void main(String[] args) {
		
	
	System.out.println("Dados do paciente 1");
	System.out.println();
	
	Paciente pac1 = new Paciente ("Maria Luiza da Silva",21,"Rua, 20 de Março","Consulta médica");
	System.out.println("Nome: "+pac1.getNome());
	System.out.println("Idade: "+pac1.getIdade()+" anos");
	System.out.println("Endereço: "+pac1.getEndereço());
	System.out.println("Tipo de serviço: "+pac1.getServiço());
	
	}

}
