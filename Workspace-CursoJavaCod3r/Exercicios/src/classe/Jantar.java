package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida comida1 = new Comida("Feij�o", 2.50);
		Comida comida2 = new Comida("Carne", 4.50);
		Pessoa pessoa1 = new Pessoa("Walker", 102);
		
		System.out.println("O peso antes � de: " + pessoa1.peso);		

		pessoa1.comer(comida1);
		pessoa1.comer(comida2);
		
		System.out.println("O peso ap�s � de: " + pessoa1.peso);
	}
}
