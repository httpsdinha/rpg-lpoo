package main.main.java.rpg.armas;

// Declaração da classe ArmaMago que estende a classe abstrata Arma
public class ArmaMago extends Arma {
    // Construtor da classe ArmaMago
    public ArmaMago(String nome, double modificador) {
        // Chama o construtor da superclasse Arma para inicializar os atributos nome e modificador
        super(nome, modificador);
    }
}
