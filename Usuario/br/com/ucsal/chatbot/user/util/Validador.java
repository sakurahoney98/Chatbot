package br.com.ucsal.chatbot.user.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.ucsal.chatbot.user.exception.CampoObrigatorioVazio;
import br.com.ucsal.chatbot.user.exception.ChamadoNaoExiste;
import br.com.ucsal.chatbot.user.exception.ChamadoSemelhante;
import br.com.ucsal.chatbot.user.exception.SalaNaoExiste;
import br.com.ucsal.chatbot.user.model.Chamado;

public class Validador {
	
	//Verificar se a sala existe no banco de dados
	public static boolean checarSala(String codigo, Connection conexao) throws SQLException {
	
	/*
	 * É realizada uma busca pela sala atráves do código informado 
	 * pelo usuário.
	 * Utilizada a função "COUNT" para saber a quantidade de resultados
	 * retornados.
	 * */
	Statement st = conexao.createStatement();
	String comando = "select count(cod_sala) from public.\"SALA\" WHERE cod_sala = '" + codigo + "'";
	ResultSet resultado = st.executeQuery(comando);
	resultado.next();
	
	//Se a quantidade de resultados for maior que 0 a sala existe
	if (resultado.getInt(1) > 0) {
			
			return true;
		} 
		else
			//Se for menor que 0 a sala não existe
			return false;
		
	}


	/*
	 * Esse metódo é invocado quando se quer verificar se um campo 
	 * obrigatório não foi preenchido
	 * */
	public static boolean campoVazio(String campo) {
		
		//Campo não foi preenchido
		if (campo.equals("")) {
		new CampoObrigatorioVazio();
		return false;
	} 
	else
	//Campo foi preenchido
	return true;
}


	/*
	 * Esse metódo é invocado quando se quer verificar se o código de
	 * chamado informado pelo usuário existe no banco de dados.
	 * */
	public static boolean checarChamado(int codigo, Connection conexao) throws SQLException {
	
		/*
		 * É realizada uma busca pelo chamado atráves do código informado 
		 * pelo usuário.
		 * Utilizada a função "COUNT" para saber a quantidade de resultados
		 * retornados.
		 * */
	Statement st = conexao.createStatement();
	String comando = "select count(cod_chamado) from public.\"CHAMADO\" WHERE cod_chamado = " + codigo;
	ResultSet resultado = st.executeQuery(comando);
	resultado.next();
	
	//Se a quantidade de resultados for maior que 0 o chamado existe
	if (resultado.getInt(1) > 0) {
		return true;
	}else {
		
		//Se for menor que 0 o chamado não existe
		return false;
	}
	}


	/*
	 * Esse metódo é invocado quando se quer verificar se existem
	 * chamados para determinada sala informada
	 * */
	public static boolean checarChamado(String sala, Connection conexao) throws SQLException {
	
		/*
		 * É realizada uma busca por chamados atráves do código da sala 
		 * informado pelo usuário.
		 * Utilizada a função "COUNT" para saber a quantidade de resultados
		 * retornados.
		 * */	
	Statement st = conexao.createStatement();
	String comando = "select count(cod_chamado) from public.\"CHAMADO\" WHERE sala_chamado = '" + sala + "'";
	ResultSet resultado = st.executeQuery(comando);
	resultado.next();
	
	//Se a quantidade de resultados for maior que 0 existem chamados
	if (resultado.getInt(1) > 0) {
		return true;
	}else {
		
		//Se for menor que 0 não existem chamados
		return false;
	}
	}


	/*
	 * Esse metódo é invocado quando se quer verificar se existem
	 * chamados para determinada sala e equipamentos informados.
	 * Utilizado para verificação de chamados semelhantes e mediante a isso
	 * interromper ou prosseguir com a abertura normal de chamado.
	 * */
public static boolean checarChamado(String sala, int equipamento, Connection conexao) throws SQLException {
	
	/*
	 * É realizada uma busca por chamados atráves do código da sala 
	 * e do equipamento informados pelo usuário.
	 * Utilizada a função "COUNT" para saber a quantidade de resultados
	 * retornados.
	 * */	
	Statement st = conexao.createStatement();
	String comando = "select count(cod_chamado) from public.\"CHAMADO\" WHERE "
			+ "sala_chamado = '" + sala + "' "
					+ "and equipamento_chamado = " + equipamento +" "
							+ " and status_chamado != 3 and status_chamado != 4 ";
	ResultSet resultado = st.executeQuery(comando);
	resultado.next();
	
	/*
	 * Se a quantidade de resultados for maior que 0 existem chamados 
	 * semelhantes, por isso NÃO deve-se dar prosseguimento ao fluxo 
	 * normal de abertura de chamado
	 * */
	if (resultado.getInt(1) > 0) {

		return false;
	}
	
	/*
	 * Do contrário, não existem chamados semelhantes, por isso 
	 * deve-se dar prosseguimento ao fluxo normal de abertura de chamado
	 * */
	return true;
}


/*
 * Esse metódo é invocado quando se quer verificar se existem
 * letras em um campo onde só deveriam haver números.
 * */
public static boolean letraCheck(String valor) {
	
	//Removendo todos os espaços
	valor = valor.replaceAll(" ", "");
	
	//Tentando converter o valor informado para inteiro
		try {
		   
		   int valorInt = Integer.parseInt(valor);
		   //Caso consiga, foram informados apenas números
		   return true;
	   }catch (Exception e){
		  //Caso não consiga, o usuário deve digitar novamente
		   return false;
	   }
}

}
