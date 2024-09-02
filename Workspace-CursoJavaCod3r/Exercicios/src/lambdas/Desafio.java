package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("IPad", 3235.89, 0.13);
		
		/* 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		// Passo 1
		BinaryOperator<Double> precoReal = (preco, desconto) 
				-> preco - (preco * desconto);
		System.out.println("1. O Preco real eh de: " + precoReal.apply(p.preco, p.desconto));
		
		// Passo 2
		final double impostoMunicipal = 0.085;
		
		BiFunction<Double, Double, Double> precoImposto = (preco, imposto)
				-> preco >= 2500 ? (preco*imposto) + preco : preco;
		System.out.println("2. O Preco com imposto eh de: " + 
				precoImposto.apply(precoReal.apply(p.preco, p.desconto), impostoMunicipal));
		
		// Passo 3
		
		UnaryOperator<Double> precoFrete = (preco) 
				-> preco >= 3000 ? preco + 100 : preco + 50;
		System.out.println("3. O Preco total com frete eh de: " + precoFrete.apply(precoImposto
				.apply(precoReal.apply(p.preco, p.desconto), impostoMunicipal)));
		
		// Passo 4
		
		UnaryOperator<Double> precoArredondado = (preco)
				-> Math.round(preco * 100.0)/100.0;
		System.out.println("4. O Preco arredondado eh de: " + 
				precoArredondado.apply(precoFrete.apply(precoImposto.apply
						(precoReal.apply(p.preco, p.desconto), impostoMunicipal))));
		
		// Passo 5
		
		Function<Double, String> precoFormatado = (preco) -> {
			String precoVirgula = String.valueOf(preco).replace(".", ",");
			return "R$" + precoVirgula;
		};
		System.out.println("5. O Preco formatado eh de: " +
				precoFormatado.apply(precoArredondado.apply(precoFrete.apply(precoImposto.apply
						(precoReal.apply(p.preco, p.desconto), impostoMunicipal)))));
	}
}
