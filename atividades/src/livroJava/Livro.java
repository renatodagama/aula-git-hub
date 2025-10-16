/******************************************************************************

Atividade 1: Classe Livro com Encapsulamento
Crie uma classe Livro com as seguintes características:
● Atributos privados:
○ titulo (String)
○ autor (String)
○ anoPublicacao (int)
○ quantidadePaginas (int)
● Métodos:
○ Construtor completo que receba todos os atributos
○ Métodos getters e setters para todos os atributos
○ Método calcularTempoLeitura() que retorne o tempo estimado de
leitura
○ Método exibirInformacoes() que imprima todos os detalhes do livro

*******************************************************************************/

package livroJava;

public class Livro {
    // Atributos privados (características)
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadePaginas;
    
    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadePaginas = quantidadePaginas;
    }
    
    // Getter -> permite Ler o valor
    public String getTitulo() {
        
        return titulo;
    }
    
    public String getAutor() {
        
        return autor;
    }
    
    public int getAnoPublicacao() {
        
        return anoPublicacao;
    }
    
    public int getQuantidadePaginas() {
        
        return quantidadePaginas;
    }
    
    // Setter -> permite MODIFICAR o valor (com validação)
    public void setTitulo(String titulo){
        if(titulo != null && !titulo.trim().isEmpty()){
            this.titulo = titulo;
        } else {
            System.out.println("ERRO: O título não pode ser vazio.");
        }
    }
    
    public void setAutor(String autor){
        if(autor != null && autor.trim().isEmpty()){
            this.autor = autor;
        } else{
            System.out.println("ERRO: O autor não pode ser vazio.");
        }
    }
    
    public void setAnoPublicacao(int anoPublicacao){
        if(anoPublicacao > 0 && anoPublicacao <= 2025){
            this.anoPublicacao = anoPublicacao;
        } else{
            System.out.println("ERRO: Ano de publicação inválido.");
        }
    }
    
    public void setQuantidadePaginas(int quantidadePaginas){
        if(quantidadePaginas > 0){
            this.quantidadePaginas = quantidadePaginas;
        } else{
            System.out.println("Erro: A quantidade de páginas deve ser maior que zero.");
        }
    }
    
      // --- OUTROS MÉTODOS ---

    /**
     * Calcula o tempo estimado de leitura em minutos.
     * Assume uma velocidade de leitura de 2 minutos por página.
     * return O tempo total de leitura em minutos.
     */
    public double calcularTempoLeitura() {
        // Supondo que uma pessoa leve 2 minutos para ler cada página
        final double MINUTOS_POR_PAGINA = 2.0;
        return this.quantidadePaginas * MINUTOS_POR_PAGINA;
    }
    
    /**
     * Exibe todas as informações do livro no console.
     */
    public void exibirInformacoes() {
        System.out.println("--- Detalhes do Livro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("Número de Páginas: " + this.quantidadePaginas);
        System.out.println("-------------------------");
    }
}
