package abstracao;

public abstract class Cliente {

    protected String nomeOuRazaoSocial;
    protected String telefone;
    protected String email;
    protected String endereco;
    protected String tipoDeServicoDesejado;
    protected double orcamentoMaximo; 
    protected String statusDoCliente; 
    protected String tipoDeProjeto; 

    public Cliente(String nomeOuRazaoSocial, String telefone, String email, String endereco) {
        this.nomeOuRazaoSocial = nomeOuRazaoSocial;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.statusDoCliente = "Lead"; 
    }

    // Métodos Abstratos (devem ser implementados nas classes filhas)
    public abstract String getIdentificadorUnico();
    public abstract double calcularPotencialDeValor();

    // Métodos Concretos
    public void atualizarStatus(String novoStatus) {
        this.statusDoCliente = novoStatus;
        System.out.println("Status de " + this.nomeOuRazaoSocial + " atualizado para: " + novoStatus);
    }
    
    // Getters e Setters (adicionando os Setters essenciais para a entrada do usuário)
    
    public String getNomeOuRazaoSocial() { return nomeOuRazaoSocial; }
    public String getStatusDoCliente() { return statusDoCliente; }

    public void setTipoDeServicoDesejado(String tipoDeServicoDesejado) {
        this.tipoDeServicoDesejado = tipoDeServicoDesejado;
    }

    public void setOrcamentoMaximo(double orcamentoMaximo) {
        this.orcamentoMaximo = orcamentoMaximo;
    }

    public void setTipoDeProjeto(String tipoDeProjeto) {
        this.tipoDeProjeto = tipoDeProjeto;
    }
}