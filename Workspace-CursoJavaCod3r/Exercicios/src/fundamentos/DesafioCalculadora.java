package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		
		System.out.println("Digite um numero:");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		System.out.println("Digite o simbolo da operação:");
		String simbolo = entrada.next();
		
		double resultado = "+".equals(simbolo) ? num1 + num2 : 0;
		resultado = "-".equals(simbolo) ? num1 - num2 : resultado;
		resultado = "*".equals(simbolo) ? num1 * num2 : resultado;
		resultado = "/".equals(simbolo) ? num1 / num2 : resultado;
		resultado = "%".equals(simbolo) ? num1 % num2 : resultado;
		
		System.out.println(resultado);
 		
		
		entrada.close();
	}
}
