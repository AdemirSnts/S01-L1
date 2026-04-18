using System;
using System.Collections.Generic;

// Classe
class CriaturaPokemon
{
    public string Especie;

    // Método
    public virtual void ExecutarMovimento()
    {
        Console.WriteLine(Especie + " realiza um ataque genérico.");
    }
}

// Classe - Fogo
class TipoFogo : CriaturaPokemon
{
    public override void ExecutarMovimento()
    {
        Console.WriteLine(Especie + " lança rajadas de chamas!");
    }
}

// Classe - Água
class TipoAgua : CriaturaPokemon
{
    public override void ExecutarMovimento()
    {
        Console.WriteLine(Especie + " dispara bolhas de água!");
    }
}

class Program
{
    static void Main(string[] args)
    {
        // Lista baseada na classe CriaturaPokemon
        List<CriaturaPokemon> lista = new List<CriaturaPokemon>();

        // Instâncias
        TipoFogo scorbunny = new TipoFogo();
        scorbunny.Especie = "Scorbunny";

        TipoAgua greninja = new TipoAgua();
        greninja.Especie = "Greninja";

        // Adicionando à lista
        lista.Add(scorbunny);
        lista.Add(greninja);

        // Polimorfismo
        foreach (CriaturaPokemon p in lista)
        {
            p.ExecutarMovimento();
        }
    }
}