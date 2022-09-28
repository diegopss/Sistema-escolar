
package com.mycompany.sistemaescolar;

import com.mycompany.sistemaescolar.bancodedados.Disciplinas;
import java.util.ArrayList;

/**
 *
 * @author die-g
 */
public class Aluno extends Pessoa {
    
    private String Matricula;
    public Disciplinas disciplinasCursando;
    private String ano;
    private String turma;
    //private String turno;
    
    public Aluno(String nome, String cpf, String ano, String turma) {
        super(nome, cpf);
        this.ano = ano;
        this.turma = turma;
        this.Matricula = "";
        this.disciplinasCursando = new Disciplinas();
        for (int i = 0; i<3; i++){
           this.Matricula += nome.charAt(i);
           this.Matricula += cpf.charAt(i);
        }
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }


    public ArrayList<Disciplina> getDisciplinasCursando() {
        return this.disciplinasCursando.getDisciplinas();
    }

    public void setDisciplinasCursando(Disciplinas disciplinasCursando) {
        this.disciplinasCursando = disciplinasCursando;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    //public String getTurno(){
        //return turno;
    //}
    //public void setTurno(String turno){
        //this.turno = turno;
    //}

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
    
    public String statusAlunoDisciplina(String nomeDisciplina){
        for(Disciplina i : disciplinasCursando.getDisciplinas()){
            if(i.getNome().equals(nomeDisciplina)){
                if(i.getFalta() >= 20){
                    return "Reprovado";
                }else if(i.media() < 7.0){
                    return "Reprovado";
                }else if(i.media() >= 7.0){
                    return "Aprovado";
            }
        }
    }
        return "Cursando";
    }


}
