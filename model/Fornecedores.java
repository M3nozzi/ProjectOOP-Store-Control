/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projectpoo.model;

/**
 *
 * @author Fabio Menozzi
 */
public class Fornecedores extends Clientes {
    
    
    // Atributos
    
    private String cnpj;
    

    //Getters and Setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    //Para exibir o nome do fornecedor no combobox e nao o local na memoria do objeto
    
    @Override
    public String toString(){
        
        return this.getNome();
        
       // return this.getCnpj(); 
        
    }
    
    
}
