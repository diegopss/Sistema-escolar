
package com.mycompany.sistemaescolar;


/**
 *
 * @author die-g
 */
public abstract class Pessoa {
    
    private String nome;
    private String cpf;


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
   
    
    
}
