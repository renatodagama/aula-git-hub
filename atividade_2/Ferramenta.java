

// Arquivo: Ferramenta.java
// 1. CLASSE BASE

public class Ferramenta {
    // Atributos privados (5)
    private String nome;
    private double peso;
    private String cor;
    private String material;
    private double valor;

    // 3. Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    // 2. Método genérico acao()
    public void acao() {
        System.out.println("A ferramenta genérica está sendo usada.");
    }

    // 2. Método genérico descricao()
    public void descricao() {
        System.out.println("--- Descrição Genérica ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Material: " + this.material);
    }
}