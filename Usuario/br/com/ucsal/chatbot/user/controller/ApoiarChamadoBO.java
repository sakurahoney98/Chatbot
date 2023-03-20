package br.com.ucsal.chatbot.user.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import br.com.ucsal.chatbot.user.exception.ChamadoNaoExiste;


public class ApoiarChamadoBO {
	
	
	public static void apoiarChamado(int codigo, Connection conexao) throws SQLException {
		
			//Incrementando a coluna "cont_apoio" da tabela CHAMADO do banco de dados
			Statement st = conexao.createStatement();
			String comando = "UPDATE public.\"CHAMADO\"\r\n"
					+ "	SET cont_apoio = cont_apoio + 1\r\n"
					+ "	WHERE cod_chamado = " + codigo;
			st.executeUpdate(comando);
		
	}
	

}
