package POO;

public class Preguiça extends Animal {
	
	private String genero;
	private String especie;
	private String regiao;
	
	//Método Construtor 
	
	public Preguiça (String nome,int idade, String genero, String especie, String regiao)
	{
		super(nome,idade);
		this.genero = genero;
		this.especie = especie;
		this.regiao = regiao;
		
	}
	
	
	@Override
	public String emitirSom()
	{
		return "ZZzzZZZZzzzz";
	}
	
	
	public String subirArvore()
	{
		return "Subindo...";
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getRegiao() {
		return regiao;
	}


	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	

	
}
