package br.com.ucsal.chatbot.user.view;




public class MensagemInterface {
	
	
	/*
	 * Mensagem que aparece na tela "Tela_Home" para saber o que 
	 * o usu�rio deseja fazer (Abrir ou Pesquisar Chamado)
	 * */
	public static String getMensagemInicial() {
		String texto = "Bem vindo usu�rio! O que voc� deseja fazer?";
    
		return formatarTexto36(texto);
	}
	
	/*
	 * Mensagem que aparece na tela "Tela_Sala" para saber qual o bloco
	 * da sala do chamado
	 * */
	public static String getMensagemBloco() {
		
		String texto = "Informe o bloco:";
	    
		return formatarTexto36(texto);
		
	}
	
	
	/*
	 * Mensagem que aparece na tela "Tela_Sala" para saber qual 
	 * o n�mero da sala do chamado
	 * */
	public static String getMensagemNumeroSala() {
		
		String texto = "Informe o n�mero da sala:";
	    
		return formatarTexto36(texto);
		
	}


	/*
	 * Mensagem que aparece na tela "Tela_Equipamento" para saber para
	 * qual equipamento o usu�rio quer abrir chamado
	 * */
	public static String getMensagemEquipamento() {
	
	String texto = "Selecione o equipamento:";
    
	return formatarTexto36(texto);
	
}

	/*
	 * Mensagem que aparece na tela "Tela_AssuntoDescricao" para capturar
	 * o assunto e a descri��o do chamado que est� sendo aberto
	 * */
	public static String getMensagemAssuntoDescricao() {
	
	String texto = "No primeiro campo fale de forma resumida sobre o problema e no segundoo campo d� mais detalhes.";
    
	return formatarTexto36(texto);
	
}

	/*
	 * Mensagem que aparece na tela "Tela_PesquisarChamadoPor" para
	 * saber qual tipo de busca o usu�rio quer realizar (Sala ou C�digo
	 * do chamado).
	 * */
	public static String getMensagemTipoBusca() {
	
	String texto = "Voc� pretende pesquisar o chamado por:";
    
	return formatarTexto36(texto);
	
}

	/*
	 * Mensagem que aparece na tela "Tela_ListaChamados" para informar ao
	 * usu�rio o que ele deve fazer para ver os detalhes de um dos chamados
	 * da lista.
	 * */
	public static String getMensagemVerDetalhesChamado() {
	
	String texto = "Selecione um chamado e clique em \"Ver detalhes do chamado\"";
    
	return formatarTexto36(texto);
	
}

	
	/*
	 * Mensagem que aparece na tela "Tela_ChamadoSemelhante" para informar
	 * ao usu�rio que existe um chamado semelhante e saber o que ele
	 * gostaria de fazer (Apoiar hamado, Continuar abrindo chamado
	 * ou Sair).
	 * */
	public static String getMensagemChamadoSemelhante() {
	
	String texto = "J� existe um chamado semelhante ao que voc� est� tentando abrir. Nesse caso voc� pode apenas apoiar a resolu��o do chamado para dar mais prioridade a ele.";
    
	return formatarTexto36(texto);
	
}


	
	/*
	 * Esse met�do � invocado quando se quer formatar um texto para que 
	 * ele apare�a na tela com no m�ximo 36 caracteres por linha
	 * */
	public static String formatarTexto36(String texto) {
	  int max = 36;
		
		if(texto.length() > max) {
        	int ultPos = 0;
        	String aux ="";
        	String textoFinal = "";
        	
        	while (texto.length() - ultPos > max) {
        		aux = texto.substring(ultPos, ultPos + max);
        		int pos = aux.lastIndexOf(" ");
        		int posAux = 0;
        		textoFinal += aux.substring(posAux, pos) + "\n";
        		ultPos += pos + 1;
        	}
        	
        	textoFinal += texto.substring(ultPos, texto.length());
        	texto = textoFinal;
        }
	    
	    return texto;
	}
	
	
	/*
	 * Esse met�do � invocado quando se quer formatar um texto para que 
	 * ele apare�a na tela com no m�ximo 35 caracteres por linha
	 * */
	public static String formatarTexto35(String texto) {
		int max = 35;
		if(texto.length() > max) {
        	int ultPos = 0;
        	String aux ="";
        	String textoFinal = "";
        	
        	while (texto.length() - ultPos > max) {
        		aux = texto.substring(ultPos, ultPos + max);
        		int pos = aux.lastIndexOf(" ");
        		int posAux = 0;
        		textoFinal += aux.substring(posAux, pos) + "\n";
        		ultPos += pos + 1;
        	}
        	
        	textoFinal += texto.substring(ultPos, texto.length());
        	texto = textoFinal;
        }
	    
	    return texto;
	}
	
	/*
	 * Esse met�do � invocado quando se quer formatar um texto para que 
	 * ele apare�a na tela com no m�ximo 60 caracteres por linha
	 * */
	public static String formatarTexto60(String texto) {
		int max = 60;
		if(texto.length() > max) {
        	int ultPos = 0;
        	String aux ="";
        	String textoFinal = "";
        	
        	while (texto.length() - ultPos > max) {
        		aux = texto.substring(ultPos, ultPos + max);
        		int pos = aux.lastIndexOf(" ");
        		int posAux = 0;
        		textoFinal += aux.substring(posAux, pos) + "\n";
        		ultPos += pos + 1;
        	}
        	
        	textoFinal += texto.substring(ultPos, texto.length());
        	texto = textoFinal;
        }
	    
	    return texto;
	}

}
