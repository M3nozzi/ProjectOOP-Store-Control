/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projectpoo.dao;

import br.com.projectpoo.jdbc.ConnectionFactory;
import br.com.projectpoo.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio Menozzi
 */
public class VendasDAO {
    
      private Connection con;
    
    
      public VendasDAO(){
        
        this.con = new ConnectionFactory().getConnection();
    
    }
    
      
      //Metodo Cadastrar Venda
      
      public void cadastrarVenda(Vendas obj){
         
          try {
             
         String sql = "insert into tb_vendas (cliente_id,data_venda,total_venda,observacoes) values(?,?,?,?) ";
            
            // 2 passo - conectar o BD r organizar o comando sql
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,obj.getCliente().getId());
            stmt.setString(2,obj.getData_venda());
            stmt.setDouble(3,obj.getTotal_venda());
            
            stmt.setString(4,obj.getObs());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Venda Registrada com Sucesso!");
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null,"Erro: "+erro);
            
        }
        
      }
      
      
      
      //Retorna a ultima venda
      
      
      public int retornaUltimaVenda(){
          
          try {
              
              int idvenda = 0;
              
              String sql = "select max(id) id from vendas;";
              
              PreparedStatement ps = con.prepareStatement(sql);
              
              ResultSet rs = ps.executeQuery();
              
              if(rs.next()){
                  
                  Vendas p = new Vendas();
                  
                  p.setId(rs.getInt("id"));
                  
                  idvenda = p.getId();
                  
              }
              
              return idvenda;
              
             
          }catch(SQLException e){
              
              throw new RuntimeException(e);
          }
  
          
          
      };
      
      
    
    
 //fim classe
}
