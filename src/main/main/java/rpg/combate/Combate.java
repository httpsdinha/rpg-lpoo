package main.main.java.rpg.combate;

import main.main.java.rpg.personagens.Personagem;

public class Combate {
    public static void realizarAtaque(Personagem atacante, Personagem defensor) {
        System.out.println("===================================");
        System.out.println("Iniciando ataque de " + atacante.getClass().getSimpleName() + " contra " + defensor.getClass().getSimpleName());
        
        if (atacante.estaMorto()) {
            System.out.println("Ataque impossível! " + atacante.getClass().getSimpleName() + " está morto.");
            return;
        }
        
        if (defensor.estaMorto()) {
            System.out.println("Ataque impossível! " + defensor.getClass().getSimpleName() + " está morto.");
            return;
        }
        
        System.out.println("O " + atacante.getClass().getSimpleName() + " ataca o " + defensor.getClass().getSimpleName() + " com " + atacante.getArma().getNome() + ".");

        if (atacante.getForca() > defensor.getForca() && atacante.getDestreza() > defensor.getDestreza()) {
            double dano = atacante.getForca() * atacante.getArma().getModificador();
            defensor.sofrerDano(dano);
            System.out.println("O ataque foi efetivo com " + dano + " pontos de dano!");
        } else if (atacante.getForca() < defensor.getForca() || atacante.getDestreza() < defensor.getDestreza()) {
            double dano = defensor.getForca() * defensor.getArma().getModificador();
            atacante.sofrerDano(dano);
            System.out.println("O ataque foi inefetivo e revidado com " + dano + " pontos de dano!");
        } else {
            System.out.println("O ataque foi defendido, ninguem se machucou!");
        }
    }
}