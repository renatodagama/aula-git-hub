// Arquivo: ChaveDeFenda.java
// 2. SUBCLASSE 2

public class ChaveDeFenda extends Ferramenta {

    // 1. Sobrescrever acao()
    @Override
    public void acao() {
        System.out.println("A chave de fenda está girando um parafuso.");
    }

    // 2. Sobrescrever descricao()
    @Override
    public void descricao() {
        System.out.println("--- Chave de Fenda ---");
        // 4. Acesso via getters
        System.out.println("Nome: " + getNome());
        System.out.println("Material: " + getMaterial());
    }

    // 3. Métodos próprios (2 métodos)
    public void apertarParafuso() {
        System.out.println("Apertando o parafuso (sentido horário).");
    }

    public void afrouxarParafuso() {
        System.out.println("Afrouxando o parafuso (sentido anti-horário).");
    }
}