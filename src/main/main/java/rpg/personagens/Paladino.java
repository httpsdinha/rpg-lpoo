package main.main.java.rpg.personagens;

import main.main.java.rpg.armas.Arma;

// Declaração da classe Paladino que estende a classe Personagem
public class Paladino extends Personagem {

    // Construtor da classe Paladino
    public Paladino(double saude, double forca, double destreza, Arma arma) {
        // Chama o construtor da superclasse Personagem para inicializar os atributos
        super("Paladino", saude, forca, destreza, arma);
    }
}
