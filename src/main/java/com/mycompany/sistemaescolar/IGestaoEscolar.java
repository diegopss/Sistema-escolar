
package com.mycompany.sistemaescolar;

/**
 *
 * @author die-g
 */
public interface IGestaoEscolar {
    
    public void matricularAluno(String nome, String cpf, String ano, String turma);
    public void expulsarAluno(String matricula);
    public void cadastrarProfessor(String nome, String cpf);
}
