package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean casa = !sorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		
		System.out.println("Tomaram sorvete\"? " + sorvete);
		
		System.out.println("Ficaram em casa\"? " + casa);
		
		
		
		
	}
}
