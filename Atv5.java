/******************************************************************************
Atividade 5: Sistema de Gerenciamento de Animais
Desenvolva uma classe Animal:
● Atributos privados:
1. nome (String)
2. especie (String)
3. idade (int)
4. peso (double)
● Métodos:
1. Construtores para inicializar o animal
2. Métodos getters e setters
3. Método calcularIdadeEmAnosHumanos()
4. Método atualizarPeso(double novoPeso)
5. Método classificarPorte()
● Crie um menu com do-while para:
1. Cadastrar novo animal
2. Atualizar peso
3. Calcular idade em anos humanos
4. Verificar porte
5. Exibir informações
6. Sair
                            
*******************************************************************************/

import java.util.Scanner;

// Classe Animal
class Animal {
    private String nome;
    private String especie;
    private int idade;
    private double peso;

    // Construtor
    public Animal(String nome, String especie, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEspecie() { return especie; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setEspecie(String especie) { this.especie = especie; }
    public void setIdade(int idade) { this.idade = idade; }

    // Método calcularIdadeEmAnosHumanos()
    public int calcularIdadeEmAnosHumanos() {
        // Implementação simples (ex: 1 ano do animal = 7 anos humanos)
        return this.idade * 7;
    }

    // Método atualizarPeso()
    public void atualizarPeso(double novoPeso) {
        if (novoPeso > 0) {
            this.peso = novoPeso;
            System.out.println("Peso atualizado.");
        } else {
            System.out.println("Erro: O peso deve ser um valor positivo.");
        }
    }

    // Método classificarPorte()
    public String classificarPorte() {
        if (this.peso <= 5) return "Pequeno";
        else if (this.peso <= 20) return "Médio";
        else return "Grande";
    }

    // Método extra (solicitado no menu, item 5)
    public void exibirInformacoes() {
        System.out.println("--- Informações do Animal ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.printf("Peso: %.2f Kg\n", this.peso);
    }
}

// Classe principal com o menu
public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null; // Objeto começa nulo
        int opcao = 0;

        do {
            System.out.println("\n--- Gerenciamento de Animais ---");
            System.out.println("1. Cadastrar novo animal");
            System.out.println("2. Atualizar peso");
            System.out.println("3. Calcular idade em anos humanos");
            System.out.println("4. Verificar porte");
            System.out.println("5. Exibir informações");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Espécie (ex: Cachorro, Gato): ");
                    String especie = scanner.nextLine();
                    System.out.print("Idade (anos): ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso (Kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); // Consome a nova linha

                    animal = new Animal(nome, especie, idade, peso);
                    System.out.println("Animal cadastrado com sucesso!");
                    break;

                case 2:
                    if (animal != null) {
                        System.out.print("Digite o novo peso (Kg): ");
                        double novoPeso = scanner.nextDouble();
                        scanner.nextLine(); // Consome a nova linha
                        animal.atualizarPeso(novoPeso);
                    } else {
                        System.out.println("É preciso cadastrar um animal primeiro.");
                    }
                    break;

                case 3:
                    if (animal != null) {
                        int idadeHumana = animal.calcularIdadeEmAnosHumanos();
                        System.out.printf("A idade de %s em anos humanos é aproximadamente %d anos.\n", animal.getNome(), idadeHumana);
                    } else {
                        System.out.println("É preciso cadastrar um animal primeiro.");
                    }
                    break;

                case 4:
                    if (animal != null) {
                        System.out.printf("O porte de %s é: %s\n", animal.getNome(), animal.classificarPorte());
                    } else {
                        System.out.println("É preciso cadastrar um animal primeiro.");
                    }
                    break;
                
                case 5:
                    if (animal != null) {
                        animal.exibirInformacoes();
                    } else {
                        System.out.println("É preciso cadastrar um animal primeiro.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 6);

        scanner.close();
    }
}