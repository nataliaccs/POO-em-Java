package POO;

public class Cavalo extends Animal {
	
	private String raça;
	private String corPelo;
	private double altura;
	private double peso;
	
	// Método Construtor
	
	public Cavalo (String nome,int idade,String raça,String corPelo,double altura,double peso) 
	{
		super(nome,idade);
		this.raça = raça;
		this.corPelo = corPelo;
		this.altura = altura;
		this.peso = peso;
	
	}
	
	@Override
	public String emitirSom()
	{
		return "Relinchar...";
	}
	
	public String correr()
	{
		return "Galopando...";
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void imprimir()
	{
		System.out.println("O nome do cavalo é "+getNome());
		System.out.println("Sua idade é "+getIdade()+" anos");
		System.out.println("Sua raça é "+raça);
		System.out.println("A cor do seu pelo é "+corPelo);
		System.out.println("Sua altura é "+altura);
		System.out.println("Seu peso é "+peso);
		
	}
}
