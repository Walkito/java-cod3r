package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> listaCompras = new ArrayList<>();
	
	Compra compras;
	
	Cliente (String nome, Compra objCompra){
		this.nome = nome;
		listaCompras.add(objCompra);
	}

	double valorTotal() {
		double totalCliente = 0;
		
		for(int i = 0; i < listaCompras.size(); i++) {
			totalCliente = totalCliente + listaCompras.get(i).totalLista();
		}
		
		return totalCliente;
	}
}
