package main.main.java.rpg.personagens;

import main.main.java.rpg.armas.Arma;

// Declaração da classe Mago que estende a classe Personagem
public class Mago extends Personagem {

    // Construtor da classe Mago
    public Mago(double saude, double forca, double destreza, Arma arma) {
        // Chama o construtor da superclasse Personagem para inicializar os atributos
        super("Mago", saude, forca, destreza, arma);
    }
}
