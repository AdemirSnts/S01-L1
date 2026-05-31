public class CafeteriaLeblanc {
    private Menu menu;

    public CafeteriaLeblanc() {
        menu = new Menu();
    }

    public void adicionarCafe(Cafe cafe) {
        menu.adicionarCafe(cafe);
    }

    public void abrirCafeteria() {
        System.out.println("====== Bem-vindo ao Cafe Leblanc ======");
        System.out.println("Confira nosso cardapio:\n");

        menu.exibirMenu();
    }
}