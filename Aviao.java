package POO;

public class Aviao {
	
	//Atributos da Classe
	
	private String compAerea;
	private String passagem;
	private String localPartida;
	private String localDestino;
	
	
	//Método Construtor * não é obrigatório, pode ser necessário em casos específicos *
	
	public Aviao (String compAerea,String passagem,String localPartida,String localDestino)
	{
		this.compAerea = compAerea;
		this.passagem = passagem;
		this.localPartida = localPartida;
		this.localDestino = localDestino;
		
	}
	
	// MÉTODOS ACACESSORES->GETS E MODIFICADORES->SETS
	
	public String getcompAerea()
	{
		return compAerea;
	}
	
	public void setcompAerea(String compAerea) {
		this.compAerea = compAerea;
	}

	public String getPassagem() {
		return passagem;
	}

	public void setPassagem(String passagem) {
		this.passagem = passagem;
	}

	public String getLocalPartida() {
		return localPartida;
	}

	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}
	

}
