package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Agenda extends javax.swing.JFrame
{

    private final AgendaController controller;

    public Agenda()
    {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jScrollPaneAgenda = new javax.swing.JScrollPane();
        jTableAgenda = new javax.swing.JTable();
        jScrollPaneObservacao = new javax.swing.JScrollPane();
        jTextAreaObservacoes = new javax.swing.JTextArea();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelClinte = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelFundoTransparente = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 32)); // NOI18N
        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 460, 40));

        jTableAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPaneAgenda.setViewportView(jTableAgenda);

        getContentPane().add(jScrollPaneAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 1010, 140));

        jTextAreaObservacoes.setColumns(20);
        jTextAreaObservacoes.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jTextAreaObservacoes.setRows(5);
        jTextAreaObservacoes.setText("Observações...");
        jScrollPaneObservacao.setViewportView(jTextAreaObservacoes);

        getContentPane().add(jScrollPaneObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 460, 300));

        jComboBoxServico.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jComboBoxServico.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 240, 40));

        jComboBoxCliente.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 240, 40));

        jTextFieldValor.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jTextFieldValor.setText("Insira o valor");
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 240, -1));

        jTextFieldData.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jTextFieldData.setText("Insira a data");
        getContentPane().add(jTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 240, -1));

        jTextFieldHora.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jTextFieldHora.setText("Insira a hora");
        getContentPane().add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 240, -1));

        jTextFieldNome.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jTextFieldNome.setText("Insira o nome");
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 240, -1));

        jLabelClinte.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelClinte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClinte.setText("Cliente");
        getContentPane().add(jLabelClinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabelServico.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Serviço");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabelValor.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabelData.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabelHora.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Hora");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jLabelFundoTransparente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Agenda-PainelFundo.png"))); // NOI18N
        jLabelFundoTransparente.setText("jLabel1");
        getContentPane().add(jLabelFundoTransparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -70, -1, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundoagendamento.jpg"))); // NOI18N
        jLabelFundo.setText("jLabel1");
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxServicoItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxServicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_jComboBoxServicoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabelClinte;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundoTransparente;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPaneAgenda;
    private javax.swing.JScrollPane jScrollPaneObservacao;
    private javax.swing.JTable jTableAgenda;
    private javax.swing.JTextArea jTextAreaObservacoes;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar()
    {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
        this.controller.atualizaValor();
    }
    
    public JTable getTableAgendamentos()
    {
        return jTableAgenda;
    }
    
    public void setTableAgendamentos(JTable jTableAgenda)
    {
        this.jTableAgenda = jTableAgenda;
    }
    
    public JComboBox<String> getjComboBoxCliente()
    {
        return jComboBoxCliente;
    }
    
    public void setComboBoxCliente(JComboBox<String> jComboBoxCliente)
    {
        this.jComboBoxCliente = jComboBoxCliente;
    }
    
    public JComboBox<String> getjComboBoxServico()
    {
        return jComboBoxServico;
    }
    
    public void setjComboBoxServico(JComboBox<String> jComboBoxServico)
    {
        this.jComboBoxServico = jComboBoxServico;
    }

    public JTextField getjTextFieldValor()
    {
        return jTextFieldValor;
    }

    public void setjTextFieldValor(JTextField jTextFieldValor)
    {
        this.jTextFieldValor = jTextFieldValor;
    }
}
