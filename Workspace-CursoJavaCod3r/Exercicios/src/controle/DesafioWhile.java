package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float total = 0;
		float nota;
		int qtd = 0;
		float media;
		
		do {
			System.out.println("Digite uma nota válida: (Entre 0-10");
			nota = entrada.nextInt();
			if(nota >= 0 && nota <= 10) {
				qtd++;
				total = total + nota;
			}
		} while(nota != -1);
		
		media = total / qtd;
		
		System.out.println("A media é de" + media);
		
		entrada.close();
	}
}
