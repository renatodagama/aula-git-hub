
class Animal {
    // Atributos privados (Encapsulamento)
    private int idade;
    private String nome;
    private String especie;

    // Construtor da classe
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    // MÉTODOS GETTERS necessários para acessar atributos privados
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }
    
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("-------------------------");
        // O método da própria classe Animal ainda pode acessar 'nome', 'idade', 'especie'
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Espécie: " + especie);
    }
}



class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, "Canino"); 
        this.raca = raca;
    }

   
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Raça: " + raca);
        System.out.println("Comportamento: Late");
    }
}



class Gato extends Animal {
    private boolean pelosLongos;

    public Gato(String nome, int idade, boolean pelosLongos) {
        super(nome, idade, "Felino"); 
        this.pelosLongos = pelosLongos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Pelos Longos: " + (pelosLongos ? "Sim" : "Não"));
        System.out.println("Comportamento: Mia");
    }
}


class Passaro extends Animal {
    private String corPena;

    public Passaro(String nome, int idade, String corPena) {
        super(nome, idade, "Ave"); 
        this.corPena = corPena;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cor da Pena: " + corPena);
        System.out.println("Comportamento: Voa");
    }
}



public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Killua", 3, "Husk");
        Gato meuGato = new Gato("Moana", 2, true);
        Passaro meuPassaro = new Passaro("Dragon", 1, "Amarelo");

        System.out.println("--- INFORMAÇÕES DO CACHORRO ---");
        meuCachorro.exibirInformacoes();

        System.out.println("\n--- INFORMAÇÕES DO GATO ---");
        meuGato.exibirInformacoes();

        System.out.println("\n--- INFORMAÇÕES DO PÁSSARO ---");
        meuPassaro.exibirInformacoes();
    }
}