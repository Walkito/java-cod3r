package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		double media = 3.6;
		String resultadoRecuperacao = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultado = media >= 7.0 ? "Aprovado": resultadoRecuperacao;
		
		System.out.println("O aluno está " + resultado);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto ? "sim" : "não";
		
		System.out.println("Tem desconto?" + resultadoFinal);
	}
}
