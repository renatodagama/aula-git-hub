/******************************************************************************
Atividade 4: Gerenciamento de Veículos
Crie uma classe Veiculo:
● Atributos privados:
1. modelo (String)
2. marca (String)
3. ano (int)
4. quilometragem (double)
● Métodos:
1. Construtores para inicializar os atributos
2. Métodos getters e setters
3. Método calcularIdadeVeiculo()
4. Método atualizarQuilometragem(double novaQuilometragem)
5. Método exibirInformacoes() que imprima todos os dados
● Implemente um programa com do-while para:
1. Cadastrar veículo
2. Atualizar quilometragem
3. Calcular idade do veículo
4. Exibir informações
5. Sair
                            
*******************************************************************************/

import java.util.Scanner;
import java.time.Year; // Para calcular a idade do veículo

// Classe Veiculo
class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double quilometragem;

    // Construtor
    public Veiculo(String modelo, String marca, int ano, double quilometragem) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    // Getters
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public int getAno() { return ano; }
    public double getQuilometragem() { return quilometragem; }

    // Setters
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setAno(int ano) { this.ano = ano; }

    // Método calcularIdadeVeiculo()
    public int calcularIdadeVeiculo() {
        int anoAtual = Year.now().getValue();
        return anoAtual - this.ano;
    }

    // Método atualizarQuilometragem()
    public void atualizarQuilometragem(double novaQuilometragem) {
        if (novaQuilometragem > this.quilometragem) {
            this.quilometragem = novaQuilometragem;
            System.out.println("Quilometragem atualizada.");
        } else {
            System.out.println("Erro: A nova quilometragem deve ser maior que a atual.");
        }
    }

    // Método exibirInformacoes()
    public void exibirInformacoes() {
        System.out.println("--- Informações do Veículo ---");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.printf("Quilometragem: %.1f Km\n", this.quilometragem);
    }
}

// Classe principal com o menu
public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo = null; // Objeto começa nulo
        int opcao = 0;

        do {
            System.out.println("\n--- Gerenciamento de Veículos ---");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Atualizar quilometragem");
            System.out.println("3. Calcular idade do veículo");
            System.out.println("4. Exibir informações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ano de Fabricação: ");
                    int ano = scanner.nextInt();
                    System.out.print("Quilometragem: ");
                    double km = scanner.nextDouble();
                    scanner.nextLine(); // Consome a nova linha

                    veiculo = new Veiculo(modelo, marca, ano, km);
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    if (veiculo != null) {
                        System.out.print("Digite a nova quilometragem: ");
                        double novaKm = scanner.nextDouble();
                        scanner.nextLine(); // Consome a nova linha
                        veiculo.atualizarQuilometragem(novaKm);
                    } else {
                        System.out.println("É preciso cadastrar um veículo primeiro.");
                    }
                    break;

                case 3:
                    if (veiculo != null) {
                        int idade = veiculo.calcularIdadeVeiculo();
                        System.out.printf("O veículo %s tem %d anos de uso.\n", veiculo.getModelo(), idade);
                    } else {
                        System.out.println("É preciso cadastrar um veículo primeiro.");
                    }
                    break;

                case 4:
                    if (veiculo != null) {
                        veiculo.exibirInformacoes();
                    } else {
                        System.out.println("É preciso cadastrar um veículo primeiro.");
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