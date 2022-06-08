/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certifica_ai;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterContrastIJTheme;
import dao.AlunoDAO;
import dao.CertificadoDAO;
import factory.ConnectionFactory;
import java.awt.Color;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.Aluno;
import modelo.Certificado;

/**
 *
 * @author Sandro V Vieira
 */
public class Tela_aluno extends javax.swing.JFrame {

    int id_usuario;
    File f;

    /**
     * Creates new form Tela_aluno
     */
    public Tela_aluno() {
        initComponents();
        // setExtendedState(MAXIMIZED_BOTH);
        btncertificado.setBackground(new Color(0, 0, 0, 0));
        btnperfil.setBackground(new Color(0, 0, 0, 0));
        btnsair.setBackground(new Color(0, 0, 0, 0));
        txtnomecurso.setBackground(new Color(0, 0, 0, 0));
        txtqtdhoras.setBackground(new Color(0, 0, 0, 0));
        txttipo.setBackground(new Color(0, 0, 0, 0));
        //txtnome.setBackground(new Color(0, 0, 0, 0));
        //txtemail.setBackground(new Color(0, 0, 0, 0));
        //txtra.setBackground(new Color(0, 0, 0, 0));
        //txtcurso.setBackground(new Color(0, 0, 0, 0));
        //txtqtd.setBackground(new Color(0, 0, 0, 0));
        //txtsemestre.setBackground(new Color(0, 0, 0, 0));
        btnsalvar.setBackground(new Color(0, 0, 0, 0));
        btnvoltar.setBackground(new Color(0, 0, 0, 0));
        btnvoltar2.setBackground(new Color(0, 0, 0, 0));

        txtqtdhoras.setDocument(new SoNumeros());

    }

    Tela_aluno(int id) {
        this();
        id_usuario = id;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PAINEL_GUIAS = new javax.swing.JTabbedPane();
        CERTIFICADO = new javax.swing.JPanel();
        txtnomecurso = new javax.swing.JTextField();
        txtqtdhoras = new javax.swing.JTextField();
        btnvoltar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnanexo = new javax.swing.JButton();
        lblnome0 = new javax.swing.JLabel();
        lblnome1 = new javax.swing.JLabel();
        txttipo = new javax.swing.JComboBox<>();
        lblfundo = new javax.swing.JLabel();
        PERFIL = new javax.swing.JPanel();
        btnvoltar2 = new javax.swing.JButton();
        lblra = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        lblcurso = new javax.swing.JLabel();
        lblhoras = new javax.swing.JLabel();
        lblsemestre = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblfundo2 = new javax.swing.JLabel();
        btncertificado = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btnperfil = new javax.swing.JButton();
        lblmenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CERTIFICADO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnomecurso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtnomecurso.setBorder(null);
        CERTIFICADO.add(txtnomecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 357, 190, 30));

        txtqtdhoras.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtqtdhoras.setBorder(null);
        CERTIFICADO.add(txtqtdhoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 190, 20));

        btnvoltar.setBorder(null);
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        CERTIFICADO.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 90, 30));

        btnsalvar.setBorder(null);
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        CERTIFICADO.add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, 100, 50));

        btnanexo.setBorder(null);
        btnanexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanexoActionPerformed(evt);
            }
        });
        CERTIFICADO.add(btnanexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 380, 220));

        lblnome0.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CERTIFICADO.add(lblnome0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 230, 30));

        lblnome1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblnome1.setText("Bem Vindo(a)");
        CERTIFICADO.add(lblnome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 100, 30));

        txttipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txttipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autor/Co-Autor de Artigo de Cunho Científico", "Autor/Co-Autor de Artigo de Cunho Técnológico Não-Científico", "Curso de Idioma", "Curso de Formação Complementar correlacionados ao Curso ou Similares", "Start-up", "Ouvinte de Apresentação Pública de Dissertação ou Tese", "Participação em Atividade Competitiva", "Participação em Concursos Públicos ou Privados Premiados", "Participação em Equipe de Desenvolvimento de Produto com Patente Reconhecida", "Participação em Orgão de Representação Acadêmico", "Simulados (exames)", "Sites, Blogs, Espaços de Mídias Sociais que tratem de assuntos relacionados ao curso.", "Tutoriais, Manuais Técnicos, Produção Multimídia.", "Visita Técnica Não Monitorada", "Voluntariado - Projetos Sociais", "Outras Atividades" }));
        txttipo.setBorder(null);
        CERTIFICADO.add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 536, 190, 20));

        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/certificado1.png"))); // NOI18N
        CERTIFICADO.add(lblfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1130, 740));

        PAINEL_GUIAS.addTab("tab1", CERTIFICADO);

        PERFIL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnvoltar2.setBorder(null);
        btnvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar2ActionPerformed(evt);
            }
        });
        PERFIL.add(btnvoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 90, 30));

        lblra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PERFIL.add(lblra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 120, 10));

        lblnome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PERFIL.add(lblnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 208, 120, 20));

        lblcurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PERFIL.add(lblcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 259, 290, 10));

        lblhoras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PERFIL.add(lblhoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 458, 30, 30));

        lblsemestre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PERFIL.add(lblsemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 462, 40, 30));

        lblemail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PERFIL.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 120, 10));

        lblfundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblfundo2.setPreferredSize(new java.awt.Dimension(1123, 758));
        PERFIL.add(lblfundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        PAINEL_GUIAS.addTab("tab2", PERFIL);

        getContentPane().add(PAINEL_GUIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -33, 1120, -1));

        btncertificado.setBorder(null);
        btncertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncertificadoActionPerformed(evt);
            }
        });
        getContentPane().add(btncertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 50));

        btnsair.setBorder(null);
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 200, 50));

        btnperfil.setBorder(null);
        btnperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 200, 50));

        lblmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_aluno.png"))); // NOI18N
        getContentPane().add(lblmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 730));

        setSize(new java.awt.Dimension(1377, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncertificadoActionPerformed
        try {
            Aluno aluno = new Aluno();
            aluno.setId("" + id_usuario);
            AlunoDAO dao = new AlunoDAO();
            dao.select(aluno);
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "select * from tab_alunos where id = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "" + id_usuario);
            ResultSet rs = stmt.executeQuery();

            lblnome0.setText(aluno.getNome());

            rs.close();
            connection.close();
        } catch (Exception e) {

        }

        PAINEL_GUIAS.setSelectedIndex(0);

    }//GEN-LAST:event_btncertificadoActionPerformed

    private void btnperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperfilActionPerformed
        try {
            //  String id;
            Aluno aluno = new Aluno();
            // id = aluno.getId();
            // System.out.println(id);
            aluno.setId("" + id_usuario);
            AlunoDAO dao = new AlunoDAO();
            dao.select(aluno);
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "select * from tab_alunos where id = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "" + id_usuario);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                lblra.setText(aluno.getRa());
                lblnome.setText(aluno.getNome());
                lblemail.setText(aluno.getEmail());
                lblcurso.setText(aluno.getCurso_aluno());
                lblsemestre.setText(aluno.getSemestre());
                lblhoras.setText(aluno.getHoras());
                ;
            }
            rs.close();
            connection.close();
        } catch (Exception e) {

        }
        PAINEL_GUIAS.setSelectedIndex(1);    }//GEN-LAST:event_btnperfilActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        Tela_login login = new Tela_login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar2ActionPerformed
        PAINEL_GUIAS.setSelectedIndex(0);    }//GEN-LAST:event_btnvoltar2ActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        PAINEL_GUIAS.setSelectedIndex(0);    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed

        Certificado certificado = new Certificado();
        certificado.setAluno(Integer.toString(id_usuario));
        certificado.setNome_curso(txtnomecurso.getText());
        certificado.setQtd_horas(txtqtdhoras.getText());
        certificado.setTipo((String) txttipo.getSelectedItem());
        certificado.setAnexo(f.getAbsolutePath());

        // fazendo a validação dos dados
        if ((txtnomecurso.getText().isEmpty()) || (txtqtdhoras.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {

            CertificadoDAO dao = new CertificadoDAO();
            dao.adiciona(certificado);
            JOptionPane.showMessageDialog(null, "Certificado cadastrado com sucesso!");
            txtnomecurso.setText("");
            txtqtdhoras.setText("");

        }    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnanexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanexoActionPerformed
        JFileChooser a = new JFileChooser();
        a.setFileSelectionMode(JFileChooser.FILES_ONLY);
        a.showOpenDialog(this);
        f = a.getSelectedFile();
        System.out.println(f);
    }//GEN-LAST:event_btnanexoActionPerformed

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
            FlatMaterialLighterContrastIJTheme.setup();
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("Button.arc", 100);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_aluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CERTIFICADO;
    private javax.swing.JTabbedPane PAINEL_GUIAS;
    private javax.swing.JPanel PERFIL;
    private javax.swing.JButton btnanexo;
    private javax.swing.JButton btncertificado;
    private javax.swing.JButton btnperfil;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JButton btnvoltar2;
    private javax.swing.JLabel lblcurso;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfundo;
    private javax.swing.JLabel lblfundo2;
    private javax.swing.JLabel lblhoras;
    private javax.swing.JLabel lblmenu;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblnome0;
    private javax.swing.JLabel lblnome1;
    private javax.swing.JLabel lblra;
    private javax.swing.JLabel lblsemestre;
    private javax.swing.JTextField txtnomecurso;
    private javax.swing.JTextField txtqtdhoras;
    private javax.swing.JComboBox<String> txttipo;
    // End of variables declaration//GEN-END:variables
}