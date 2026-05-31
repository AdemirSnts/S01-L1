public class Alien extends Entidade implements Rastreavel {

    private Poder poder;

    public Alien(String nome) {
        super(nome);
        this.poder = new Poder("Raio laser ultrassonico", 90);
    }

    @Override
    public String obterCoordenadas() {
        return "Setor X: (120, 450)";
    }

    public Poder getPoder() {
        return poder;
    }
}