// Arquivo: Martelo.java
// 2. SUBCLASSE 1

public class Martelo extends Ferramenta {

    // 1. Sobrescrever acao()
    @Override
    public void acao() {
        System.out.println("O martelo está batendo em um prego.");
    }

    // 2. Sobrescrever descricao()
    @Override
    public void descricao() {
        System.out.println("--- Martelo ---");
        // 4. Acesso via getters da classe base
        System.out.println("Nome: " + getNome());
        System.out.println("Material: " + getMaterial() + " com cabo de " + getCor());
    }

    // 3. Métodos próprios (2 métodos)
    public void pregar(String superficie) {
        System.out.println("Pregando na " + superficie + ".");
    }

    public void arrancarPrego() {
        System.out.println("Usando a orelha do martelo para arrancar um prego.");
    }
}