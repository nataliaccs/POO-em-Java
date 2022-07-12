package POO;

public class Paciente {
	
	//Atributos da Classe
	
	private String nome;
	private int idade;
	private String endereço;
	private String serviço;
	
	//Método Construtor * não é obrigatório, pode ser necessário em casos específicos *
	
	public Paciente (String nome, int idade, String endereço, String serviço)
	{
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
		this.serviço = serviço;
	}


	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getServiço() {
		return serviço;
	}

	public void setServiço(String serviço) {
		this.serviço = serviço;
	}

	public String getNome() {
		return nome;
	}
	
	
		

}
