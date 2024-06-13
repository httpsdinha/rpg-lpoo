package main.main.java.rpg.personagens;

import main.main.java.rpg.armas.Arma;

// Declaração da classe Clerigo que estende a classe Personagem
public class Clerigo extends Personagem {

    // Construtor da classe Clerigo
    public Clerigo(double saude, double forca, double destreza, Arma arma) {
        // Chama o construtor da superclasse Personagem para inicializar os atributos
        super("Clérigo", saude, forca, destreza, arma);
    }
}
