/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar.bancodedados;

import com.mycompany.sistemaescolar.Disciplina;
import java.util.ArrayList;

/**
 *
 * @author die-g
 */
public class Disciplinas {
    private ArrayList<Disciplina> disciplinas;

    public Disciplinas() {
        this.disciplinas = new ArrayList<>();
        Disciplina portugues = new Disciplina("Português");
        Disciplina matematica = new Disciplina("Matemática");
        Disciplina historia = new Disciplina("História");
        Disciplina geografia = new Disciplina("Geografia");
        Disciplina quimica = new Disciplina("Química");
        Disciplina fisica = new Disciplina("Física");
        Disciplina edFisica = new Disciplina("ED.Física");
        
        
        disciplinas.add(portugues);
        disciplinas.add(matematica);
        disciplinas.add(historia);
        disciplinas.add(geografia);
        disciplinas.add(quimica);
        disciplinas.add(fisica);
        disciplinas.add(edFisica);
        
    }
    public Disciplina buscarNome(String nome){
       for(Disciplina i : disciplinas){
           if(i.getNome().equals(nome)){
               return i;
           }
       }return null;
   }

    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void addNota1(String nomeDisciplina,double nota) {
        for(Disciplina i : disciplinas){
            if(i.getNome() == nomeDisciplina){
                i.setNota1(nota);
            }
        }
    }
    public void addNota2(String nomeDisciplina,double nota) {
        for(Disciplina i : disciplinas){
            if(i.getNome() == nomeDisciplina){
                i.setNota2(nota);
            }
        }
    }
   
    public void addNota3(String nomeDisciplina,double nota) {
        for(Disciplina i : disciplinas){
            if(i.getNome() == nomeDisciplina){
                i.setNota3(nota);
            }
        }
    }
   
    public void addNota4(String nomeDisciplina,double nota) {
        for(Disciplina i : disciplinas){
            if(i.getNome() == nomeDisciplina){
                i.setNota4(nota);
            }
        }
    }
    
    public void addFalta(String nomeDisciplina,int falta) {
        for(Disciplina i : disciplinas){
            if(i.getNome() == nomeDisciplina){
                i.setFalta(falta);
            }

        }
    }
    
}