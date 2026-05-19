package padroescomportamentais.visitor;

public class Jogador implements MembroClube {
    private String nome;
    private double salarioBase;

    public Jogador(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() { return salarioBase; }

    @Override
    public void aceitar(ClubeVisitor visitante) {
        visitante.visitar(this);
    }
}