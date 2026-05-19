package sempadrao.visitor;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraFinanceiraTest {

    @Test
    void deveCalcularBonusComVariosIfs() {
        Jogador arrascaeta = new Jogador(100000.0);
        Treinador tite = new Treinador(100000.0);

        List<MembroClube> equipe = Arrays.asList(arrascaeta, tite);
        CalculadoraFinanceira calc = new CalculadoraFinanceira();

        // Funciona, mas o código da Calculadora é horrível de manter!
        assertEquals(150000.0, calc.calcularBonusCampeonato(equipe));
    }
}