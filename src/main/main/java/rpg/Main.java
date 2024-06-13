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
            p.printStatus();
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
                p.printStatus();
            }
        }

        scanner.close();
    }

    private static Arma criarArma(int tipo, int codigoArma) {
        switch (tipo) {
            case 1: // Mago
                if (codigoArma == 1) return new ArmaMago("Magia da Transmutação", 0.25);
                if (codigoArma == 2) return new ArmaMago("Psi-kappa", 0.5);
                break;
            case 2: // Paladino
                if (codigoArma == 1) return new ArmaPaladino("Espada", 0.3);
                if (codigoArma == 2) return new ArmaPaladino("Lança", 0.5);
                break;
            case 3: // Clérigo
                if (codigoArma == 1) return new ArmaClerigo("Martelo", 0.6);
                if (codigoArma == 2) return new ArmaClerigo("Maça", 0.4);
                break;
            default:
                return null;
        }
        return null;
    }

    private static Personagem criarPersonagem(int tipo, double saude, double forca, double destreza, Arma arma) {
        switch (tipo) {
            case 1: return new Mago(saude, forca, destreza, (ArmaMago) arma);
            case 2: return new Paladino(saude, forca, destreza, (ArmaPaladino) arma);
            case 3: return new Clerigo(saude, forca, destreza, (ArmaClerigo) arma);
            default: return null;
        }
    }
}