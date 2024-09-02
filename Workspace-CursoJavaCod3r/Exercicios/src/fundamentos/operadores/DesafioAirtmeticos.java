package fundamentos.operadores;

public class DesafioAirtmeticos {

	public static void main(String[] args) {
		int x = (int) Math.pow(6*(3+2), 2);
		int y = 3*2;
		
		int w = (int) Math.pow((1-5) * (2-7), 2);
		int z = 2;
		double resultado1 = x / y;
		double resultado2 = w / 2;
		int a = (int) Math.pow(10, 3);
		
		double resultado3 = Math.pow(resultado2 - resultado1, 3);
		
		double resultFinal = resultado3 / a;
		
		System.out.println(resultFinal);
	}
}
