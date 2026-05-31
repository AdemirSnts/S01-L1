import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mago howl = new Mago("Howl", 29, "controlar os 4 elementos");

        howl.apresentar();

        // Testando o setter
        howl.setNome("Howl Jenkins");

        // Criando divisões
        Divisao quarto = new Divisao("Quarto", "Descanso");
        Divisao laboratorio = new Divisao("Laboratorio", "Pesquisa magica");
        Divisao cozinha = new Divisao("Cozinha", "Preparacao das refeicoes");

        // Criando ArrayList e adicionando divisões
        ArrayList<Divisao> listaDivisoes = new ArrayList<>();
        listaDivisoes.add(quarto);
        listaDivisoes.add(laboratorio);

        // Criando o castelo
        CasteloAnimado castelo = new CasteloAnimado(listaDivisoes);

        // Adicionando mais uma divisão
        castelo.adicionarDivisao(cozinha);

        System.out.println("\nApós alterar o nome:");
        howl.apresentar();

        //Listando as divisões
        castelo.listarDivisoes();
    }
}