package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitios = 
				num -> num >= 100 && num <= 999;
				
		System.out.println(isPar.and(isTresDigitios).negate().test(123));
		System.out.println(isPar.or(isTresDigitios).test(123));
	}
}
