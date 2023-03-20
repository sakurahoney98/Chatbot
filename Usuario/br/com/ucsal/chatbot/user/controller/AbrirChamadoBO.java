package br.com.ucsal.chatbot.user.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.ucsal.chatbot.user.util.GeradorCodigoChamado;
import br.com.ucsal.chatbot.user.util.Validador;


public class AbrirChamadoBO{
	
	
	
	
	
	static DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
	static DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
	
	
	
	
	
	public static String abrirChamado(Connection conexao, String sala, int equipamento, String assunto, String descricao) throws SQLException  {
	
		int codigo = 0;
		Statement st;
		
					//Gerando automaticamente o número do chamado
					codigo = GeradorCodigoChamado.gerador(conexao);
					
					//Captaurando data e hora locais 
					String dataformato = LocalDateTime.now().format(data);
					String horaformato = LocalDateTime.now().format(hora);
					
					//Adicionando as informações no banco de dados
					st = conexao.createStatement();
					String comando = "INSERT INTO public.\"CHAMADO\"(\r\n"
							+ "	cod_chamado, assunto, descricao, cont_apoio, atualizacao_chamado, status_chamado, equipamento_chamado, atendente_chamado, sala_chamado, hora_abertura, data_abertura)\r\n"
							+ "	VALUES (" + codigo + ", '" + assunto + "', '"+ descricao +"', 0, null, 1, "+ equipamento +", null, '"+ sala +"', '"+ horaformato +"', '"+ dataformato +"');";
					st.executeUpdate(comando);
					
					
					
					return "A sua solicitação foi registrado com sucesso! Utilize o número " + codigo +" para acompanhar seu chamado.";
				
			
		}
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	


