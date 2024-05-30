package main.main.java.rpg;

import main.main.java.rpg.personagens.*;
import main.main.java.rpg.armas.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Leitura e criação dos personagens
        Personagem[] personagens = new Personagem[2];
        for (int i = 0; i < 2; i++) {
            int tipo = scanner.nextInt();
            double saude = scanner.nextDouble();
            double forca = scanner.nextDouble();
            double destreza = scanner.nextDouble();
            int codigoArma = scanner.nextInt();
            Arma arma = criarArma(tipo, codigoArma);
            personagens[i] = criarPersonagem(tipo, saude, forca, destreza, arma);
        }

        // Impressão dos status iniciais dos personagens
        for (Personagem p : personagens) {
            System.out.println(p.getStatus());
        }

        // Leitura e processamento da sequência de ataques
        while (true) {
            int atacanteIndex = scanner.nextInt();
            if (atacanteIndex == 0) {
                break;
            }
            int defensorIndex = scanner.nextInt();

            Personagem atacante = personagens[atacanteIndex - 1];
            Personagem defensor = personagens[defensorIndex - 1];
            atacante.atacar(defensor);

            // Impressão dos status dos personagens após cada ataque
            for (Personagem p : personagens) {
                System.out.println(p.getStatus());
            }
        }

        scanner.close();
    }

    private static Arma criarArma(int tipoPersonagem, int codigoArma) {
        switch (tipoPersonagem) {
            case 1:
                return criarArmaMago(codigoArma);
            case 2:
                return criarArmaPaladino(codigoArma);
            case 3:
                return criarArmaClerigo(codigoArma);
            default:
                return null;
        }
    }

    private static Arma criarArmaMago(int codigoArma) {
        switch (codigoArma) {
            case 1:
                return new ArmaMagiaTransmutacao();
            case 2:
                return new ArmaPsiKappa();
            default:
                return null;
        }
    }

    private static Arma criarArmaPaladino(int codigoArma) {
        switch (codigoArma) {
            case 1:
                return new ArmaEspada();
            case 2:
                return new ArmaLança();
            default:
                return null;
        }
    }

    private static Arma criarArmaClerigo(int codigoArma) {
        switch (codigoArma) {
            case 1:
                return new ArmaMartelo();
            case 2:
                return new ArmaMaça();
            default:
                return null;
        }
    }

    private static Personagem criarPersonagem(int tipo, double saude, double forca, double destreza, Arma arma) {
        switch (tipo) {
            case 1:
                return new Mago(saude, forca, destreza, arma);
            case 2:
                return new Paladino(saude, forca, destreza, arma);
            case 3:
                return new Clerigo(saude, forca, destreza, arma);
            default:
                return null;
        }
    }
}