package br.com.ucsal.chatbot.user.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GeradorCodigoChamado {
	
	/*
	 * Gerar c�digo do chamado dinamicamente.
	 * � capturado o �ltimo c�digo de chamado aberto, somado mais 1 e gerado
	 * o novo c�digo de chamado.
	 * */
	public static int gerador(Connection conexao) throws SQLException {
		Statement st = conexao.createStatement();
		String comando = "select MAX(cod_chamado) from public.\"CHAMADO\"";
		ResultSet resultado = st.executeQuery(comando);
		resultado.next();
		
		//Se n�o houver nenhum chamado no banco de dados
		if(resultado.getInt(1) == 0) {
			return 1000;
		}else
			//Se houver pelo menos um chamado no banco de dados
			return resultado.getInt(1) + 1;
		
		
		
	}

}
