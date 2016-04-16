/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q7;

/**
 *
 * @author arthurcvm
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, int idade, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
}
