import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Monstros
        Lagosta lagosta = new Lagosta("Lagosta Gigante");
        Cogumelo cogumelo = new Cogumelo("Cogumelo exotico");

        // Pratos
        Prato prato1 = new Prato(
                "Lagosta assada",
                lagosta,
                "Sal Marinho",
                "2 colheres"
        );

        Prato prato2 = new Prato(
                "Ensopado de Cogumelo",
                cogumelo,
                "Pimenta",
                "1 colher"
        );

        // Servindo individualmente
        prato1.servir();
        prato2.servir();

        // Cardápio da expedição
        ArrayList<Prato> cardapio = new ArrayList<>();

        cardapio.add(prato1);
        cardapio.add(prato2);

        System.out.println("\n=== CARDAPIO DA EXPEDICAO ===");

        for (Prato prato : cardapio) {
            prato.servir();
        }
    }
}