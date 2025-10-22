//package abstracao;

import java.util.Scanner;
import abstracao.ClientePessoaFisica;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Novo Cliente (PF) para Construção/Automação ---");
        
        // Coleta de dados básicos
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        
        System.out.print("Endereço da Obra: ");
        String endereco = scanner.nextLine();
        
        // Criação do objeto cliente
        ClientePessoaFisica novoCliente = new ClientePessoaFisica(nome, telefone, email, endereco, cpf);
        
        // Coleta de dados específicos do projeto
        System.out.print("Tipo de Serviço (Ex: Elétrica, Automação, Ambos): ");
        String servico = scanner.nextLine();
        novoCliente.setTipoDeServicoDesejado(servico);
        
        System.out.print("Tipo de Projeto (Ex: Residencial, Comercial): ");
        String projeto = scanner.nextLine();
        novoCliente.setTipoDeProjeto(projeto);

        double orcamento = 0.0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Orçamento Máximo (apenas números, ex: 50000.00): R$ ");
                orcamento = scanner.nextDouble();
                entradaValida = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
        novoCliente.setOrcamentoMaximo(orcamento);

        // Opcional: Atualizar status inicial
        novoCliente.atualizarStatus("Qualificado");
        
        System.out.println("\n-------------------------------------------");
        System.out.println(novoCliente.toString()); // Exibe os dados formatados
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}