package padroescomportamentais.visitor;

public class CalculadoraBonusVisitor implements ClubeVisitor {
    private double totalBonusDistribuido = 0;

    @Override
    public void visitar(Jogador jogador) {
        // Jogador ganha 50% do salário como bônus de título
        totalBonusDistribuido += jogador.getSalarioBase() * 0.50;
    }

    @Override
    public void visitar(Treinador treinador) {
        // Treinador ganha 100% do salário como bônus
        totalBonusDistribuido += treinador.getSalarioBase() * 1.0;
    }

    public double getTotalBonus() {
        return totalBonusDistribuido;
    }
}