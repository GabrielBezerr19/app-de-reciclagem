package com.example.upcycling2.model;

public class Reciclagem {
    int imgReciclagem;
    String reciclagemNome;

    String reciclagemDescricao;

    public Reciclagem(int imgReciclagem, String reciclagemNome, String reciclagemDescricao) {
        this.imgReciclagem = imgReciclagem;
        this.reciclagemNome = reciclagemNome;
        this.reciclagemDescricao = reciclagemDescricao;
    }

    public int getImgReciclagem() {
        return imgReciclagem;
    }

    public String getReciclagemNome() {
        return reciclagemNome;
    }


    public String getReciclagemDescricao() {
        return reciclagemDescricao;
    }

}
