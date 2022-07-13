package POO;

public class Cachorro extends Animal{
	
	private String raça;
	private String corPelo;
	private String temperamento;

	
	public void correr()
	{
		System.out.println("Correndo...");
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

	
}
