package com.artur.service;

public class Normal implements Frete {

    public double calcularPreco(int distancia) {
        double preco = distancia * 1.25 + 10;
        return preco;
    }
}
