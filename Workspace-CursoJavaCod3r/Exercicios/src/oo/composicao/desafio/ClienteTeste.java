package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		Produto p1 = new Produto("Lápis",0.50);
		Produto p2 = new Produto("Chocolate",8.00);
		
		Item i1 = new Item(p1.nome, 90);
		Item i2 = new Item(p2.nome, 5);
		
		Compra c1 = new Compra();
		Compra c2 = new Compra();
		
		i1.calcularTotalItems(i1.quantidade, p1);
		i2.calcularTotalItems(i2.quantidade, p2);
		
		c1.adicionarItems(i1);
		c1.adicionarItems(i2);
		
		c2.adicionarItems(i2);
		
		Cliente cl1 = new Cliente("Walker", c1);
		Cliente cl2 = new Cliente("Leandro", c2);
		
		System.out.println(cl1.valorTotal());
		System.out.println(cl2.valorTotal());
		
	}
}
