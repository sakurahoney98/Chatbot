package br.com.ucsal.chatbot.user.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.ucsal.chatbot.user.model.Chamado;
import br.com.ucsal.chatbot.user.model.Equipamento;

public class Gerador {
	
	/*
	 * Nem todos os equipamentos cadastrados no banco de dados estão presentes nas salas do tipo "Sala".
	 * Por isso é importante formatar os dados para que mediante a sala, 
	 * o usuário só possa escolher o equipamento que de fato exista naquela 
	 * sala.
	 * Para isso é gerado um array apenas com equipamentos especificos para salas do tipo "LAMI" e "Sala de Aula".
	 * */
	public static ArrayList<Equipamento> arrayEquipamentos(Connection conexao, String sala) throws SQLException {
		
		
		int tamanho = 0;
		
		//Capturando o tipo de sala
		Statement st = conexao.createStatement();
		String captura = "SELECT tipo_sala from public.\"SALA\" WHERE cod_sala = '" + sala + "'";
		ResultSet resultado =  st.executeQuery(captura);
		
		
		
		
		
		
		Statement novo = conexao.createStatement();
		
		resultado.next();
		
		//Se o tipo de sala for "Sala de Aula"
		if (resultado.getInt(1) == 2) {
		
			captura = "SELECT cod_equipamento, nome_equipamento \r\n"
					+ "	FROM public.\"EQUIPAMENTO\"  WHERE sala = true ORDER BY nome_equipamento";
		}else {
			//Se o tipo de sala for "LAMI"
		 captura = "SELECT cod_equipamento, nome_equipamento\r\n"
				+ "	FROM public.\"EQUIPAMENTO\" ORDER BY nome_equipamento";
		}
		resultado = novo.executeQuery(captura);
		
		
		
	
		
		ArrayList <Equipamento> lista = new ArrayList<>();
		
		//Adicionando equipamentos no ArrayList com código e nome
		while(resultado.next()) {
			lista.add(new Equipamento(resultado.getString(2), resultado.getInt(1)));
		}
		
		return lista;
	}
	
	
	/*Converter ArrayList em vetor apenas com o nome do equipamento
	 * Importante fazer isso para que a lista de equipamentos possa 
	 * ser exibido na tela "Tela_Equipamentos"
	 * */
	public static String [] vetorEquipamentos(ArrayList<Equipamento> equipamentos) {
		String [] listaAux = new String [equipamentos.size()];
	        	
	        	for (int i = 0; i < equipamentos.size(); i++) {
	        		listaAux[i] = equipamentos.get(i).getNome();
	        	}    
	        	
	        	
	        	return listaAux;
	}
	

	/*Criando um ArrayList com todos os chamados que um determinada 
	 * sala possui
	 * */
	public static ArrayList<Chamado> arrayChamados(Connection conexao, String sala) throws SQLException {
		
		
		Statement st = conexao.createStatement();
		String captura = "SELECT cod_chamado, assunto from public.\"CHAMADO\" WHERE sala_chamado = '" + sala + "' ORDER BY cod_chamado";
		ResultSet resultado =  st.executeQuery(captura);
	
		ArrayList <Chamado> lista = new ArrayList<>();
		
		//Armazenando apenas código e titulo do chamado
		while(resultado.next()) {
			Chamado c = new Chamado();
			c.setAssunto(resultado.getString(2));
			c.setCod_chamado(resultado.getInt(1));
			lista.add(c);
		}
		
		return lista;
	}

	/*
	 * Capturando todos os chamados ABERTOS que contemplem determinada sala e 
	 * determinado equipamento.
	 * Em caso de abertura de chamado semelhante, quando um sala já tem
	 * um chamado aberto para o mesmo tipo de equipamento, esse metódo
	 * é invocado para que o usuário possa penas apoiar a resolução
	 * do chamado e não criar um novo
	 * */

	public static ArrayList<Chamado> arrayChamados(Connection conexao, String sala, int equipamento) throws SQLException {
	
	
	Statement st = conexao.createStatement();
	String captura = "SELECT cod_chamado, assunto from public.\"CHAMADO\" WHERE sala_chamado = '" + sala + "' and equipamento_chamado = " + equipamento + " and status_chamado != 3 and status_chamado != 4  ORDER BY cod_chamado";
	ResultSet resultado =  st.executeQuery(captura);

	ArrayList <Chamado> lista = new ArrayList<>();
	
	//Armazenando apenas código e titulo do chamado
	while(resultado.next()) {
		Chamado c = new Chamado();
		c.setAssunto(resultado.getString(2));
		c.setCod_chamado(resultado.getInt(1));
		lista.add(c);
	}
	
	return lista;
}
	
	/*Converter ArrayList em vetor apenas com o código e título do chamado
	 * Importante fazer isso para que a lista de chamados possa 
	 * ser exibido na tela "Tela_ListaChamados"
	 * */
	public static String [] vetorChamados(ArrayList<Chamado> chamado) {
		String [] listaAux = new String [chamado.size()];
	        	
	        	for (int i = 0; i < chamado.size(); i++) {
	        		listaAux[i] = chamado.get(i).getCod_chamado() + " - " + chamado.get(i).getAssunto();
	        	}    
	        	
	        	
	        	return listaAux;
	}
	
	

}
