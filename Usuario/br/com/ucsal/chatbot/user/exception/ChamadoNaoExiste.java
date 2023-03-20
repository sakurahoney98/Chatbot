package br.com.ucsal.chatbot.user.exception;

import java.util.ArrayList;
import java.util.Random;

public class ChamadoNaoExiste extends Exception{
	
	public static String ChamadoNaoExisteInterface() {
		//Criando array de mensagens personalizadas de erro
		ArrayList<String> mensagens = new ArrayList<String>();
		
		//Adicionando mensagens personalizadas de erro
		mensagens.add("Vixe... Parece que esse chamado aí não existe não viu?");
		mensagens.add("Nunca vi esse chamado por aqui.");
		mensagens.add("Não encontrei nada no meu banco de dados, foi mal.");
		mensagens.add("Procurei, procurei e não achei NADA. Acho que esse chamado não existe.");
		mensagens.add("Digita novamente o número do chamado para mim?");
		
		//Selecionando aleatoriamente uma mensagem, através da posição no array
		Random gerador = new Random();
		int sorteio = gerador.nextInt(mensagens.size());
		
		return  mensagens.get(sorteio);
	}

}
