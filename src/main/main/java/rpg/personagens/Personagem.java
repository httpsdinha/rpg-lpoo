package main.main.java.rpg.personagens;

import main.main.java.rpg.armas.Arma;

public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma) {
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    public void printStatus() {
        if (estaMorto()) {
            System.out.printf("%s [Morreu, Força: %.1f, Destreza: %.1f, %s]%n", 
                              nomeTipo, forca, destreza, arma.getNome());
        } else {
            System.out.printf("%s [Saúde: %.1f, Força: %.1f, Destreza: %.1f, %s]%n", 
                              nomeTipo, saude, forca, destreza, arma.getNome());
        }
    }

    public void atacar(Personagem oponente) {
        // Realização do Ataque
        System.out.printf("O %s ataca o %s com %s.%n", this.nomeTipo, oponente.nomeTipo, this.arma.getNome());

        // Ataque bem sucedido
        if (this.forca > oponente.forca && this.destreza > oponente.destreza) {
            double dano = this.calculaDano();
            oponente.recebeDano(dano);
            System.out.printf("O ataque foi efetivo com %.1f pontos de dano!%n", dano);
        } else if (this.forca < oponente.forca && this.destreza < oponente.destreza){
            double dano = oponente.calculaDano();
            this.recebeDano(dano);
            System.out.printf("O ataque foi efetivo com %.1f pontos de dano!%n", dano);

        // Ataque Mal sucedido
        } else if (this.forca < oponente.forca || this.destreza < oponente.destreza) {
            double dano = oponente.calculaDano();
            this.recebeDano(dano);
            System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!%n", dano);
        } else if (this.forca > oponente.forca || this.destreza > oponente.destreza){
            double dano = this.calculaDano();
            oponente.recebeDano(dano);
            System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!%n", dano);

        // Ataque defendido
        } else if (this.forca == oponente.forca && this.destreza == oponente.destreza) {
            System.out.println("O ataque foi defendido, ninguém se machucou!");
        }
    }

    private double calculaDano() {
        return this.forca * this.arma.getModificador();
    }

    private void recebeDano(double pontosDano) {
        this.saude -= pontosDano;
    }

    private boolean estaMorto() {
        return saude < 1.0;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public double getSaude() {
        return saude;
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
}