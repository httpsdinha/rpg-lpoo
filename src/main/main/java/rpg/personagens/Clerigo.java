package main.main.java.rpg.personagens;

import main.main.java.rpg.armas.Arma;
import main.main.java.rpg.combate.*;

public class Clerigo extends Personagem {
    public Clerigo(double saude, double forca, double destreza, Arma arma) {
        super(saude, forca, destreza, arma);
    }

    @Override
    public void atacar(Personagem oponente) {
        Combate.realizarAtaque(this, oponente);
    }
}