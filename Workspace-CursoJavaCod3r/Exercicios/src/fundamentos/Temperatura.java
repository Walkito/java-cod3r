package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (�F-32) * 5/9 = �C
		
		final double const1 = 32;
		final double const2 = 5.0/9.0;
		double F = 86;
		double C = (F-const1) * const2;
		
		System.out.println("O valor em Celsius eh de " + C + " �C.");
		
		F = 150;
		C = (F-const1) * const2;
		System.out.println("O valor em Celsius eh de " + C + " �C.");
		
	}
}
