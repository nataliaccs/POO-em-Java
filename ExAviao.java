package POO;

public class ExAviao {

	public static void main(String[] args) 
	{
		
		System.out.println("Passageiro 1");
		System.out.println();
		Aviao pass1 = new Aviao ("LATAM Airlines","Primeira Classe","Brasil","Maldivas");
		System.out.println("Companhia aérea: "+pass1.getcompAerea());
		System.out.println("Tipo de passagem: "+pass1.getPassagem());
		System.out.println("Local de partida: "+pass1.getLocalPartida());
		System.out.println("Local de destino: "+pass1.getLocalDestino());
		
		System.out.println();
		
		System.out.println("Passageiro 2");
		System.out.println();
		Aviao pass2 = new Aviao ("Gol","Econômica","Recife","Fortaleza");
		System.out.println("Companhia aérea: "+pass2.getcompAerea());
		System.out.println("Tipo de passagem: "+pass2.getPassagem());
		System.out.println("Local de partida: "+pass2.getLocalPartida());
		System.out.println("Local de destino: "+pass2.getLocalDestino());
		
		
		
	}

}
