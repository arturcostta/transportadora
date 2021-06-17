package com.artur.service;

public class Sedex implements Frete {

    public double calcularPreco(int distancia) {
        double preco = distancia * 1.45 + 12;
        return preco;
    }
}
