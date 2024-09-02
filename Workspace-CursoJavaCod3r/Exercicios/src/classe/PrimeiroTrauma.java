package classe;

public class PrimeiroTrauma {
	
	int a= 3; // não pode mexer aqui!
	static int c = 4;
	
	public static void main(String[] args) {
		//pode mexer aqui
		
		PrimeiroTrauma b = new PrimeiroTrauma();
		
		System.out.println(b.a);
		
		System.out.println(c);
	}
}
