public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Cafe Tradicional", 5.50);
        Cafe cafe2 = new Cafe("Cafe com leite",7.50);
        Cafe cafe3 = new Cafe("Cappuccino", 12.00);
        CafeGourmet cafe4 = new CafeGourmet("Cafe Gourmet", 15.00, 4.50);

        CafeteriaLeblanc leblanc = new CafeteriaLeblanc();

        leblanc.adicionarCafe(cafe1);
        leblanc.adicionarCafe(cafe2);
        leblanc.adicionarCafe(cafe3);
        leblanc.adicionarCafe(cafe4);

        leblanc.abrirCafeteria();
    }
}