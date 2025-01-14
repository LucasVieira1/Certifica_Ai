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
import java.awt.Desktop;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno;
import modelo.Certificado;

/**
 *
 * @author Sandro V Vieira
 */
public class Tela_coordenador extends javax.swing.JFrame {

    String id_usuario;
    String id_cert;
    String horas;
    String caminho;

    public Tela_coordenador() {
        initComponents();
        btnalunos.setBackground(new Color(0, 0, 0, 0));
        btncursos.setBackground(new Color(0, 0, 0, 0));
        btncertificados.setBackground(new Color(0, 0, 0, 0));
        btnsair.setBackground(new Color(0, 0, 0, 0));
        btnvoltar.setBackground(new Color(0, 0, 0, 0));
        btnvoltar1.setBackground(new Color(0, 0, 0, 0));
        btnvoltar2.setBackground(new Color(0, 0, 0, 0));
        btnaprovar.setBackground(new Color(0, 0, 0, 0));
        btnreprovar.setBackground(new Color(0, 0, 0, 0));
        btnimprimir.setBackground(new Color(0, 0, 0, 0));
        btnimprimir1.setBackground(new Color(0, 0, 0, 0));
        btnimprimir2.setBackground(new Color(0, 0, 0, 0));
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
        ALUNOS = new javax.swing.JPanel();
        tblalunos = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        btnvoltar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lblresul = new javax.swing.JLabel();
        lblfundo2 = new javax.swing.JLabel();
        CURSOS = new javax.swing.JPanel();
        tblcursos = new javax.swing.JScrollPane();
        tblclientes1 = new javax.swing.JTable();
        btnvoltar1 = new javax.swing.JButton();
        btnimprimir1 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lblresul1 = new javax.swing.JLabel();
        lblfundo1 = new javax.swing.JLabel();
        CERTIFICADOS = new javax.swing.JPanel();
        tblcertificados = new javax.swing.JScrollPane();
        tblclientes2 = new javax.swing.JTable();
        btnvoltar2 = new javax.swing.JButton();
        btnaprovar = new javax.swing.JButton();
        btnreprovar = new javax.swing.JButton();
        btnimprimir2 = new javax.swing.JButton();
        lblmedia = new javax.swing.JLabel();
        lblpend = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblfundo3 = new javax.swing.JLabel();
        btncursos = new javax.swing.JButton();
        btncertificados = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btnalunos = new javax.swing.JButton();
        lblmenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ALUNOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblclientes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "RA", "Senha", "Nome", "Email", "Semestre", "Horas", "Curso"
            }
        ));
        tblclientes.setFocusable(false);
        tblclientes.setGridColor(new java.awt.Color(0, 0, 0));
        tblclientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblclientes.setRowHeight(30);
        tblclientes.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblclientes.getTableHeader().setReorderingAllowed(false);
        tblalunos.setViewportView(tblclientes);

        ALUNOS.add(tblalunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 870, 460));

        btnvoltar.setBorder(null);
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        ALUNOS.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 90, 40));

        btnimprimir.setBorder(null);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
        ALUNOS.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 50, 50));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setText("A média das horas cadastradas dos alunos é:");
        ALUNOS.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 310, -1));

        lblresul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ALUNOS.add(lblresul, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 618, 120, 20));

        lblfundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/certifica_ai/tabela_aluno.png"))); // NOI18N
        ALUNOS.add(lblfundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1130, 740));

        PAINEL_GUIAS.addTab("tab1", ALUNOS);

        CURSOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblclientes1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblclientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Semestres", "Total/Horas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblclientes1.setFocusable(false);
        tblclientes1.setGridColor(new java.awt.Color(0, 0, 0));
        tblclientes1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblclientes1.setRowHeight(30);
        tblclientes1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblclientes1.getTableHeader().setReorderingAllowed(false);
        tblcursos.setViewportView(tblclientes1);

        CURSOS.add(tblcursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 860, 460));

        btnvoltar1.setBorder(null);
        btnvoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar1ActionPerformed(evt);
            }
        });
        CURSOS.add(btnvoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 90, 40));

        btnimprimir1.setBorder(null);
        btnimprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimir1ActionPerformed(evt);
            }
        });
        CURSOS.add(btnimprimir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 60, 50));

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl2.setText("A média do total de semestres é:");
        CURSOS.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 230, -1));

        lblresul1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CURSOS.add(lblresul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 618, 150, 20));

        lblfundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tabela_cursos.png"))); // NOI18N
        lblfundo1.setPreferredSize(new java.awt.Dimension(1123, 758));
        CURSOS.add(lblfundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        PAINEL_GUIAS.addTab("tab2", CURSOS);

        CERTIFICADOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblclientes2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblclientes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Certificado", "Horas/certificado", "Id_usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblclientes2.setFocusable(false);
        tblclientes2.setGridColor(new java.awt.Color(0, 0, 0));
        tblclientes2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblclientes2.setRowHeight(30);
        tblclientes2.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblclientes2.getTableHeader().setReorderingAllowed(false);
        tblclientes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblclientes2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblclientes2MousePressed(evt);
            }
        });
        tblcertificados.setViewportView(tblclientes2);

        CERTIFICADOS.add(tblcertificados, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 550, 480));

        btnvoltar2.setBorder(null);
        btnvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar2ActionPerformed(evt);
            }
        });
        CERTIFICADOS.add(btnvoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 90, 40));

        btnaprovar.setBorder(null);
        btnaprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaprovarActionPerformed(evt);
            }
        });
        CERTIFICADOS.add(btnaprovar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 280, 40));

        btnreprovar.setBorder(null);
        btnreprovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreprovarActionPerformed(evt);
            }
        });
        CERTIFICADOS.add(btnreprovar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 280, 40));

        btnimprimir2.setBorder(null);
        btnimprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimir2ActionPerformed(evt);
            }
        });
        CERTIFICADOS.add(btnimprimir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 70, 60));

        lblmedia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblmedia.setText("certificado(s) pendentes(s)");
        CERTIFICADOS.add(lblmedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 328, 220, 30));

        lblpend.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CERTIFICADOS.add(lblpend, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 328, 30, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CERTIFICADOS.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 30, 20));

        lblfundo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tabela_certificados.png"))); // NOI18N
        lblfundo3.setPreferredSize(new java.awt.Dimension(1123, 758));
        CERTIFICADOS.add(lblfundo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        PAINEL_GUIAS.addTab("tab2", CERTIFICADOS);

        getContentPane().add(PAINEL_GUIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -33, 1120, -1));

        btncursos.setBorder(null);
        btncursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncursosActionPerformed(evt);
            }
        });
        getContentPane().add(btncursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 50));

        btncertificados.setBorder(null);
        btncertificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncertificadosActionPerformed(evt);
            }
        });
        getContentPane().add(btncertificados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 200, 50));

        btnsair.setBorder(null);
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 200, 50));

        btnalunos.setBorder(null);
        btnalunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalunosActionPerformed(evt);
            }
        });
        getContentPane().add(btnalunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 50));

        lblmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_coordenador.png"))); // NOI18N
        getContentPane().add(lblmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 730));

        setSize(new java.awt.Dimension(1377, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncursosActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "select *from tab_cursos";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tblclientes1.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("id"), rs.getString("nome"), rs.getString("total_semestres"), rs.getString("total_horas")});
            }

            rs.close();
            connection.close();

            int numrow = tblclientes1.getRowCount();
            float tot = 0;
            int cont = 0;

            for (int i = 0; i < numrow; i++) {
                float val = Float.valueOf(tblclientes1.getValueAt(i, 2).toString());
                cont++;
                tot = tot + val;
            }
            tot = tot / cont;
            DecimalFormat formatador = new DecimalFormat("0.00");
            formatador.format(tot);
            lblresul1.setText(Float.toString(tot).format("%.2f", tot));

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        PAINEL_GUIAS.setSelectedIndex(1);
    }//GEN-LAST:event_btncursosActionPerformed

    private void btncertificadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncertificadosActionPerformed
        try {
            id_usuario = null;
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "select tab_alunos.nome, anexo, tab_alunos.id, tab_certificados.qtd_horas, tab_certificados.id from tab_certificados join tab_alunos on tab_alunos.id = tab_certificados.aluno;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tblclientes2.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("tab_certificados.id"), rs.getString("nome"), rs.getString("anexo"), rs.getString("qtd_horas"), rs.getString("id")});
            }

            rs.close();
            connection.close();

            int numrow = tblclientes2.getRowCount();

            lblpend.setText(Integer.toString(numrow));

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        PAINEL_GUIAS.setSelectedIndex(2);
    }//GEN-LAST:event_btncertificadosActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        Tela_login login = new Tela_login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnalunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalunosActionPerformed
        try {
            Connection connection = new ConnectionFactory().getConnection();
            String sql = "select *from tab_alunos";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tblclientes.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("id"), rs.getString("ra"), rs.getString("senha"), rs.getString("nome"), rs.getString("email"), rs.getString("semestre"), rs.getString("horas"), rs.getString("curso_aluno")});
            }

            rs.close();
            connection.close();

            int numrow = tblclientes.getRowCount();
            float tot = 0;
            int cont = 0;

            for (int i = 0; i < numrow; i++) {
                float val = Float.valueOf(tblclientes.getValueAt(i, 6).toString());
                cont++;
                tot = tot + val;
            }
            tot = tot / cont;
            DecimalFormat formatador = new DecimalFormat("0.00");
            formatador.format(tot);
            lblresul.setText(Float.toString(tot).format("%.2f", tot));

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        PAINEL_GUIAS.setSelectedIndex(0);
    }//GEN-LAST:event_btnalunosActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        PAINEL_GUIAS.setSelectedIndex(0);
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnvoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar1ActionPerformed
        PAINEL_GUIAS.setSelectedIndex(0);
    }//GEN-LAST:event_btnvoltar1ActionPerformed

    private void btnvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar2ActionPerformed
        PAINEL_GUIAS.setSelectedIndex(1);    }//GEN-LAST:event_btnvoltar2ActionPerformed

    private void btnaprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaprovarActionPerformed
        if (id_usuario == null) {
            JOptionPane.showMessageDialog(null, "Selecione um certificado!");
        } else {
            int a = JOptionPane.showConfirmDialog(null, " Aprovar certificado?", "Aprovar", JOptionPane.OK_CANCEL_OPTION);
            if (a == JOptionPane.OK_OPTION) {
                try {

                    Aluno aluno = new Aluno();
                    aluno.setHoras(horas);
                    aluno.setId(id_usuario);

                    AlunoDAO dao = new AlunoDAO();
                    dao.updateHoras(aluno);

                    Certificado cert = new Certificado();
                    cert.setId(id_cert);
                    CertificadoDAO daoc = new CertificadoDAO();
                    daoc.delete(cert);

                    Connection connection = new ConnectionFactory().getConnection();
                    String sql = "select tab_alunos.nome, anexo, tab_alunos.id, tab_certificados.qtd_horas, tab_certificados.id from tab_certificados join tab_alunos on tab_alunos.id = tab_certificados.aluno;";
                    PreparedStatement stmt = connection.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    DefaultTableModel modelo = (DefaultTableModel) tblclientes2.getModel();
                    modelo.setNumRows(0);

                    while (rs.next()) {
                        modelo.addRow(new Object[]{rs.getString("tab_certificados.id"), rs.getString("nome"), rs.getString("anexo"), rs.getString("qtd_horas"), rs.getString("id")});
                    }

                    rs.close();
                    connection.close();
                    id_usuario = null;

                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_btnaprovarActionPerformed

    private void btnreprovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreprovarActionPerformed
        if (id_usuario == null) {
            JOptionPane.showMessageDialog(null, "Selecione um certificado!");
        } else {

            int a = JOptionPane.showConfirmDialog(null, " Reprovar certificado?", "Reprovar", JOptionPane.OK_CANCEL_OPTION);
            if (a == JOptionPane.OK_OPTION) {
                try {
                    JOptionPane.showMessageDialog(null, "Certificado reprovado!");
                    Certificado cert = new Certificado();
                    cert.setId(id_cert);
                    CertificadoDAO daoc = new CertificadoDAO();
                    daoc.delete(cert);
                    Connection connection = new ConnectionFactory().getConnection();
                    String sql = "select tab_alunos.nome, anexo, tab_alunos.id, tab_certificados.qtd_horas, tab_certificados.id from tab_certificados join tab_alunos on tab_alunos.id = tab_certificados.aluno;";
                    PreparedStatement stmt = connection.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    DefaultTableModel modelo = (DefaultTableModel) tblclientes2.getModel();
                    modelo.setNumRows(0);

                    while (rs.next()) {
                        modelo.addRow(new Object[]{rs.getString("tab_certificados.id"), rs.getString("nome"), rs.getString("anexo"), rs.getString("qtd_horas"), rs.getString("id")});
                    }

                    rs.close();
                    connection.close();

                    id_usuario = null;

                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnreprovarActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        GeradorRelatorio relatorio = new GeradorRelatorio();
        relatorio.Gerar(this, "Tabela Alunos", "Alunos", tblclientes);
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnimprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimir1ActionPerformed
        GeradorRelatorio relatorio = new GeradorRelatorio();
        relatorio.Gerar(this, "Tabela Cursos", "Cursos", tblclientes1);
    }//GEN-LAST:event_btnimprimir1ActionPerformed

    private void btnimprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimir2ActionPerformed
        GeradorRelatorio relatorio = new GeradorRelatorio();
        relatorio.Gerar(this, "Tabela Certificados", "Certificados", tblclientes2);    }//GEN-LAST:event_btnimprimir2ActionPerformed

    private void tblclientes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblclientes2MouseClicked
        //Certificado cer = new Certificado();

        // DefaultTableModel tableModel = (DefaultTableModel) tblclientes2.getModel();
        //int row = tblclientes2.getSelectedRow();
        // id_usuario = tableModel.getValueAt(row, 4).toString();
        // horas = tableModel.getValueAt(row, 3).toString();
        // id_cert = tableModel.getValueAt(row, 0).toString();
        //String id_cer = tableModel.
        // String id_certificado = cer.get;
        // System.out.println(id_usuario);

    }//GEN-LAST:event_tblclientes2MouseClicked

    private void tblclientes2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblclientes2MousePressed
        try {
            Certificado cer = new Certificado();
            DefaultTableModel tableModel = (DefaultTableModel) tblclientes2.getModel();
            int row = tblclientes2.getSelectedRow();
            caminho = tableModel.getValueAt(row, 2).toString();
            id_usuario = tableModel.getValueAt(row, 4).toString();
            horas = tableModel.getValueAt(row, 3).toString();
            id_cert = tableModel.getValueAt(row, 0).toString();
            File file = new File(caminho);
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
        }

     }//GEN-LAST:event_tblclientes2MousePressed

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
            //FlatMaterialLighterContrastIJTheme.setup();
            //UIManager.put("TextComponent.arc", 10);
            //UIManager.put("Button.arc", 100);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_coordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_coordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALUNOS;
    private javax.swing.JPanel CERTIFICADOS;
    private javax.swing.JPanel CURSOS;
    private javax.swing.JTabbedPane PAINEL_GUIAS;
    private javax.swing.JButton btnalunos;
    private javax.swing.JButton btnaprovar;
    private javax.swing.JButton btncertificados;
    private javax.swing.JButton btncursos;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnimprimir1;
    private javax.swing.JButton btnimprimir2;
    private javax.swing.JButton btnreprovar;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JButton btnvoltar1;
    private javax.swing.JButton btnvoltar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblfundo1;
    private javax.swing.JLabel lblfundo2;
    private javax.swing.JLabel lblfundo3;
    private javax.swing.JLabel lblmedia;
    private javax.swing.JLabel lblmenu;
    private javax.swing.JLabel lblpend;
    private javax.swing.JLabel lblresul;
    private javax.swing.JLabel lblresul1;
    private javax.swing.JScrollPane tblalunos;
    private javax.swing.JScrollPane tblcertificados;
    private javax.swing.JTable tblclientes;
    private javax.swing.JTable tblclientes1;
    private javax.swing.JTable tblclientes2;
    private javax.swing.JScrollPane tblcursos;
    // End of variables declaration//GEN-END:variables
}
