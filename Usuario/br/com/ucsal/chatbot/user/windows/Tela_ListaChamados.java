package br.com.ucsal.chatbot.user.windows;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ucsal.chatbot.user.model.Chamado;
import br.com.ucsal.chatbot.user.util.Gerador;
import br.com.ucsal.chatbot.user.view.MensagemInterface;


/*
 * Essa classe pode ser invocada pelas classes "Tela_ChamadoSemelhante" e 
 * "Tela_Sala".
 * Para saber quem fez a invoca��o � utilizada a variavel 
 * "int direcionamento", onde:
 * 0 - Invoca��o feita pela classe Tela_Sala
 * 1 - Invoca��o feita pela classe Tela_ChamadoSemelhante
 * */
public class Tela_ListaChamados extends javax.swing.JFrame {
	String sala = Tela_Sala.getSala();
	Connection conexao = Tela_Home.getConnection();
	int equipamento = Tela_Equipamento.getCodigoEquipamento();
	static int direcionamento = 0;
	
	public static void setDirecionamento(int d) {
		direcionamento = d;
	}
	
	
	
	
	ArrayList<Chamado> chamados = preencheChamado();

		
	
	
	
	public ArrayList<Chamado> preencheChamado() throws SQLException{
		if(direcionamento == 0) {
        	return Gerador.arrayChamados(conexao, sala);
        }else {
        	return Gerador.arrayChamados(conexao, sala, equipamento);
        }
	}
	

    /**
     * Creates new form NewJFrame
     * @throws SQLException 
     */
    public Tela_ListaChamados() throws SQLException {
        initComponents();
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelConteudo = new javax.swing.JPanel();
        imgBot = new javax.swing.JLabel();
        textMensagem = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        listChamados = new javax.swing.JList<>();
        buttonVerDetalhes = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        panelCabecalho = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        labelStatus = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HelpDesk Chatbot");

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(720, 400));

        panelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        panelConteudo.setAlignmentX(1.0F);
        panelConteudo.setPreferredSize(new java.awt.Dimension(400, 720));

        imgBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/small2.png"))); // NOI18N
        imgBot.setText("jLabel1");

        textMensagem.setEditable(false);
        textMensagem.setColumns(20);
        textMensagem.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        textMensagem.setRows(5);
        if(chamados.isEmpty()) {
        	 textMensagem.setText("N�o foram encontrados chamados.");
        	 buttonVerDetalhes.setEnabled(false);
        }else {
        	textMensagem.setText(MensagemInterface.getMensagemVerDetalhesChamado());
        }
        
       
        textMensagem.setBorder(null);

        listChamados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listChamados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = Gerador.vetorChamados(chamados);
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listChamados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listChamados.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jScrollPane1.setViewportView(listChamados);

        buttonVerDetalhes.setBackground(new java.awt.Color(255, 255, 255));
        buttonVerDetalhes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVerDetalhes.setText("Ver detalhes do chamado");
        buttonVerDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buttonVerDetalhesActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        buttonVoltar.setBackground(new java.awt.Color(51, 204, 255));
        buttonVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConteudoLayout = new javax.swing.GroupLayout(panelConteudo);
        panelConteudo.setLayout(panelConteudoLayout);
        panelConteudoLayout.setHorizontalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVoltar)
                    .addGroup(panelConteudoLayout.createSequentialGroup()
                        .addComponent(imgBot, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(textMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(24, 24, 24))
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonVerDetalhes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConteudoLayout.setVerticalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConteudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(imgBot, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConteudoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(textMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonVerDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(buttonVoltar)
                .addGap(32, 32, 32))
        );

        panelCabecalho.setBackground(new java.awt.Color(0, 204, 255));
        panelCabecalho.setForeground(new java.awt.Color(0, 204, 255));

        label1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("ChatBot");

        labelStatus.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("online");

        javax.swing.GroupLayout panelCabecalhoLayout = new javax.swing.GroupLayout(panelCabecalho);
        panelCabecalho.setLayout(panelCabecalhoLayout);
        panelCabecalhoLayout.setHorizontalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabecalhoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabecalhoLayout.setVerticalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        
        

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void buttonVerDetalhesActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                                  
   //Verificando se nada foi selecionado
    	if(listChamados.isSelectionEmpty()) {
    		//Sele��o vazia, � exibida mensagem de erro
   		 textMensagem.setText(MensagemInterface.getMensagemVerDetalhesChamado() + "\n" + MensagemInterface.formatarTexto36("Selecione um objeto."));
   	 }else {
   		//Sele��o n�o vazia � pesquisado e exibido os chamados
   		String aux = listChamados.getSelectedValue().substring(0, listChamados.getSelectedValue().indexOf(" "));
   		Tela_DetalhesChamado.setCodigoChamado(Integer.parseInt(aux));
   		

   		if(direcionamento == 0) {
   			//Informando que a pesquisa veio da classe Tela_Sala
   			new Tela_DetalhesChamado().setDirecionamento(0);
   		}else {
   		//Informando que a pesquisa veio da classe Tela_ChamadoSemelhante
   			new Tela_DetalhesChamado().setDirecionamento(1);
   		}
   		//Informando a pr�xima classe de onde veio a chamada
   		new Tela_DetalhesChamado().setDirecionamento2(1);
   		
   		//Passando para a pr�xima tela
   		this.dispose();
      	 new Tela_DetalhesChamado().main(null);
   	 }
    
   }                                                 

   private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
       if(direcionamento == 0) {
    	   
    	   this.dispose();
           new Tela_PesquisarChamadoPor().main(null);
       }else {
    	   this.dispose();
           new Tela_ChamadoSemelhante().main(null);
       }
	   
   }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Tela_ListaChamados().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonVerDetalhes;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel imgBot;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label labelStatus;
    private javax.swing.JList<String> listChamados;
    private javax.swing.JPanel panelCabecalho;
    private javax.swing.JPanel panelConteudo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea textMensagem;
    // End of variables declaration                   
}

