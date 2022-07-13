package POO;

public class TesteAnimal {

	public static void main(String[] args) {

		Animal borboleta = new Animal();
		
		
		borboleta.setNome("Flora");
		System.out.println("O nome da borboleta é "+borboleta.getNome());
		
		System.out.println();
		
		Cachorro dog = new Cachorro();
		dog.setNome("Ted");
		dog.setIdade(3);
		dog.setRaça("Yorkshire terrier");
		dog.setTemperamento("amável");
		System.out.println("Este é o "+dog.getNome()+" ele tem "+dog.getIdade()+" anos de idade. É um ser muito "+dog.getTemperamento()+"!");
		dog.correr();
		
		System.out.println();
		
		Cavalo pot = new Cavalo();
		pot.emitirsom();
		pot.setCorPelo("marrom");
		pot.setAltura(1.80);
		System.out.println("Cor do pelo:"+pot.getCorPelo()+"\nAltura:"+pot.getAltura());
		
		
	}

}
