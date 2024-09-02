package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data data1 = new Data(24,01,2022);
		Data data2 = new Data();
		
		//data1.ano = 2022;
		//data1.mes = 01;
		//data1.dia = 24;
		
		//data2.ano = 2021;
		//data2.mes = 12;
		//data2.dia = 07;
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		data1.imprimirDataFormatada();
		
	}
}
