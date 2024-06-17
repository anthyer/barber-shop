package View;

import Controller.MenuPrincipalController;

public class MenuPrincipal extends javax.swing.JFrame
{
    private final MenuPrincipalController controller;

    public MenuPrincipal()
    {
        initComponents();
        this.controller = new MenuPrincipalController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFundo = new javax.swing.JLabel();
        jMenuBarBarbearia = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemServico = new javax.swing.JMenuItem();
        jMenuOperacao = new javax.swing.JMenu();
        MenuItemAgenda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/fundomenu1.jpg"))); // NOI18N
        jLabelFundo.setText("jLabel1");
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, -1));

        jMenuBarBarbearia.setForeground(new java.awt.Color(0, 0, 0));

        jMenuCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jMenuCadastro.setText("Cadastro");

        jMenuItemCliente.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/cliente-icon.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemServico.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/tesoura-icon.png"))); // NOI18N
        jMenuItemServico.setText("Serviço");
        jMenuCadastro.add(jMenuItemServico);

        jMenuBarBarbearia.add(jMenuCadastro);

        jMenuOperacao.setText("Operação");

        MenuItemAgenda.setForeground(new java.awt.Color(0, 0, 0));
        MenuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/agenda-icon.png"))); // NOI18N
        MenuItemAgenda.setText("Agenda");
        MenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgendaActionPerformed(evt);
            }
        });
        jMenuOperacao.add(MenuItemAgenda);

        jMenuBarBarbearia.add(jMenuOperacao);

        jMenu1.setText("Relatório");
        jMenuBarBarbearia.add(jMenu1);

        setJMenuBar(jMenuBarBarbearia);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void MenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgendaActionPerformed
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_MenuItemAgendaActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAgenda;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBarBarbearia;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemServico;
    private javax.swing.JMenu jMenuOperacao;
    // End of variables declaration//GEN-END:variables
}
