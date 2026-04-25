# 1. Classe da arma (composição)
class ArmaCorpoACorpo:
    def __init__(self, nome: str):
        self.nome = nome

    def __str__(self):
        return f"Arma: {self.nome}"


# 2. Classe dos membros (agregação)
class PhantomThieves:
    def __init__(self, nome: str, arma: str):
        self.nome = nome
        self.arma = arma

    def __str__(self):
        return f"{self.nome} usa {self.arma}"


# 3. Classe Joker
class Joker:
    def __init__(self, membros: list):
        # Composição: Joker cria e controla sua própria arma
        self.arma = ArmaCorpoACorpo("Faca")

        # Agregação: recebe membros prontos
        self.membros = membros

    def mostrar_equipe(self):
        print("=== Equipe Phantom Thieves ===")
        print()
        
        for membro in self.membros:
            print(membro)


# main
equipe = [
    PhantomThieves("Ryuji", "Punhal"),
    PhantomThieves("Anselmo", "Machado"),
    PhantomThieves("Yusuke", "Katana")
]

joker = Joker(equipe)
joker.mostrar_equipe()