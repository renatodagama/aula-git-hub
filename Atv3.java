/******************************************************************************
Implemente uma classe Atleta:
● Atributos privados:
1. nome (String)
2. modalidade (String)
3. idade (int)
4. pesoEmKg (double)
5. alturaEmMetros (double)
● Métodos:
1. Construtores para inicializar o atleta
2. Métodos getters e setters
3. Método calcularIMC() que retorne o índice de massa corporal
4. Método classificarCategoria() que retorne a categoria baseada na
idade e modalidade
● Crie um menu com do-while para:
1. Cadastrar novo atleta
2. Calcular IMC
3. Verificar categoria
4. Atualizar informações
5. Sair
                            
*******************************************************************************/

import java.util.Scanner;

// Classe Atleta
class Atleta {
    private String nome;
    private String modalidade;
    private int idade;
    private double pesoEmKg;
    private double alturaEmMetros;

    // Construtor
    public Atleta(String nome, String modalidade, int idade, double pesoEmKg, double alturaEmMetros) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.idade = idade;
        this.pesoEmKg = pesoEmKg;
        this.alturaEmMetros = alturaEmMetros;
    }

    // Getters
    public String getNome() { return nome; }
    public String getModalidade() { return modalidade; }
    public int getIdade() { return idade; }
    public double getPesoEmKg() { return pesoEmKg; }
    public double getAlturaEmMetros() { return alturaEmMetros; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setModalidade(String modalidade) { this.modalidade = modalidade; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setPesoEmKg(double pesoEmKg) {
        if (pesoEmKg > 0) {
            this.pesoEmKg = pesoEmKg;
        } else {
            System.out.println("Peso deve ser positivo.");
        }
    }
    public void setAlturaEmMetros(double alturaEmMetros) {
        if (alturaEmMetros > 0) {
            this.alturaEmMetros = alturaEmMetros;
        } else {
            System.out.println("Altura deve ser positiva.");
        }
    }

    // Método calcularIMC()
    public double calcularIMC() {
        if (alturaEmMetros == 0) return 0;
        // Fórmula IMC: peso / (altura * altura)
        return pesoEmKg / (alturaEmMetros * alturaEmMetros);
    }

    // Método classificarCategoria()
    public String classificarCategoria() {
        if (idade <= 12) return "Infantil";
        else if (idade <= 18) return "Juvenil";
        else if (idade <= 40) return "Adulto";
        else return "Master";
    }
}

// Classe principal com o menu
public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atleta atleta = null; // Objeto começa nulo
        int opcao = 0;

        do {
            System.out.println("\n--- Gerenciamento de Atletas ---");
            System.out.println("1. Cadastrar novo atleta");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Verificar categoria");
            System.out.println("4. Atualizar informações (Peso)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Modalidade: ");
                    String modalidade = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso (em Kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura (em Metros, ex: 1.75): ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine(); // Consome a nova linha

                    atleta = new Atleta(nome, modalidade, idade, peso, altura);
                    System.out.println("Atleta cadastrado com sucesso!");
                    break;

                case 2:
                    if (atleta != null) {
                        double imc = atleta.calcularIMC();
                        System.out.printf("O IMC do atleta %s é: %.2f\n", atleta.getNome(), imc);
                    } else {
                        System.out.println("É preciso cadastrar um atleta primeiro.");
                    }
                    break;

                case 3:
                    if (atleta != null) {
                        System.out.printf("A categoria do atleta %s é: %s\n", atleta.getNome(), atleta.classificarCategoria());
                    } else {
                        System.out.println("É preciso cadastrar um atleta primeiro.");
                    }
                    break;

                case 4:
                    if (atleta != null) {
                        System.out.print("Digite o novo peso (em Kg): ");
                        double novoPeso = scanner.nextDouble();
                        scanner.nextLine(); // Consome a nova linha
                        atleta.setPesoEmKg(novoPeso);
                        System.out.println("Peso atualizado com sucesso!");
                    } else {
                        System.out.println("É preciso cadastrar um atleta primeiro.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 5);

        scanner.close();
    }
}