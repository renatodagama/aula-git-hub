import livroJava.Livro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 2. Cria um objeto Scanner para ler a entrada do teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Cadastro de Novo Livro ---");

        // 3. Pede e lê cada informação do usuário
        System.out.print("Digite o título do livro: ");
        String titulo = teclado.nextLine();

        System.out.print("Digite o nome do autor: ");
        String autor = teclado.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int ano = teclado.nextInt();

        System.out.print("Digite a quantidade de páginas: ");
        int paginas = teclado.nextInt();

        // 4. Cria o objeto Livro com os dados fornecidos pelo usuário
        Livro livroUsuario = new Livro(titulo, autor, ano, paginas);

        System.out.println("\nLivro cadastrado com sucesso!\n");

        // 5. Exibe as informações do livro que acabou de ser criado
        livroUsuario.exibirInformacoes();

        // 6. Calcula e exibe o tempo de leitura
        double tempoDeLeitura = livroUsuario.calcularTempoLeitura();
        System.out.println("Tempo estimado de leitura: " + tempoDeLeitura + " minutos.");

        // 7. Feche o Scanner para liberar recursos (boa prática)
        teclado.close();
    }
}
