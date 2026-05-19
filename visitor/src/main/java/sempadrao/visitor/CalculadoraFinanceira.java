package sempadrao.visitor;

import java.util.List;

public class CalculadoraFinanceira {
    public double calcularBonusCampeonato(List<MembroClube> membros) {
        double total = 0;

        for (MembroClube membro : membros) {
            if (membro instanceof Jogador) {
                total += membro.getSalarioBase() * 0.50;
            } else if (membro instanceof Treinador) {
                total += membro.getSalarioBase() * 1.0;
            }
        }

        return total;
    }
}