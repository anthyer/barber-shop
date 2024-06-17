package View;
import Controller.LoginController;
import Model.DAO.Banco;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    public Login() throws ParseException {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelSenhaText = new javax.swing.JLabel();
        jLabelUsuarioText = new javax.swing.JLabel();
        jLabelLoginText = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, -1, -1));

        jTextFieldUsuario.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jTextFieldUsuario.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                jTextFieldUsuarioComponentShown(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 250, 40));

        jPasswordFieldSenha.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 250, 40));

        jLabelSenhaText.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelSenhaText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenhaText.setText("Senha");
        getContentPane().add(jLabelSenhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        jLabelUsuarioText.setBackground(new java.awt.Color(0, 255, 153));
        jLabelUsuarioText.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabelUsuarioText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarioText.setText("Usuário");
        getContentPane().add(jLabelUsuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        jLabelLoginText.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        jLabelLoginText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginText.setText("Login");
        getContentPane().add(jLabelLoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/painel-login.png"))); // NOI18N
        jLabelFundoLogin.setText("jLabel1");
        jLabelFundoLogin.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabelFundoLogin.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabelFundoLogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabelFundoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 550, 480));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo1.jpg"))); // NOI18N
        jLabelFundo.setText("jLabel1");
        jLabelFundo.setMaximumSize(new java.awt.Dimension(5000, 5000));
        jLabelFundo.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabelFundo.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        this.controller.entrarNoSistema();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
    {//GEN-HEADEREND:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
    {//GEN-HEADEREND:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldUsuarioComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioComponentShown

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelLoginText;
    private javax.swing.JLabel jLabelSenhaText;
    private javax.swing.JLabel jLabelUsuarioText;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem)
    {
        JOptionPane.showMessageDialog(null, mensagem);
    }
        
    public JPasswordField getTextSenha() {
        return jPasswordFieldSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.jPasswordFieldSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return jTextFieldUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.jTextFieldUsuario = TextUsuario;
    }
}
