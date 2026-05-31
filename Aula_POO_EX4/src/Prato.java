public class Prato {
    private String nome;
    private Monstro monstro;
    private Tempero tempero;

    public Prato(String nome, Monstro monstro,
                 String nomeTempero, String quantidadeTempero) {

        this.nome = nome;
        this.monstro = monstro;

        // Composição
        this.tempero = new Tempero(nomeTempero, quantidadeTempero);
    }

    public void servir() {
        System.out.println("\nPrato: " + nome);
        System.out.println("Ingrediente principal: " + monstro.getNome());

        monstro.virarPrato();

        System.out.println("Tempero utilizado: " + tempero);
    }
}