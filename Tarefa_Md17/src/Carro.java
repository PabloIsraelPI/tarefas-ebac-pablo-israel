import java.util.ArrayList;
import java.util.List;

abstract class Carro {
    //Adiciona atributos a classe abstrata Carro
    private String marca;
    private String modelo;
    private int ano;

    // Construtor dos atributos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // Getters de cada atributo
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    // Método para apresentar o objeto como uma string
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}




