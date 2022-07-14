package POO;

public class Cachorro extends Animal{
	
	private String raça;
	private String corPelo;
	private String temperamento;
	
	//Método Construtor 
	
	public Cachorro(String nome, int idade, String raça, String corPelo, String temperamento) 
	{
		super(nome, idade);
		this.raça = raça;
		this.corPelo = corPelo;
		this.temperamento = temperamento;
	}

	// Métodos 
	
	@Override
	public String emitirSom()
	{
		return "Au au";
	}

	
	public String correr()
	{
		return "Correndo...";
	}
	
	
	public String getTemperamento() {
		return temperamento;
	}

	
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void imprimir()
	{
		System.out.println("O nome do cachorro é "+getNome());
		System.out.println("Sua idade é "+getIdade()+" anos");
		System.out.println("Sua raça é "+raça);
		System.out.println("A cor do seu pelo é "+corPelo);
		System.out.println("Seu temperamento é "+temperamento);
		
	}

	
	
}
