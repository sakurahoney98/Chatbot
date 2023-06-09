package br.com.ucsal.chatbot.user.windows;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.ucsal.chatbot.user.exception.CampoContemLetra;
import br.com.ucsal.chatbot.user.exception.CampoObrigatorioVazio;
import br.com.ucsal.chatbot.user.exception.ChamadoNaoExiste;
import br.com.ucsal.chatbot.user.util.Validador;
import br.com.ucsal.chatbot.user.view.MensagemInterface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Sakura
 */
public class Tela_PesquisarChamadoPor extends javax.swing.JFrame {
	Connection conexao = Tela_Home.getConnection();

	
	
    /**
     * Creates new form NewJFrame
     */
    public Tela_PesquisarChamadoPor() {
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
        buttonPesquisaChamado = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        buttonPesquisaSala = new javax.swing.JButton();
        textUserMensagem = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelMensagemErro = new javax.swing.JTextArea();
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

        textMensagem.setEditable(false);
        textMensagem.setColumns(20);
        textMensagem.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        textMensagem.setRows(5);
        textMensagem.setText(MensagemInterface.getMensagemTipoBusca());
        textMensagem.setBorder(null);

        buttonPesquisaChamado.setBackground(new java.awt.Color(255, 255, 255));
        buttonPesquisaChamado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonPesquisaChamado.setText("N�mero do chamado");
        buttonPesquisaChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaChamadoActionPerformed(evt);
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

        buttonPesquisaSala.setBackground(new java.awt.Color(255, 255, 255));
        buttonPesquisaSala.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonPesquisaSala.setText("Sala");
        buttonPesquisaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buttonPesquisaSalaActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        textUserMensagem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textUserMensagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buttonPesquisarActionPerformed(evt);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        labelMensagemErro.setEditable(false);
        labelMensagemErro.setColumns(20);
        labelMensagemErro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        labelMensagemErro.setForeground(new java.awt.Color(0, 0, 0));
        labelMensagemErro.setRows(5);
        labelMensagemErro.setBorder(null);
        labelMensagemErro.setText(MensagemInterface.getMensagemInicial());
        
       
        

        javax.swing.GroupLayout panelConteudoLayout = new javax.swing.GroupLayout(panelConteudo);
        panelConteudo.setLayout(panelConteudoLayout);
        panelConteudoLayout.setHorizontalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConteudoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(buttonVoltar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelConteudoLayout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelConteudoLayout.createSequentialGroup()
                                .addComponent(imgBot, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(textMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConteudoLayout.createSequentialGroup()
                                .addComponent(buttonPesquisaChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50)
                                .addComponent(buttonPesquisaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelConteudoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(textUserMensagem))
                        .addGap(20, 20, 20)
                        .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addGap(26, 26, 26)
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPesquisaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConteudoLayout.createSequentialGroup()
                        .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                        .addGap(390, 390, 390))
                    .addGroup(panelConteudoLayout.createSequentialGroup()
                        .addComponent(textUserMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        
        textUserMensagem.setVisible(false);
        buttonPesquisar.setVisible(false);
        

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
                .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void buttonPesquisaChamadoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        textUserMensagem.setVisible(true);
        buttonPesquisar.setVisible(true);
        jScrollPane1.setVisible(true);
        
    }                                                     

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	this.dispose();
       new Tela_Home().main(null);
    }                                            

    private void buttonPesquisaSalaActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                                   
    	this.dispose();
        new Tela_DetalhesChamado().setDirecionamento(0);
        new Tela_Sala().setDirecionamento(1);
        new Tela_ListaChamados().setDirecionamento(0);
        
        Tela_Sala.main(null);
    }                                                  

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) throws NumberFormatException, SQLException {                                                
       if(!textUserMensagem.getText().equals("")) {
    	   if(Validador.letraCheck(textUserMensagem.getText())) {
    		    if(Validador.checarChamado(Integer.parseInt(textUserMensagem.getText()), conexao)) {
    		    	int cod = Integer.parseInt(textUserMensagem.getText());
    		    	
    		    	new Tela_DetalhesChamado().setCodigoChamado(cod);
    		    	new Tela_DetalhesChamado().setDirecionamento(0);
    		    	this.dispose();
    		    	new Tela_DetalhesChamado().main(null);
    		    }else {
    		    	
    		    	 
    		    	textMensagem.setText(MensagemInterface.getMensagemTipoBusca() + "\n" + MensagemInterface.formatarTexto36(ChamadoNaoExiste.ChamadoNaoExisteInterface()));
    		    }
    	   }else {
    		  
    		   
    		   textMensagem.setText(MensagemInterface.getMensagemTipoBusca() + "\n" + MensagemInterface.formatarTexto36(CampoContemLetra.CampoContemLetra()));
    	   }
       }else {
    	   
    	  
    	   textMensagem.setText(MensagemInterface.getMensagemTipoBusca() + "\n" + MensagemInterface.formatarTexto36(CampoObrigatorioVazio.CampoObrigatorioVazio()));
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
            java.util.logging.Logger.getLogger(Tela_PesquisarChamadoPor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_PesquisarChamadoPor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_PesquisarChamadoPor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_PesquisarChamadoPor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tela_PesquisarChamadoPor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonPesquisaChamado;
    private javax.swing.JButton buttonPesquisaSala;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel imgBot;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextArea labelMensagemErro;
    private java.awt.Label labelStatus;
    private javax.swing.JPanel panelCabecalho;
    private javax.swing.JPanel panelConteudo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea textMensagem;
    private javax.swing.JTextField textUserMensagem;
    // End of variables declaration                   
}

