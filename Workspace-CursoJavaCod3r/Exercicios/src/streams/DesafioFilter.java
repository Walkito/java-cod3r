package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	/* 1. Duas Expressoes Lambdas com dois filtros diferentes
	 * 2. Map no final
	 */
	
	public static void main(String[] args) {
		DesafioFilterPaciente p1 = new DesafioFilterPaciente("Afonso", 68, true);
		DesafioFilterPaciente p2 = new DesafioFilterPaciente("Guilherme", 12, true);
		DesafioFilterPaciente p3 = new DesafioFilterPaciente("Astolfo", 85, false);
		DesafioFilterPaciente p4 = new DesafioFilterPaciente("Leandro", 34, true);
		DesafioFilterPaciente p5 = new DesafioFilterPaciente("Sabrina", 74, true);
		DesafioFilterPaciente p6 = new DesafioFilterPaciente("Leonardo", 58, false);
		
		List<DesafioFilterPaciente> pacientes = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<DesafioFilterPaciente> verificaIdade = p -> p.idade >= 60;
		Predicate<DesafioFilterPaciente> verificaEmergencia = p -> p.emergencia;
		
		Function<DesafioFilterPaciente, String> status = s -> s.nome + " Caso de emergência!!";
		
		pacientes.stream()
				.filter(verificaIdade)
				.filter(verificaEmergencia)
				.map(status)
				.forEach(System.out::println);
	}
}
