package arrays;

import java.util.Scanner;

public class DesafioNotasAluno {

	public static void main(String[] args) {
		System.out.println("Quantas notas voc� deseja:");
		
		Scanner entrada = new Scanner(System.in);
		int qtd = entrada.nextInt();
		
		double notas[] = new double[qtd];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("\nDigite as notas: ");
			double nota = entrada.nextDouble();
			notas[i] = nota;
			System.out.print("\nNota " + notas[i] + " Adicionada");
		}
		
		double total = 0;
		
		for(double nota: notas) {
			total = total + nota;
		}
		
		double media = total / notas.length;
		System.out.println("A m�dia total das notas �: " + media);
		
		entrada.close();
	}
}
