package POO;

public class TesteAnimal {

	public static void main(String[] args) {

		
		System.out.println();
		
		Cachorro dog = new Cachorro("Sam",6,"Labrador","Branco","Sanguíneo");
		dog.imprimir();;
		
		System.out.println();
		
		dog.setNome("Ted");
		dog.setIdade(3);
		dog.setRaça("Yorkshire terrier");
		dog.setTemperamento("Colérico");
		System.out.println("Este é o "+dog.getNome()+" ele tem "+dog.getIdade()+" anos de idade. É um ser muito "+dog.getTemperamento()+"!");
		dog.correr();
		
		
		
		
		
	}

}
