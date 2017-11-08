
import Connection.JavaConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author gilberto
 * @author Alex
 * 
 * Classe [Return] com objetivo de realizar o alugamento e retorno de tal livro.
 * Mais método de conexão com banco de dados.
 */
public class Return extends javax.swing.JFrame {
Connection con;
ResultSet rs;
PreparedStatement stmt;
    /**
     * Creates new form Return
     */
    public Return() {
        super("Return Book");
        initComponents();
        con = JavaConnect.ConnectDb();
    }
    /**
     * @ author gilberto
     * Deleta os dados sobre o livro que foi devolvido
     */
    
public void Delete(){
String sql ="DELETE FROM problema WHERE Student_ID=?";
try {
     stmt=con.prepareStatement(sql);
     stmt.setString(1,jTextFieldEstudante.getText());
     stmt.execute();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    }
}
/**
 * @ author gilberto
 * Envia para o banco de dados as informações do livro a ser devolvido
 */

public void ReturnUpdate(){
    String sql="INSERT INTO retorno(Student_ID,Name,FName,Course,Branch,Year,Semester,Book_ID,BName,Edition,Publisher,Price,Pages,DOI,DOR) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    try{
    stmt=con.prepareStatement(sql);
    stmt.setString(1, jTextFieldEstudante.getText());
    stmt.setString(2, jTextFieldNomeE.getText());
    stmt.setString(3, jTextFieldNomeP.getText());
    stmt.setString(4, jTextFieldCurso.getText());
    stmt.setString(5, jTextFieldTurno.getText());
    stmt.setString(6, jTextFieldAno.getText());
    stmt.setString(7, jTextFieldSemestre.getText());
    stmt.setString(8, jTextFieldLivro.getText());
    stmt.setString(9, jTextFieldNomeL.getText());
    stmt.setString(10, jTextFieldEdicao.getText());
    stmt.setString(11, jTextFieldPublicadora.getText());
    stmt.setString(12, jTextFieldPreco.getText());
    stmt.setString(13, jTextFieldPaginas.getText());
    stmt.setString(14, jTextFieldDE.getText());
    stmt.setString(15, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
    stmt.execute();
    JOptionPane.showMessageDialog(null, "Book Returned");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e+" RUpd");
    }
}

    //Não apagar
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNomeL = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDE = new javax.swing.JTextField();
        jTextFieldLivro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSemestre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldTurno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldPaginas = new javax.swing.JTextField();
        jTextFieldPublicadora = new javax.swing.JTextField();
        jTextFieldNomeP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCurso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldEdicao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNomeE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEstudante = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButtonRetorno = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel8.setText("jLabel8");

        jTextField8.setText("jTextField8");

        jLabel16.setText("jLabel16");

        jTextField16.setText("jTextField16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Painel de Retorno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel12.setText("Publicadora:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Estudante ID:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("Semestre:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("Edição:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel15.setText("Data de emissão:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Turno:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("Preço:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Nome:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("Paginas:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Nome do Pai:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Ano:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setText("ID Livro:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Curso:");

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/SEO-icon-1.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLivro)
                            .addComponent(jTextFieldNomeL)
                            .addComponent(jTextFieldEdicao)
                            .addComponent(jTextFieldPublicadora)
                            .addComponent(jTextFieldPreco)
                            .addComponent(jTextFieldPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDE, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldEstudante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldNomeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextFieldEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldPublicadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jTextFieldDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel17.setText("Data de Retorno:");

        jButtonRetorno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButtonRetorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeS/icon_copy.gif"))); // NOI18N
        jButtonRetorno.setText("Retorno");
        jButtonRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetornoActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonRetorno)
                                .addGap(43, 43, 43)
                                .addComponent(jButtonVoltar)
                                .addGap(42, 42, 42))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRetorno)
                    .addComponent(jButtonVoltar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(704, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @author Alex
     * 
     * Botão de ação [Pesquisar]
     * Com o comando sql SELECT e através do ID do estudante, todos os dados 
     * referentes áquele ID serão exibidos na JFrame.
     */
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM problema WHERE Student_ID=?";
        try{
            stmt=con.prepareStatement(sql);
            stmt.setString(1, jTextFieldEstudante.getText());
            rs=stmt.executeQuery();
            if(rs.next()){
                String add1=rs.getString("SName");
                jTextFieldNomeE.setText(add1);
               String add2=rs.getString("FName");
                jTextFieldNomeP.setText(add2);
                String add3=rs.getString("Course");
                jTextFieldCurso.setText(add3);
                String add4=rs.getString("Branch");
                jTextFieldTurno.setText(add4);
                String add5=rs.getString("Year");
                jTextFieldAno.setText(add5);
                String add6=rs.getString("Semester");
                jTextFieldSemestre.setText(add6);
                String add7=rs.getString("Book_ID");
                jTextFieldLivro.setText(add7);
                String add8=rs.getString("Name");
                jTextFieldNomeL.setText(add8);
                String add9=rs.getString("Edition");
                jTextFieldEdicao.setText(add9);
                String add10=rs.getString("Publisher");
                jTextFieldPublicadora.setText(add10);
                String add11=rs.getString("Price");
                jTextFieldPreco.setText(add11);
                String add12=rs.getString("Pages");
                jTextFieldPaginas.setText(add12);
                String add13=rs.getString("DateOfIssue");
                jTextFieldDE.setText(add13);
                
                rs.close();
                stmt.close();
            }else{
                JOptionPane.showMessageDialog(null, "Book is not Issued with this Student ID");
            }
        }catch(Exception e) {
           JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                stmt.close();
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed
/**
 * @author Alex
 * 
 * Botão [Voltar] 
 * Troca de JFrame para tela Home.
 */
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed
/**
 * @author Alex
 * 
 * Botão [Retorno]
 * Executa o método [Delete] e em seguida [ReturnUpdate].
 */
    private void jButtonRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetornoActionPerformed
        // TODO add your handling code here:
        Delete();
        ReturnUpdate();
    }//GEN-LAST:event_jButtonRetornoActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRetorno;
    private javax.swing.JButton jButtonVoltar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldDE;
    private javax.swing.JTextField jTextFieldEdicao;
    private javax.swing.JTextField jTextFieldEstudante;
    private javax.swing.JTextField jTextFieldLivro;
    private javax.swing.JTextField jTextFieldNomeE;
    private javax.swing.JTextField jTextFieldNomeL;
    private javax.swing.JTextField jTextFieldNomeP;
    private javax.swing.JTextField jTextFieldPaginas;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldPublicadora;
    private javax.swing.JTextField jTextFieldSemestre;
    private javax.swing.JTextField jTextFieldTurno;
    // End of variables declaration//GEN-END:variables
}
