package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
	
		Civic c2 = new Civic();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.freiar();
		
		System.out.println(c2.velocidadeAtual);
		
		Ferrari c3 = new Ferrari(400);
		c3.ligarTurbo();
		c3.ligarAr();
		c3.desligarAr();
		
		System.out.println(c3.velocidadeDoAr());
		
		c3.acelerar();
		System.out.println(c3.velocidadeAtual);
		c3.acelerar();
		System.out.println(c3.velocidadeAtual);
		c3.acelerar();
		System.out.println(c3.velocidadeAtual);
		//c3.desligarTurbo();
		c3.acelerar();
		System.out.println(c3.velocidadeAtual);		
		c3.freiar();
		System.out.println(c3.velocidadeAtual);
		
		
		
	}
}
