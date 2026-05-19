package padroescomportamentais.visitor;

public interface ClubeVisitor {
    void visitar(Jogador jogador);
    void visitar(Treinador treinador);
}