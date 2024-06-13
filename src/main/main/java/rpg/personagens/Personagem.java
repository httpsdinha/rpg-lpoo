package main.main.java.rpg.personagens;

import main.main.java.rpg.armas.Arma;


// Declaração da classe abstrata Personagem
public abstract class Personagem {
    // Atributos privados da classe
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    // Construtor da classe Personagem
    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma) {
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    // Método para imprimir o status do personagem
    public void printStatus() {
        if (estaMorto()) {
            System.out.printf("%s [Morto, Forca: %.1f, Destreza: %.1f, %s]%n", 
                              nomeTipo, forca, destreza, arma.getNome());
        } else {
            System.out.printf("%s [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]%n", 
                              nomeTipo, saude, forca, destreza, arma.getNome());
        }
    }

    // Método para realizar um ataque contra outro personagem
    public void atacar(Personagem oponente) {
        // Verifica se o personagem está morto
        if (this.estaMorto()){
            System.out.printf("O %s não consegue atacar, pois está morto.%n", this.nomeTipo);
        }else{
            // Verifica se o oponente está morto
            if (oponente.estaMorto()){
                System.out.printf("Pare! o %s já está morto!%n", oponente.nomeTipo);
            }else{
                // Realização do Ataque
                System.out.printf("O %s ataca o %s com %s.%n", this.nomeTipo, oponente.nomeTipo, this.arma.getNome());
                // Ataque bem sucedido
                if (this.destreza > oponente.destreza) {
                    double dano = this.calculaDano();
                    oponente.recebeDano(dano);
                    System.out.printf("O ataque foi efetivo com %.1f pontos de dano!%n", dano);
                // Ataque Mal sucedido
                } else if (this.destreza < oponente.destreza) {
                    double dano = oponente.calculaDano();
                    this.recebeDano(dano);
                    System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!%n", dano);
                // Ataque defendido
                } else {
                    System.out.printf("O ataque foi defendido, ninguem se machucou!%n");
                }
            }
        
        
        }
    } 
    
    // Método abstrato para calcular o dano do ataque
    private double calculaDano() {
        return this.forca * this.arma.getModificador();
    }

    // Método privado para receber dano
    private void recebeDano(double pontosDano) {
        this.saude -= pontosDano;
    }

    // Método privado para verificar se o personagem está morto
    private boolean estaMorto() {
        return saude < 1.0;
    }

    // Getters dos atributos da classe
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