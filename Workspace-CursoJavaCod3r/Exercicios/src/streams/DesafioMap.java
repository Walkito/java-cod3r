package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> print2 = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7 ,8 ,9);
		
		/*
		 *  1. Número para string binário... 6 => "110"
		 *  2. Inverter a string... "110" => "011"
		 *  3. Converter de volta para inteiro = "011" = 3
		 */
				
		UnaryOperator<String> inverterString = s -> new StringBuilder(s).reverse().toString();
			
		Function<String, Integer> converterInteger = s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverterString)
			.map(converterInteger)
			.forEach(print2);
	}
}
