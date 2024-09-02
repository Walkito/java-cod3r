package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		String sql2 = "SELECT * FROM pessoas";
		
		PreparedStatement stmt = conexao.prepareStatement(sql2);
		ResultSet resultado = stmt.executeQuery(sql2);
		
		System.out.println("Os registros já¡ existentes são: \n");
		while(resultado.next()) {
			int codigo1 = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			System.out.println(codigo1 + " ------ " + nome);
		}
		
		System.out.println("\nDigite o novo valor para o registro:");
		String novoNome = entrada.nextLine();
		
		System.out.println("\nDigite o código do registro em que deseja realizar a alteração:");
		int codigo = entrada.nextInt();
		
				
		stmt = conexao.prepareStatement(sql);
		stmt.setString(1, novoNome);
		stmt.setInt(2, codigo);
		stmt.executeUpdate();
		
		resultado = stmt.executeQuery(sql2);
		while(resultado.next()) {
			int codigo1 = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			System.out.println(codigo1 + " ------ " + nome);
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
		
	}
}
