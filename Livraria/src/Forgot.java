
import Connection.JavaConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 * @author Alex
 */
/**
 * @author Alex
 *
 * Classe [Forgot] com objetivo de recuperar senha perdida do usuário.
 *
 * Mais método para conexão com o banco de dados.
 *
 */
public class Forgot extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement stmt;

    public Forgot() {
        super("Forgot Password");
        initComponents();
        con = JavaConnect.ConnectDb();
    }

    /* 
    * @author Alex
    *
    * Método [Search] 
    * Pega texto do campo usuario e através do comando sql SELECT, ele obtém
    * dados de nome e pergunta de segurança. 
     */
    public void Search() {
        String a1 = jTextFieldUsuario.getText();
        String sql = "SELECT * FROM Conta WHERE Username='" + a1 + "'";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
                jTextFieldNome.setText(rs.getString(2));
                jTextFieldPSeguranca.setText(rs.getString(4));
                rs.close();
                stmt.close();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Incorreto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    /*
    * @author Alex
    *
    * Método [Retrive]
    * Através dos campos usuario e resposta, mais sql SELECT apresentado aqui,
    * Caso a resposta esteja correta, ele irá retornar a senha para o usuario.
     */
    public void Retrive() {
        String a1 = jTextFieldUsuario.getText();
        String a2 = jTextFieldResposta.getText();
        String sql = "SELECT * FROM Conta WHERE Answer='" + a2 + "'";
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
                jTextFieldSSenha.setText(rs.getString(3));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelSSenha = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldPSeguranca = new javax.swing.JTextField();
        jButtonRecuperar = new javax.swing.JButton();
        jTextFieldSSenha = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldResposta = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelPSeguranca = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelResposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Esqueceu a Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 22), new java.awt.Color(255, 0, 0))); // NOI18N

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/inside-logout-icon.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelSSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSSenha.setText("Sua Senha");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/search.gif"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUsuario.setText("Usuario");

        jTextFieldPSeguranca.setEditable(false);

        jButtonRecuperar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/Person-Male-Light-icon.png"))); // NOI18N
        jButtonRecuperar.setText("Recuperar");
        jButtonRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecuperarActionPerformed(evt);
            }
        });

        jTextFieldSSenha.setEditable(false);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNome.setText("Nome");

        jLabelPSeguranca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPSeguranca.setText("Pergunta de Segurança");

        jTextFieldNome.setEditable(false);

        jLabelResposta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelResposta.setText("Resposta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelPSeguranca))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldPSeguranca)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResposta)
                            .addComponent(jLabelSSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTextFieldResposta))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRecuperar)
                            .addComponent(jButtonPesquisar))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPSeguranca)
                    .addComponent(jTextFieldPSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResposta)
                    .addComponent(jTextFieldResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRecuperar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSSenha)
                    .addComponent(jTextFieldSSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Esqueceu Senha");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * @author Alex
     *
     * Botão de ação [Pesquisar] onde puxa e executa o método [Search].
     */
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        Search();

    }//GEN-LAST:event_jButtonPesquisarActionPerformed
    /**
     * @author Alex
     *
     * Botão de ação [Recuperar] onde puxa e executa o método [Retrive].
     */
    private void jButtonRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecuperarActionPerformed

        Retrive();
    }//GEN-LAST:event_jButtonRecuperarActionPerformed
    /**
     * @author Alex
     *
     * Botão de ação [Voltar] onde ocorre a troca de JFrame para a tela [Login].
     */
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed

        setVisible(false);
        Login ob = new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRecuperar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPSeguranca;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelSSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPSeguranca;
    private javax.swing.JTextField jTextFieldResposta;
    private javax.swing.JTextField jTextFieldSSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
