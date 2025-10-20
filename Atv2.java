/******************************************************************************
Atividade 2: Controle de Estoque de Produtos
Desenvolva uma classe Produto com:
● Atributos privados:
1. nome (String)
2. codigo (String)
3. quantidade (int)
4. precoUnitario (double)
● Métodos:
1. Construtor padrão
2. Construtor com todos os parâmetros
3. Métodos getters e setters
4. Método adicionarEstoque(int quantidade) que incremente a
quantidade
5. Método removerEstoque(int quantidade) que decremente a
quantidade

● Crie um programa com menu do-while para:
1. Cadastrar novo produto
2. Adicionar estoque
3. Remover estoque
4. Calcular valor total do estoque
5. Sair do programa
                            
*******************************************************************************/
import java.util.Scanner;

class Produto {
    // Atributos privados (características)
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    // 1. Construtor padrão (sem argumentos)
    public Produto() {
        // Inicializa o objeto com valores padrão (opcional, mas boa prática)
        this.nome = "Não definido";
        this.codigo = "0000";
        this.quantidade = 0;
        this.precoUnitario = 0.0;
    }

    // 2. Construtor com todos os parâmetros
    public Produto(String nome, String codigo, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // --- GETTERS ---
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    // --- SETTERS (com validação) ---
    public void setNome(String nome) {
        // A condição verificar se NÃO é nulo e NÃO está vazio
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("ERRO: O nome não pode estar vazio.");
        }
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("ERRO: Código não pode estar vazio.");
        }
    }

    public void setQuantidade(int quantidade) {
        // A quantidade pode ser 0 (sem estoque), então a validação é >= 0
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("ERRO: A quantidade não pode ser negativa.");
        }
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            System.out.println("ERRO: O preço unitário deve ser maior que zero.");
        }
    }

    // --- MÉTODOS ADICIONAIS ---

    /**
     * Adiciona uma quantidade ao estoque do produto.
     * param quantidadeParaAdicionar A quantidade a ser adicionada (deve ser positiva).
     */
    public void adicionarEstoque(int quantidadeParaAdicionar) {
        if (quantidadeParaAdicionar > 0) {
            this.quantidade += quantidadeParaAdicionar;
            System.out.println(quantidadeParaAdicionar + " unidades adicionadas ao estoque de '" + this.nome + "'.");
        } else {
            System.out.println("ERRO: A quantidade a ser adicionada deve ser positiva.");
        }
    }

    /**
     * Remove uma quantidade do estoque do produto.
     * param quantidadeParaRemover A quantidade a ser removida (deve ser positiva e não pode ser maior que o estoque atual).
     */
    public void removerEstoque(int quantidadeParaRemover) {
        if (quantidadeParaRemover <= 0) {
            System.out.println("ERRO: A quantidade a ser removida deve ser positiva.");
        } else if (this.quantidade >= quantidadeParaRemover) {
            this.quantidade -= quantidadeParaRemover;
            System.out.println(quantidadeParaRemover + " unidades removidas do estoque de '" + this.nome + "'.");
        } else {
            System.out.println("ERRO: Estoque insuficiente. Você tentou remover " + quantidadeParaRemover + ", mas só há " + this.quantidade + " em estoque.");
        }
    }
    
    /**
     * Calcula o valor total do estoque do produto (quantidade * preço).
     * return O valor total em double.
     */
    public double calcularValorTotalEstoque() {
        return this.quantidade * this.precoUnitario;
    }
}



public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null; // Começa sem nenhum produto cadastrado
        int opcao;

        do {
            System.out.println("\n--- CONTROLE DE ESTOQUE ---");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Adicionar estoque");
            System.out.println("3. Remover estoque");
            System.out.println("4. Exibir valor total do estoque");
            System.out.println("5. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastrando Novo Produto ---");
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o código do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite a quantidade inicial: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço unitário: ");
                    double preco = scanner.nextDouble();
                    
                    produto = new Produto(nome, codigo, quantidade, preco);
                    System.out.println("Produto '" + produto.getNome() + "' cadastrado com sucesso!");
                    break;
                case 2:
                    if (produto == null) {
                        System.out.println("ERRO: Nenhum produto cadastrado. Cadastre um produto primeiro (Opção 1).");
                    } else {
                        System.out.print("Digite a quantidade para ADICIONAR ao estoque: ");
                        int qtdAdicionar = scanner.nextInt();
                        produto.adicionarEstoque(qtdAdicionar);
                    }
                    break;
                case 3:
                    if (produto == null) {
                        System.out.println("ERRO: Nenhum produto cadastrado. Cadastre um produto primeiro (Opção 1).");
                    } else {
                        System.out.print("Digite a quantidade para REMOVER do estoque: ");
                        int qtdRemover = scanner.nextInt();
                        produto.removerEstoque(qtdRemover);
                    }
                    break;
                case 4:
                    if (produto == null) {
                        System.out.println("ERRO: Nenhum produto cadastrado. Cadastre um produto primeiro (Opção 1).");
                    } else {
                        double valorTotal = produto.calcularValorTotalEstoque();
                        System.out.printf("Produto: %s | Quantidade: %d | Preço Unit.: R$ %.2f\n", 
                                          produto.getNome(), produto.getQuantidade(), produto.getPrecoUnitario());
                        System.out.printf("Valor total do estoque: R$ %.2f\n", valorTotal);
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close(); // Fecha o scanner ao sair do loop
    }
}