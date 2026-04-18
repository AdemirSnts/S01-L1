using System;

class CombatenteAliado
{
    // Atributos
    private string nome;
    private string linhagem;
    private string patente;

    // Construtor
    public CombatenteAliado(string nome, string linhagem, string patente)
    {
        this.nome = nome;
        this.linhagem = linhagem;
        this.patente = patente;
    }

    // Apresentando os combatentes
    public void ApresentarUnidade()
    {
        Console.WriteLine("=== Combatente ===");
        Console.WriteLine("Nome: " + nome);
        Console.WriteLine("Linhagem: " + linhagem);
        Console.WriteLine("Patente: " + patente);
        Console.WriteLine();
    }
}

class Program
{
    static void Main(string[] args)
    {
        // Criando as instâncias 
        CombatenteAliado HumanoCapitao = new CombatenteAliado("Aragorn", "Humano", "Capitão");
        CombatenteAliado AnaoGuerreiro = new CombatenteAliado("Gimli", "Anão", "Guerreiro");
        CombatenteAliado ElfoArqueiro = new CombatenteAliado("Legolas", "Elfo", "Arqueiro");

        // Chamando o método
        HumanoCapitao.ApresentarUnidade();
        AnaoGuerreiro.ApresentarUnidade();
        ElfoArqueiro.ApresentarUnidade();
    }
}