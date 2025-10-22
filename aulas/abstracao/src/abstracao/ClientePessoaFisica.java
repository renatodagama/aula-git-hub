package abstracao;

public class ClientePessoaFisica extends Cliente {

    private String cpf;

    public ClientePessoaFisica(String nome, String telefone, String email, String endereco, String cpf) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
    }

    // Implementação dos métodos abstratos
    @Override
    public String getIdentificadorUnico() {
        return this.cpf;
    }

    @Override
    public double calcularPotencialDeValor() {
        // Exemplo: O potencial é o orçamento, mais um bônus se for um projeto de automação
        if (this.tipoDeServicoDesejado != null && this.tipoDeServicoDesejado.toLowerCase().contains("automacao")) {
            return this.orcamentoMaximo * 1.10; // 10% de potencial a mais por ser automação
        }
        return this.orcamentoMaximo;
    }
    
    // Método para exibir todos os dados (útil após a entrada)
    @Override
    public String toString() {
        return "--- Detalhes do Cliente PF ---\n" +
               "Nome: " + nomeOuRazaoSocial + "\n" +
               "CPF: " + cpf + "\n" +
               "Endereço: " + endereco + "\n" +
               "Serviço Desejado: " + tipoDeServicoDesejado + "\n" +
               "Tipo de Projeto: " + tipoDeProjeto + "\n" +
               "Orçamento Máximo: R$ " + String.format("%.2f", orcamentoMaximo) + "\n" +
               "Status: " + statusDoCliente + "\n" +
               "Potencial de Valor: R$ " + String.format("%.2f", calcularPotencialDeValor());
    }
}