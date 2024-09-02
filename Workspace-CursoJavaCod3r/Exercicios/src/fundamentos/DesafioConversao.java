package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário:");
		String n1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salário:");
		String n2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salário:");
		String n3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(n1);
		double salario2 = Double.parseDouble(n1);
		double salario3 = Double.parseDouble(n1);
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A média dos salários é de:" + media);
		
		entrada.close();
	}
}
