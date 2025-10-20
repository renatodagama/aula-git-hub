// Arquivo: TestePolimorfismo.java
// 3. CLASSE PRINCIPAL

public class TestePolimorfismo {
    public static void main(String[] args) {

        // Instancie cada objeto das subclasses
        Martelo martelo = new Martelo();
        ChaveDeFenda chave = new ChaveDeFenda();
        SerraEletrica serra = new SerraEletrica();

        // Use os setters para atribuir valores
        martelo.setNome("Martelo de Unha");
        martelo.setPeso(0.8);
        martelo.setCor("Madeira");
        martelo.setMaterial("Aço Forjado");
        martelo.setValor(45.50);

        chave.setNome("Chave Phillips Média");
        chave.setPeso(0.2);
        chave.setCor("Vermelha");
        chave.setMaterial("Aço Vanádio");
        chave.setValor(15.00);

        serra.setNome("Serra Tico-Tico");
        serra.setPeso(2.5);
        serra.setCor("Amarela");
        serra.setMaterial("Plástico e Metal");
        serra.setValor(250.00);


        System.out.println("--- TESTE INDIVIDUAL DOS OBJETOS ---");

        // --- Martelo ---
        System.out.println("\n--- Martelo ---");
        // Exiba os atributos com getters
        System.out.println("Atributo: " + martelo.getNome());
        // Chame os métodos
        martelo.acao();       // Sobrescrito
        martelo.descricao();  // Sobrescrito
        martelo.pregar("Madeira"); // Próprio
        martelo.arrancarPrego();   // Próprio

        // --- Chave de Fenda ---
        System.out.println("\n--- Chave de Fenda ---");
        // Exiba os atributos com getters
        System.out.println("Atributo: " + chave.getNome());
        // Chame os métodos
        chave.acao();       // Sobrescrito
        chave.descricao();  // Sobrescrito
        chave.apertarParafuso(); // Próprio
        chave.afrouxarParafuso();  // Próprio

        // --- Serra Elétrica ---
        System.out.println("\n--- Serra Elétrica ---");
        // Exiba os atributos com getters
        System.out.println("Atributo: " + serra.getNome());
        // Chame os métodos
        serra.acao();       // Sobrescrito
        serra.descricao();  // Sobrescrito
        serra.ligarNaTomada(); // Próprio
        serra.trocarLamina();    // Próprio


        // 4. DEMONSTRAÇÃO DE POLIMORFISMO
        System.out.println("\n=======================================================");
        System.out.println("--- DEMONSTRAÇÃO DE POLIMORFISMO (Método acao()) ---");
        
        // Criamos referências do tipo da CLASSE BASE (Ferramenta)
        Ferramenta f1 = martelo; // f1 aponta para um objeto Martelo
        Ferramenta f2 = chave;   // f2 aponta para um objeto ChaveDeFenda
        Ferramenta f3 = serra;   // f3 aponta para um objeto SerraEletrica

        // Chamamos o MESMO método (f.acao()) em referências do MESMO tipo (Ferramenta)
        // O Java executa a versão específica (sobrescrita) de cada objeto.
        
        System.out.print(f1.getNome() + ": ");
        f1.acao(); // Executa acao() de Martelo

        System.out.print(f2.getNome() + ": ");
        f2.acao(); // Executa acao() de ChaveDeFenda

        System.out.print(f3.getNome() + ": ");
        f3.acao(); // Executa acao() de SerraEletrica
    }
}