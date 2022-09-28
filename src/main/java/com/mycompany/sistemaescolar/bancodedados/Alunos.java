/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar.bancodedados;

import com.mycompany.sistemaescolar.Aluno;
import java.util.ArrayList;

/**
 *
 * @author die-g
 */
public class Alunos {

    
   private ArrayList<Aluno> alunos;

    public Alunos() {
        this.alunos = new ArrayList<>();
        Aluno a1 = new Aluno("Diego Passos", "7015456663", "3", "B");
        Aluno a2 = new Aluno("Samuel Souza", "8045456663", "3", "B");
        a1.disciplinasCursando.addNota1("Português", 9);
        a1.disciplinasCursando.addNota2("Português", 8);
        a1.disciplinasCursando.addNota3("Português", 7);
        a1.disciplinasCursando.addNota4("Português", 7);
        
        a1.disciplinasCursando.addNota1("Matemática", 7);
        a1.disciplinasCursando.addNota2("Matemática", 6);
        a1.disciplinasCursando.addNota3("Matemática", 4);
        a1.disciplinasCursando.addNota4("Matemática", 4);
        
        a1.disciplinasCursando.addNota1("História", 8);
        a1.disciplinasCursando.addNota2("História", 7);
        a1.disciplinasCursando.addNota3("História", 8);
        a1.disciplinasCursando.addNota4("História", 9);
        a1.disciplinasCursando.addFalta("História", 34);
        
        a1.disciplinasCursando.addNota1("Geografia", 7.5);
        a1.disciplinasCursando.addNota2("Geografia", 6.5);
        a1.disciplinasCursando.addNota3("Geografia", 6.0);
        a1.disciplinasCursando.addNota4("Geografia", 8);
        
        a1.disciplinasCursando.addNota1("Química", 7.5);
        a1.disciplinasCursando.addNota2("Química", 6.5);
        a1.disciplinasCursando.addNota3("Química", 6.0);
        a1.disciplinasCursando.addNota4("Química", 8);
        
        a1.disciplinasCursando.addNota1("Física", 7.5);
        a1.disciplinasCursando.addNota2("Física", 6.5);
        a1.disciplinasCursando.addNota3("Física", 6.0);
        a1.disciplinasCursando.addNota4("Física", 8);
        
        a1.disciplinasCursando.addNota1("ED.Física", 7.5);
        a1.disciplinasCursando.addNota2("ED.Física", 6.5);
        a1.disciplinasCursando.addNota3("ED.Física", 6.0);
        a1.disciplinasCursando.addNota4("ED.Física", 8);
        
        
        
        alunos.add(a1);
        alunos.add(a2);
    }
   
   public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
   
   public void adicionarAluno(Aluno aluno){
       alunos.add(aluno);
   } 
   public void removerAluno(Aluno aluno){
       alunos.remove(aluno);
   
   }
   public Aluno buscarporMatricula(String matricula){
       for(Aluno i :alunos ){
           if(i.getMatricula().equals(matricula)){
               return i;
               
           }
       }return null;
   }

   public Aluno buscar(String nome, String ano, String turma){
       for(Aluno i : this.alunos){
           if(i.getNome().equals(nome) && i.getAno().equals(ano) && i.getTurma().equals(turma))
                return i;
               }
       return null;
      
        
   }

   public ArrayList<Aluno> buscarPorTurma(String ano, String turma){
       ArrayList<Aluno> alunosPorTurma = new ArrayList<>();
       for(Aluno i : this.alunos){
           if(i.getAno() == ano && i.getTurma() == turma){
               alunosPorTurma.add(i);
           }
       }   
       return alunosPorTurma;
   }
   


   
}
