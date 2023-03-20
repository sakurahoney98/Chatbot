package br.com.ucsal.chatbot.user.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CancelarChamadoBO {
	
	public static void cancelarChamado(int codigo, Connection conexao) throws SQLException {
		
		//Alterando a coluna "status_chamado" da tabela CHAMADO do banco de dados
		Statement st = conexao.createStatement();
		String comando = "UPDATE public.\"CHAMADO\"\r\n"
				+ "	SET status_chamado = 4\r\n"
				+ "	WHERE cod_chamado = " + codigo;
		st.executeUpdate(comando);
	
}


}
