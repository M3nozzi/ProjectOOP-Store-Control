/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projectpoo.view;

import br.com.projectpoo.dao.ClientesDAO;
import br.com.projectpoo.dao.FornecedoresDAO;
import br.com.projectpoo.dao.ProdutosDAO;
import br.com.projectpoo.model.Clientes;
import br.com.projectpoo.model.Fornecedores;
import br.com.projectpoo.model.Produtos;
import br.com.projectpoo.model.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabio Menozzi
 */
public class FrmProdutos extends javax.swing.JFrame {

    // Metodo Listar
    
    public void listar(){
        
        ProdutosDAO dao = new ProdutosDAO();
        
        List<Produtos> lista = dao.listarProdutos();
        
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        
        dados.setNumRows(0);
        
        for(Produtos c: lista){
        
            dados.addRow(new Object[]{
            
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getQtd_estoque(),
                c.getFornecedores().getNome() //recebe todos os dados do fornecedor, porem só exibe o nome
           
            });     
      
       }
        
    }
    
    /**
     * Creates new form FrmProdutos
     */
    public FrmProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JTextField();
        txtqtdestoque = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbfornecedor = new javax.swing.JComboBox();
        btnpesquisar_nome = new javax.swing.JButton();
        painel_consulta = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnsalvar = new javax.swing.JButton();
        btnnovo = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("Email:");

        jTextField13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        painel_dados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Descrição: ");

        txtdescricao.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Preço:");

        txtpreco.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        txtqtdestoque.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtqtdestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdestoqueActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Qtd. Estoque: ");

        jLabel16.setText("Fornecedor:");

        cbfornecedor.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cbfornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbfornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbfornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbfornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbfornecedorMouseClicked(evt);
            }
        });

        btnpesquisar_nome.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnpesquisar_nome.setText("Pesquisar");
        btnpesquisar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisar_nomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisar_nome))
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtqtdestoque, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtpreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar_nome))
                .addGap(11, 11, 11)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Produto", painel_dados);

        painel_consulta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel17.setText("Nome:");

        txtpesquisa.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        btnpesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        tabelaProdutos.setBackground(new java.awt.Color(204, 204, 204));
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor"
            }
        ));
        tabelaProdutos.setSelectionBackground(new java.awt.Color(0, 51, 255));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout painel_consultaLayout = new javax.swing.GroupLayout(painel_consulta);
        painel_consulta.setLayout(painel_consultaLayout);
        painel_consultaLayout.setHorizontalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel_consultaLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnpesquisar)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        painel_consultaLayout.setVerticalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta de Produtos", painel_consulta);

        btnsalvar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnnovo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnnovo.setText("+ NOVO");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btneditar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnexcluir.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnexcluir.setText("EXCLUIR");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(btnnovo)
                .addGap(26, 26, 26)
                .addComponent(btnsalvar)
                .addGap(28, 28, 28)
                .addComponent(btneditar)
                .addGap(18, 18, 18)
                .addComponent(btnexcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvar)
                    .addComponent(btnnovo)
                    .addComponent(btneditar)
                    .addComponent(btnexcluir))
                .addGap(0, 83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtqtdestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdestoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdestoqueActionPerformed

    
    
    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // Botao Pesquisar
        
        String nome= "%" + txtpesquisa.getText() + "%";
       
        
        ProdutosDAO dao = new ProdutosDAO();
        
        List<Produtos> lista = dao.buscaProdutosPorNome(nome);
        
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        
        dados.setNumRows(0);
        
        for(Produtos c: lista){
        
            dados.addRow(new Object[]{
            
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getQtd_estoque(),
                c.getFornecedores().getNome()
               
      
                
            });     
      
       }
        
        
        
        
        
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // Botao Salvar
 
            
            Produtos obj = new Produtos();
            
            obj.setDescricao(txtdescricao.getText());
            obj.setPreco(Double.parseDouble(txtpreco.getText()));
            obj.setQtd_estoque(Integer.parseInt(txtqtdestoque.getText()));
            
            //Criar um objeto de Fornecedor
            Fornecedores f = new Fornecedores();
            f = (Fornecedores)cbfornecedor.getSelectedItem();
            
            obj.setFornecedores(f);
        
           
            ProdutosDAO dao = new ProdutosDAO();
            
            dao.cadastrar(obj);
            
            new Utilitarios().LimpaTela(painel_dados);
            
          
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Carrega a lista
        
        listar ();
        
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        // Pegar dados
        
        jTabbedPane1.setSelectedIndex(0);
        
        txtcodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),0).toString());
        txtdescricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),1).toString());
        txtpreco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),2).toString());
        txtqtdestoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),3).toString());
     
        Fornecedores f = new Fornecedores();
        
        FornecedoresDAO dao = new FornecedoresDAO();
        
        f = dao.consultaPorNome(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),4).toString());
        
        cbfornecedor.removeAllItems();
        
        //cbfornecedor.setSelectedItem(f);
        
        cbfornecedor.getModel().setSelectedItem(f);        
        
        //cbfornecedor.setSelectedItem(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),4).toString());
        
        
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // Botao Editar Produtos
      
            
            Produtos obj = new Produtos();
            
            obj.setId(Integer.parseInt(txtcodigo.getText()));
            obj.setDescricao(txtdescricao.getText());
            obj.setPreco(Double.parseDouble(txtpreco.getText()));
            obj.setQtd_estoque(Integer.parseInt(txtqtdestoque.getText()));
            
            // Criar um objeto de Fornecedor
            
            Fornecedores f = new Fornecedores();
            f=(Fornecedores) cbfornecedor.getSelectedItem();
            
            obj.setFornecedores(f);            
            
            ProdutosDAO dao = new ProdutosDAO();
            
            dao.alterar(obj);
            
            new Utilitarios().LimpaTela(painel_dados);
        
        
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // Botao Excluir Produto
        
            
            Produtos obj = new Produtos();
            
            
            obj.setId(Integer.parseInt(txtcodigo.getText()));
            
            
            ProdutosDAO dao = new ProdutosDAO();
            
            dao.excluir(obj);
            
            new Utilitarios().LimpaTela(painel_dados);
        
        
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        // seleciona os nomes conforme digitacao 
        
        
        String nome= "%" + txtpesquisa.getText() + "%";
        
     
        
        ProdutosDAO dao = new ProdutosDAO();
        
        List<Produtos> lista = dao.buscaProdutosPorNome(nome);
        
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        
        dados.setNumRows(0);
        
        for(Produtos c: lista){
        
            dados.addRow(new Object[]{
            
             c.getId(),
             c.getDescricao(),
             c.getPreco(),
             c.getQtd_estoque(),
             c.getFornecedores().getNome()
                
            });     
      
       }
        
        
    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        // Botao Novo - Limpar a tela para cadastrar novo produto
        
        new Utilitarios().LimpaTela(painel_dados);
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btnpesquisar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisar_nomeActionPerformed
        // Botao Buscar por Produto
        
            
            String nome=txtdescricao.getText();
            
            Produtos obj=new Produtos();
            
            ProdutosDAO dao=new ProdutosDAO();
            
            obj=dao.consultaPorNome(nome);
            cbfornecedor.removeAllItems();
            
            
            if(obj.getDescricao()!= null) {
            
            // Exibir os dados do obj nos campos de texto
            
            txtcodigo.setText(String.valueOf(obj.getId()));
            txtdescricao.setText(obj.getDescricao());
           
            txtpreco.setText(String.valueOf(obj.getPreco()));
          
            txtqtdestoque.setText(String.valueOf(obj.getQtd_estoque()));
          
            Fornecedores f = new Fornecedores();
            FornecedoresDAO fdao = new FornecedoresDAO ();
            
            f = fdao.consultaPorNome(obj.getFornecedores().getNome());
            
            cbfornecedor.getModel().setSelectedItem(f);
            
            }
            
            else { 
                
                JOptionPane.showMessageDialog(null,"Cliente não encontrado!");
                
            }
            
    }//GEN-LAST:event_btnpesquisar_nomeActionPerformed

    private void cbfornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbfornecedorAncestorAdded
        // Carregar Combobox Fornecedores
        
        FornecedoresDAO dao = new FornecedoresDAO();
        
        List<Fornecedores> listadefornecedores = dao.listarFornecedores();
            
        cbfornecedor.removeAll();
        
        for(Fornecedores f : listadefornecedores){
                
            cbfornecedor.addItem(f);
            
            }
        
        
    }//GEN-LAST:event_cbfornecedorAncestorAdded

    private void cbfornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbfornecedorMouseClicked
        // Carregar as informacoes dos Fornecedores no combo box
        
        FornecedoresDAO dao = new FornecedoresDAO();
        
        List<Fornecedores> listadefornecedores = dao.listarFornecedores();
        cbfornecedor.removeAllItems();
        
        
        for(Fornecedores f : listadefornecedores) {
            
            cbfornecedor.addItem(f);
        }
        
        
    }//GEN-LAST:event_cbfornecedorMouseClicked

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
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnpesquisar_nome;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox cbfornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JPanel painel_consulta;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtqtdestoque;
    // End of variables declaration//GEN-END:variables
}
