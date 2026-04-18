using System;
using System.Collections.Generic;

// Relíquia (composição)
class ReliquiaMagica
{
    public string NomeItem { get; set; }

    public ReliquiaMagica(string nome)
    {
        NomeItem = nome;
    }
}

// Baú (composição)
class BauDeReliquias
{
    private List<ReliquiaMagica> reliquias = new List<ReliquiaMagica>();

    public void GuardarItem(ReliquiaMagica item)
    {
        reliquias.Add(item);
    }

    public void ListarReliquias()
    {
        Console.WriteLine("Relíquias no Baú:");
        foreach (var r in reliquias)
        {
            Console.WriteLine("- " + r.NomeItem);
        }
    }
}

//Itens de acampamento (agregação)
class ItemDeAcampamento
{
    public string Nome { get; set; }

    public ItemDeAcampamento(string nome)
    {
        Nome = nome;
    }
}

// Maga (composição e agregação)
class Maga
{
    public string Nome { get; set; }

    private BauDeReliquias bau;

    public List<ItemDeAcampamento> ItensAcampamento { get; set; }

    public Maga(string nome, List<ItemDeAcampamento> itens)
    {
        Nome = nome;
        bau = new BauDeReliquias(); // composição
        ItensAcampamento = itens;   // agregação
    }

    public void AdicionarReliquia(string nome)
    {
        bau.GuardarItem(new ReliquiaMagica(nome));
    }

    public void MostrarItensAcampamento()
    {
        Console.WriteLine("Itens de Acampamento de " + Nome + ":");
        foreach (var item in ItensAcampamento)
        {
            Console.WriteLine("- " + item.Nome);
        }
    }

    public void MostrarReliquias()
    {
        bau.ListarReliquias();
    }
}

// Main
class Program
{
    static void Main(string[] args)
    {
        //Lista
        List<ItemDeAcampamento> itens = new List<ItemDeAcampamento>()
        {
            new ItemDeAcampamento("Saco de Dormir"),
            new ItemDeAcampamento("Barraca de camping"),
            new ItemDeAcampamento("Kit primeiro socorros")
        };

        Maga frieren = new Maga("Frieren", itens);

        // Adicionando relíquias
        frieren.AdicionarReliquia("Anel de Prata");
        frieren.AdicionarReliquia("Calice");
        frieren.AdicionarReliquia("Colar de ouro");

        // Exibindo dados
        frieren.MostrarItensAcampamento();
        Console.WriteLine();
        frieren.MostrarReliquias();
    }
}