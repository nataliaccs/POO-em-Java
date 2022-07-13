package POO;

public class Preguiça extends Animal {
	
	private String genero;
	private String especie;
	private String regiao;
	
	public void subir()
	{
		System.out.println("Subindo árvore...");
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getGenero() {
		return genero;
	}

	public String getEspecie() {
		return especie;
	}

	
	
}
