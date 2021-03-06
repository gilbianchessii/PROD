
import Connection.JavaConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Matheus B. Barni
 * @author Rodrigo
 * @version 1.0
 */
public class Issue extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement stmt;

    /**
     * Cria a nova forma issue
     */
    public Issue() {
        super("Empréstimo");
        initComponents();
        con = JavaConnect.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdLivro = new javax.swing.JTextField();
        jTextFieldNomeLivro = new javax.swing.JTextField();
        jTextFieldEdicao = new javax.swing.JTextField();
        jTextFieldEditora = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jTextFieldPaginas = new javax.swing.JTextField();
        jButtonProcurar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldIdEstudante = new javax.swing.JTextField();
        jTextFieldNomeEstudante = new javax.swing.JTextField();
        jTextFieldNomePai = new javax.swing.JTextField();
        jTextFieldCurso = new javax.swing.JTextField();
        jTextFieldRamo = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldSemestre = new javax.swing.JTextField();
        jButtonProcurarEstudante = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButtonEmissao = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Detalhes: Livros", 0, 0, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("ID Livro");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Edição");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Editora");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Preço");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Páginas");

        jTextFieldIdLivro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextFieldNomeLivro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextFieldEdicao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextFieldEditora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextFieldPreco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTextFieldPaginas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jButtonProcurar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/SEO-icon-1.png"))); // NOI18N
        jButtonProcurar.setText("Procurar");
        jButtonProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNomeLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jTextFieldEdicao)
                    .addComponent(jTextFieldEditora)
                    .addComponent(jTextFieldPreco)
                    .addComponent(jTextFieldPaginas)
                    .addComponent(jTextFieldIdLivro))
                .addGap(31, 31, 31)
                .addComponent(jButtonProcurar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProcurar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Detalhes: Estudante", 0, 0, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("ID Estudante");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Nome do pai");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Curso");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Ramo");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Ano");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Semestre");

        jTextFieldIdEstudante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldNomeEstudante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldNomePai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldRamo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldAno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldSemestre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButtonProcurarEstudante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonProcurarEstudante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/SEO-icon-1.png"))); // NOI18N
        jButtonProcurarEstudante.setText("Procurar");
        jButtonProcurarEstudante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarEstudanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldIdEstudante, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeEstudante)
                    .addComponent(jTextFieldNomePai)
                    .addComponent(jTextFieldCurso)
                    .addComponent(jTextFieldRamo)
                    .addComponent(jTextFieldAno)
                    .addComponent(jTextFieldSemestre))
                .addGap(29, 29, 29)
                .addComponent(jButtonProcurarEstudante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldIdEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProcurarEstudante))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNomeEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Data da Emissão");

        jButtonEmissao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEmissao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/icon_copy.gif"))); // NOI18N
        jButtonEmissao.setText("Emissão");
        jButtonEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmissaoActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/User-Interface-Logout-icon-1.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEmissao)
                            .addComponent(jLabel14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButtonVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEmissao)
                    .addComponent(jButtonVoltar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @author Matheus
     *
     * Volta para tela principal
     */
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    /**
     *
     * @author Matheus
     *
     * Botão que procura o Id do livro no banco de dados e preenche os campos
     * Nome, edição, Editora, preço e páginas
     */
    private void jButtonProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarActionPerformed
        String sql = "SELECT * FROM livro WHERE Book_ID = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, jTextFieldIdLivro.getText());
            rs = stmt.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("Name");
                jTextFieldNomeLivro.setText(add1);
                String add2 = rs.getString("Edition");
                jTextFieldEdicao.setText(add2);
                String add3 = rs.getString("Publisher");
                jTextFieldEditora.setText(add3);
                String add4 = rs.getString("Price");
                jTextFieldPreco.setText(add4);
                String add5 = rs.getString("Pages");
                jTextFieldPaginas.setText(add5);
                rs.close();
                stmt.close();
            } else {
                JOptionPane.showMessageDialog(null, "ID do livro não encontrado.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                rs.close();
                stmt.close();
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_jButtonProcurarActionPerformed
    /**
     * @author Matheus
     *
     * Procura o ID do estudante no banco de dados e preenche os campos Nome,
     * Nome do pai, Curso, Ramo, Ano, Semestre
     */
    private void jButtonProcurarEstudanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarEstudanteActionPerformed

        String sql = "SELECT * FROM estudante WHERE Student_ID=?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, jTextFieldIdEstudante.getText());
            rs = stmt.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("Name");
                jTextFieldNomeEstudante.setText(add1);
                String add2 = rs.getString("Father");
                jTextFieldNomePai.setText(add2);
                String add3 = rs.getString("Course");
                jTextFieldCurso.setText(add3);
                String add4 = rs.getString("Branch");
                jTextFieldRamo.setText(add4);
                String add5 = rs.getString("Year");
                jTextFieldAno.setText(add5);
                String add6 = rs.getString("Semester");
                jTextFieldSemestre.setText(add6);
                rs.close();
                stmt.close();
            } else {
                JOptionPane.showMessageDialog(null, "ID do Estudante não Encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                stmt.close();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_jButtonProcurarEstudanteActionPerformed

    /**
     * @author Matheus
     *
     * Ele envia para o banco de dados as informações.
     *
     */
    private void jButtonEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmissaoActionPerformed

        String sql = "INSERT INTO problema(Book_ID,Name,Edition,Publisher,Price,Pages,Student_ID,SName,FName,Course,Branch,Year,Semester,DateOfIssue) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, jTextFieldIdLivro.getText());
            stmt.setString(2, jTextFieldNomeLivro.getText());
            stmt.setString(3, jTextFieldEdicao.getText());
            stmt.setString(4, jTextFieldEditora.getText());
            stmt.setString(5, jTextFieldPreco.getText());
            stmt.setString(6, jTextFieldPaginas.getText());
            stmt.setString(7, jTextFieldIdEstudante.getText());
            stmt.setString(8, jTextFieldNomeEstudante.getText());
            stmt.setString(9, jTextFieldNomePai.getText());
            stmt.setString(10, jTextFieldCurso.getText());
            stmt.setString(11, jTextFieldRamo.getText());
            stmt.setString(12, jTextFieldAno.getText());
            stmt.setString(13, jTextFieldSemestre.getText());
            stmt.setString(14, ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Livro Emprestado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonEmissaoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmissao;
    private javax.swing.JButton jButtonProcurar;
    private javax.swing.JButton jButtonProcurarEstudante;
    private javax.swing.JButton jButtonVoltar;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldEdicao;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldIdEstudante;
    private javax.swing.JTextField jTextFieldIdLivro;
    private javax.swing.JTextField jTextFieldNomeEstudante;
    private javax.swing.JTextField jTextFieldNomeLivro;
    private javax.swing.JTextField jTextFieldNomePai;
    private javax.swing.JTextField jTextFieldPaginas;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldRamo;
    private javax.swing.JTextField jTextFieldSemestre;
    // End of variables declaration//GEN-END:variables
}
