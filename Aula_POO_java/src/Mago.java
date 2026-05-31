public class Mago extends Personagens {
    private String habilidadeMagica;

    public Mago(String nome, int idade, String habilidadeMagica) {
        super(nome, idade);
        this.habilidadeMagica = habilidadeMagica;
    }

    @Override
    public void apresentar() {
        System.out.println("Ola! Meu nome e " + getNome() + ", tenho " + getIdade() +
                " anos e minha habilidade magica e: " + habilidadeMagica + ".");
    }
}