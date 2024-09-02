package oo.composicao.desafio;

public class Item {
	
	int quantidade;
	double totalItems;
	
	Produto produto;
	
	Item (String nomeProduto, int quantidade){
		this.quantidade = quantidade;
	}
	
	double calcularTotalItems(int quantidade, Produto objProduto) {
		totalItems = quantidade * objProduto.precoProduto;
		
		return totalItems;
	}
	
}
