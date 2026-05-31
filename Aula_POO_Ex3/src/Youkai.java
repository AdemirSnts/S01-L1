public class Youkai extends Entidade implements Rastreavel {

    private Poder poder;

    public Youkai(String nome) {
        super(nome);
        this.poder = new Poder("Invisibilidade", 85);
    }

    @Override
    public String obterCoordenadas() {
        return "Floresta Sombria: (350, 180)";
    }

    public Poder getPoder() {
        return poder;
    }
}