/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar;

import com.mycompany.sistemaescolar.bancodedados.Alunos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author die-g
 */
public class Escola implements IGestaoEscolar{

    public Alunos alunos = new Alunos();
    public Professor professor;
    
    public Escola() {
        
    }
    

    @Override
    public void matricularAluno(String nome, String cpf, String ano, String turma) {
        Aluno aluno = new Aluno(nome, cpf, ano, turma);
        alunos.adicionarAluno(aluno);
    }

    @Override
    public void cadastrarProfessor(String nome, String cpf) {
        this.professor = new Professor(nome, cpf);
    }

    @Override
    public void expulsarAluno(String matricula) {
        alunos.removerAluno(alunos.buscarporMatricula(matricula));
                
                }
                
}
        
    
    
    
    

