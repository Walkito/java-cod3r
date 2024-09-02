package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
	// Obter a partir de um Scanner parte do nome de uma pessoa
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome desejado: ");
		String nomeDigitado = entrada.nextLine();
		
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + nomeDigitado + "%");
		
		ResultSet resultado = stmt.executeQuery();
		
		while(resultado.next()) {
			String nome = resultado.getString("nome");
			
			System.out.println(nome);
		}
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
