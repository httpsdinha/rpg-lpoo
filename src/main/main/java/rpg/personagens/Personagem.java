package main.main.java.rpg.personagens;

import main.main.java.rpg.armas.Arma;

public abstract class Personagem {
    protected double saude;
    protected double forca;
    protected double destreza;
    protected Arma arma;

    public Personagem(double saude, double forca, double destreza, Arma arma) {
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    public abstract void atacar(Personagem oponente);

    public void sofrerDano(double dano) {
        this.saude -= dano;
    }

    public boolean estaMorto() {
        return this.saude < 1.0;
    }

    public double getForca() {
        return forca;
    }

    public double getDestreza() {
        return destreza;
    }

    public Arma getArma() {
        return arma;
    }
    public String getStatus() {
        if (estaMorto()) {
            return String.format("%s [Morreu, Forca: %.1f, Destreza: %.1f, %s]", 
                                 this.getClass().getSimpleName(), this.forca, this.destreza, arma.getNome());
        } else {
            return String.format("%s [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]", 
                                 this.getClass().getSimpleName(), this.saude, this.forca, this.destreza, arma.getNome());
        }
    }

    
}