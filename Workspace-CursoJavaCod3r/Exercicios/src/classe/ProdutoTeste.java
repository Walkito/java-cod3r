package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto("Caneta Preta", 12.56);
		//p2.nome = "Caneta Preta";
		//p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//Caso queira alterar o desconto, s� chamar o m�todo.
		
		// p1.alterarDesconto(0.30);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
	
		
		System.out.println("O desconto aplicado � de: " + Produto.desconto);
		System.out.printf("\nM�dia do carrinho = R$%.2f.", mediaCarrinho);
	}
}
