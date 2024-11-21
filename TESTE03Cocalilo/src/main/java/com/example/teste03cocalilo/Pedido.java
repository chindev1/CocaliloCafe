package com.example.teste03cocalilo;

public class Pedido {
    private double valorDoces = 0;
    private double valorSalgados = 0;
    private double valorBebidas = 0;

    public double getValorDoces() {
        return valorDoces;
    }

    public void adicionarDoces(double valor) {
        this.valorDoces += valor;
    }

    public double getValorSalgados() {
        return valorSalgados;
    }

    public void adicionarSalgados(double valor) {
        this.valorSalgados += valor;
    }

    public double getValorBebidas() {
        return valorBebidas;
    }

    public void adicionarBebidas(double valor) {
        this.valorBebidas += valor;
    }

    public double getValorTotal() {
        return valorDoces + valorSalgados + valorBebidas;
    }
}
