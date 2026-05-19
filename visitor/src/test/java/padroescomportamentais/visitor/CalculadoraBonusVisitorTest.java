package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraBonusVisitorTest {
    @Test
    void deveCalcularBonusCorretamente() {
        Jogador arrascaeta = new Jogador("Arrascaeta", 100000.0);
        Treinador tite = new Treinador("Tite", 100000.0);

        CalculadoraBonusVisitor financeiro = new CalculadoraBonusVisitor();

        // O visitante inspeciona cada um sem alterar o código do Jogador ou Treinador
        arrascaeta.aceitar(financeiro); // 50.000 de bônus
        tite.aceitar(financeiro);       // 100.000 de bônus

        assertEquals(150000.0, financeiro.getTotalBonus());
    }
}