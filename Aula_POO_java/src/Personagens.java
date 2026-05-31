public abstract class Personagens {
    private String nome;
    private int idade;

    public Personagens(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato
    public abstract void apresentar();
}