package br.com.ucsal.chatbot.user.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.ucsal.chatbot.user.model.Chamado;
import br.com.ucsal.chatbot.user.util.Validador;

public class PesquisarChamadoBO {
	
	
	
	public static Chamado pesquisarChamado(int codigo, Connection conexao) throws SQLException {
		
				//Capturando as informações de um único chamado
				Statement st = conexao.createStatement();
				String comando = "SELECT cod_chamado, assunto, descricao, cont_apoio,\r\n"
						+ "						descricao_status, nome_sala, hora_abertura, to_char(data_abertura,'DD/MM/YYYY'), status_chamado\r\n"
						+ "						from public.\"CHAMADO\" c\r\n"
						+ "						INNER JOIN public.\"STATUS\" s ON s.cod_status = c.status_chamado\r\n"
						+ "						INNER JOIN public.\"SALA\" sala ON sala.cod_sala = c.sala_chamado\r\n"
						+ "						WHERE cod_chamado = " + codigo;
				ResultSet resultado = st.executeQuery(comando);
				resultado.next();
				Statement st2 = conexao.createStatement();
				comando = "SELECT atendente_chamado FROM public.\"CHAMADO\" WHERE cod_chamado =  " + codigo;
				ResultSet r = st2.executeQuery(comando);
				r.next();
				String idAtendente = r.getString(1);
				
				
				
				if(idAtendente == null) {
					idAtendente = "Não atribuido";
				}else {
					comando = "SELECT nome_user, sobrenome_user FROM public.\"CHAMADO\" c "
							+ "INNER JOIN public.\"LOGIN\" l ON l.id_login = c.atendente_chamado "
							+ "WHERE atendente_chamado = '" + idAtendente +"'";
					ResultSet atendente = st2.executeQuery(comando);
					atendente.next();
					idAtendente = atendente.getString(1) + " " +atendente.getString(2);
				}
				Chamado c = new Chamado();
				
				c.setCod_chamado(resultado.getInt(1));
				c.setAssunto(resultado.getString(2));
				c.setDescricao(resultado.getString(3));
				c.setCont_apoio(resultado.getInt(4));
				c.setStatus(resultado.getString(5));
				c.setSala(resultado.getString(6));
				c.setHora_abertura(resultado.getString(7));
				c.setData_abertura(resultado.getString(8));
				c.setResponsavel(idAtendente);
				
				return c;
				
				
				
				
				
				
				
				
				
			
			
					
					
					
					
				
		
	}
	
	
}
