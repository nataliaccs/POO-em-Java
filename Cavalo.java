package POO;

public class Cavalo extends Animal {
	
	private String raça;
	private String corPelo;
	private double altura;
	private double peso;
	
	
	public void correr()
	{
		System.out.println("Correndo...");
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}


	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
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


	public String getRaça() {
		return raça;
	}


	public String getCorPelo() {
		return corPelo;
	}


	public double getAltura() {
		return altura;
	}
	

}
