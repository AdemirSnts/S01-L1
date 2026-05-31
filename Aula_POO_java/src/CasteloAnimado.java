import java.util.ArrayList;

public class CasteloAnimado {
    private ArrayList<Divisao> divisoes;

    public CasteloAnimado(ArrayList<Divisao> divisoes) {
        this.divisoes = divisoes;
    }

    public void adicionarDivisao(Divisao divisao) {
        divisoes.add(divisao);
    }

    public void listarDivisoes() {
        System.out.println("\nDivisoes do Castelo:");

        for (Divisao divisao : divisoes) {
            System.out.println(divisao);
        }
    }
}