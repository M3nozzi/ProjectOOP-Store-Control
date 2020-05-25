/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projectpoo.dao;

import br.com.projectpoo.jdbc.ConnectionFactory;
import br.com.projectpoo.model.Clientes;
import br.com.projectpoo.model.Fornecedores;
import br.com.projectpoo.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio Menozzi
 */
public class ProdutosDAO {
    
    
    private Connection con;
    
    
    public ProdutosDAO(){
        
        this.con = new ConnectionFactory().getConnection();
    
    }
    
    // Metodo Cadastrar Produtos
    
    
    public void cadastrar(Produtos obj){
        
        try {
            
            String sql = "insert into tb_produtos (descricao,preco,qtd_estoque,for_id) values(?,?,?,?) ";
            
            // 2 passo - conectar o BD r organizar o comando sql
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1,obj.getDescricao());
            stmt.setDouble(2,obj.getPreco());
            stmt.setInt(3,obj.getQtd_estoque());
            
            stmt.setInt(4,obj.getFornecedores().getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Produto Cadastrado com Sucesso!");
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null,"Erro: "+erro);
            
        }
        
        
        
    }
    
    // Metodo Listar todos os Produtos
        
        
        public List<Produtos> listarProdutos(){
            
            try {
                
                // 1 passo criar a lista
                
                List<Produtos> lista = new ArrayList<>();
                
                
                
                // 2 passo criar comando sql, organizar e executar
                
                String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p " //deixar espacao entre o p e o ", caso contrario ocorrera erro
                        +"inner join tb_fornecedores as f on(p.for_id = f.id)";
                
                
                PreparedStatement stmt = con.prepareStatement(sql);
                
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    
                    Produtos obj = new Produtos();
                    Fornecedores f = new Fornecedores();
                    
                    obj.setId(rs.getInt("p.id"));
                    obj.setDescricao(rs.getString("p.descricao"));
                    obj.setPreco(rs.getDouble("p.preco"));
                    obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                    
                    f.setNome(rs.getString(("f.nome")));
             
                    obj.setFornecedores(f);
                 
                    lista.add(obj);
                          
                    
                }
                
                return lista;
                
            } catch (SQLException erro) {
                
                JOptionPane.showMessageDialog(null,"Erro: " +erro);
                return null;
                
            }
        }
    
    
        //Metodo alterar Produto
    
      public void alterar(Produtos obj){
          
           try { 
           
            
           //1 passo - criar o comando sql
           
           String sql = "update tb_produtos set descricao=?,preco=?,qtd_estoque=?,for_id=? where id=?";
  
           // 2 passo - conectar o BD e organizar o comando sql"
           
           PreparedStatement stmt = con.prepareStatement(sql);
           
           stmt.setString(1,obj.getDescricao());
           stmt.setDouble(2,obj.getPreco());
           stmt.setInt(3,obj.getQtd_estoque());
            
           stmt.setInt(4,obj.getFornecedores().getId());
           
           stmt.setInt(5,obj.getId());
           
           
           // 3 passo - executar o comando sql
           
           stmt.execute();
           
           stmt.close();
           
           JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!");
           
           
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro: " +erro);
            
        }
        
    }
      
      // Metodo Excluir Produto
      
      public void excluir(Produtos obj){
        
        try { 
              
           //1 passo - criar o comando sql
           
           String sql = "delete from tb_produtos where id = ?";
           
           // 2 passo - conectar o BD e organizar o comando sql
           
            PreparedStatement stmt = con.prepareStatement(sql);
           
            stmt.setInt(1,obj.getId());
          
           
           // 3 passo - executar o comando sql
           
           stmt.execute();
           
           stmt.close();
           
           JOptionPane.showMessageDialog(null, "Produto Excluido com Sucesso!");
           
           
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Erro: " +erro);
            
        }
        
    }
     
    
     //Metodo Lista Produto por Nome - retorna uma lista
        
        public List<Produtos> buscaProdutosPorNome(String nome){
            
            try {
                
                // 1 passo criar a lista
                
                List<Produtos> lista = new ArrayList<>();
                  
                
                // 2 passo criar comando sql, organizar e executar
                
                String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p " //deixar espacao entre o p e o ", caso contrario ocorrera erro
                        +"inner join tb_fornecedores as f on(p.for_id = f.id) where p.descricao like ?";
                
                PreparedStatement stmt = con.prepareStatement(sql);
                
                stmt.setString(1,nome);
                
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    
                    Produtos obj = new Produtos();
                    Fornecedores f = new Fornecedores();
                    
                    obj.setId(rs.getInt("p.id"));
                    obj.setDescricao(rs.getString("p.descricao"));
                    obj.setPreco(rs.getDouble("p.preco"));
                    obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                    
                    f.setNome(rs.getString(("f.nome")));
             
                    obj.setFornecedores(f);
                 
                    lista.add(obj);
                          
                    
                }
                
                return lista;
                
            } catch (SQLException erro) {
                
                JOptionPane.showMessageDialog(null,"Erro: " +erro);
                return null;
                
            }
        }
        
        //Metodo consultaProduto por Nome - retorna um objeto
        
        public Produtos consultaPorNome(String nome){
            
            try {
                
                // 1 passo criar comando sql, organizar e executar
                
                String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p " //deixar espacao entre o p e o ", caso contrario ocorrera erro
                        +"inner join tb_fornecedores as f on(p.for_id = f.id) where p.descricao = ?";
                
                PreparedStatement stmt = con.prepareStatement(sql);
                
                stmt.setString(1,nome);
                
                ResultSet rs = stmt.executeQuery();
                
                 Produtos obj = new Produtos();
                 Fornecedores f = new Fornecedores();
                 
                if(rs.next()){
                    
                    obj.setId(rs.getInt("p.id"));
                    obj.setDescricao(rs.getString("p.descricao"));
                    obj.setPreco(rs.getDouble("p.preco"));
                    obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                    
                    f.setNome(rs.getString(("f.nome")));
             
                    obj.setFornecedores(f);
  
                }
                
                return obj;
         
                
                
            } catch (Exception e) {
                
               JOptionPane.showMessageDialog(null,"Produto não encontrado!");
               
               return null;
       
            }
            
            
        }  
        
        
          //Metodo Busca Produto por Código - retorna um objeto
        
        public Produtos buscaPorCodigo(int id){
            
            try {
                
                // 1 passo criar comando sql, organizar e executar
                
              /* String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p " //deixar espacao entre o p e o ", caso contrario ocorrera erro
                        +"inner join tb_fornecedores as f on(p.for_id = f.id) where p.id = ?"; */
             
                String sql = "select * from tb_produtos where id = ?";
                
                PreparedStatement stmt = con.prepareStatement(sql);
                
                stmt.setInt(1,id);
                
                ResultSet rs = stmt.executeQuery();
                
                 Produtos obj = new Produtos();
                 Fornecedores f = new Fornecedores();
                 
                if(rs.next()){
                    
                    obj.setId(rs.getInt("id"));
                    obj.setDescricao(rs.getString("descricao"));
                    obj.setPreco(rs.getDouble("preco"));
                    obj.setQtd_estoque(rs.getInt("qtd_estoque"));
                    
                   // f.setNome(rs.getString(("f.nome")));
             
                   // obj.setFornecedores(f);
  
                }
                
                return obj;
         
                
                
            } catch (Exception e) {
                
               JOptionPane.showMessageDialog(null,"Produto não encontrado!");
               
               return null;
       
            }
            
            
        }  
        
        
        
    
 //fim da classe   
}
