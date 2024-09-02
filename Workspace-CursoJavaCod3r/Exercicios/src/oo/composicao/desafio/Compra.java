package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> listaItems = new ArrayList<>();
	
	Item puxadorItem;
	
	void adicionarItems(Item objItem) {
		listaItems.add(objItem);
	}
	
	double totalLista() {
		double totalCompras = 0;
		
		for(int i = 0; i < listaItems.size(); i++) {
			totalCompras = totalCompras + listaItems.get(i).totalItems; 
		}
	
		return totalCompras;
	}
}
