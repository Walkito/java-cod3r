package controle;

import java.util.Scanner;

public class SwitchComBreak {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			String conceito = "";
			System.out.println("Informe a nota");
			int nota = entrada.nextInt();
			
			switch(nota) {
			case 10: case 9:
				conceito = "A";
				break;
			case 8: case 7:
				conceito = "B";
				break;
			case 6: case 5:
				conceito = "B";
				break;
			case 4: case 3:
				conceito = "B";
				break;
			case 2: case 1: case 0:
				conceito = "E";
				break;
			default:
				conceito = "n�o informado!";
			}
			
			System.out.println("Coneito � " + conceito);
			entrada.close();
		}
}
