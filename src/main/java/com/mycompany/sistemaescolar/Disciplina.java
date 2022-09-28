
package com.mycompany.sistemaescolar;

/**
 *
 * @author die-g
 */
public class Disciplina {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private int falta;

    public Disciplina(String nome) {
        this.nome = nome;
        this.falta = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
    
    public double media(){
        double media;
        media = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
        return media;
    }
    
    public String Status(){
        if(this.getFalta() >= 20){
                    return "Rep.Falta";
                }else if(this.media() < 7.0){
                    return "Reprovado";
                }else if(this.media() >= 7.0){
                    return "Aprovado";
            }return "Cursando";
    }
    
}
