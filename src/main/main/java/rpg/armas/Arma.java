package main.main.java.rpg.armas;

// Declaração da classe abstrata Arma
public abstract class Arma {
    // Atributos privados da classe
    private String nome;
    private double modificador;

    // Construtor da classe Arma
    public Arma(String nome, double modificador) {
        this.nome = nome; // Inicializa o nome da arma
        this.modificador = modificador; // Inicializa o modificador da arma
    }

    // Método público para obter o nome da arma
    public String getNome() {
        return nome;
    }

    // Método público para obter o modificador da arma
    public double getModificador() {
        return modificador;
    }
}
