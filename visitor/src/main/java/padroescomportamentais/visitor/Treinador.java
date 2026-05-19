package padroescomportamentais.visitor;

public class Treinador implements MembroClube {
    private String nome;
    private double salarioBase;

    public Treinador(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() { return salarioBase; }

    @Override
    public void aceitar(ClubeVisitor visitante) {
        visitante.visitar(this);
    }
}
