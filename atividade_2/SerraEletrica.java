// Arquivo: SerraEletrica.java
// 2. SUBCLASSE 3

public class SerraEletrica extends Ferramenta {

    // 1. Sobrescrever acao()
    @Override
    public void acao() {
        System.out.println("A serra elétrica está cortando madeira (Vrrrrm!).");
    }

    // 2. Sobrescrever descricao()
    @Override
    public void descricao() {
        System.out.println("--- Serra Elétrica ---");
        // 4. Acesso via getters
        System.out.println("Nome: " + getNome());
        System.out.printf("Valor: R$ %.2f\n", getValor());
    }

    // 3. Métodos próprios (2 métodos)
    public void ligarNaTomada() {
        System.out.println("Serra elétrica conectada na energia.");
    }

    public void trocarLamina() {
        System.out.println("Lâmina da serra trocada com segurança.");
    }
}