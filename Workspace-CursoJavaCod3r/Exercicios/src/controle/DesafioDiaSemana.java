package controle;

import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("Ter�a")) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("S�bado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia inv�lido!");
		}
		
		entrada.close();
	}
	}