package com.jv.applistacurso.model;

public class Pessoa {
    private String primeiroNnome;
    private String sobrenome;
    private String cursoDesejado;
    private String telefoneContato;


    public Pessoa() {
    }

    public String getPrimeiroNnome() {
        return primeiroNnome;
    }

    public void setPrimeiroNnome(String primeiroNnome) {
        this.primeiroNnome = primeiroNnome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
