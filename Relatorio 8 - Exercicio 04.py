# 1. "Interface" base (sem ABC)
class Cibernetico:
    def realizar_hack(self):
        raise NotImplementedError("As subclasses devem implementar realizar_hack()")


# 3. Classe de composição
class Implante:
    def __init__(self, custo: float, funcao: str):
        self.custo = custo
        self.funcao = funcao

    def __str__(self):
        return f" {self.funcao} - ${self.custo}"


# 4. Classe NetRunner
class NetRunner(Cibernetico):
    def __init__(self, nome: str, custo_implante: float, funcao_implante: str):
        self.nome = nome
        # Composição: criado dentro da classe
        self.implante = Implante(custo_implante, funcao_implante)

    def realizar_hack(self):
        print(f"{self.nome} mostra sua força usando {self.implante}")


# 5. Classe Faccao (agregação)
class Faccao:
    def __init__(self, membros: list):
        # Agregação: recebe objetos já criados
        self.membros = membros

    def executar_hacks(self):
        print("=== Facção iniciando ataques ===")
        for membro in self.membros:
            membro.realizar_hack()


# MAIN
herois = [
    NetRunner("Professor Xavier", 5000000, "Invasão neural"),
    NetRunner("Ciclope", 7000000, "Visõe de raio laser"),
    NetRunner("Noturno", 600000, "Poder de teletransporte")
]

faccao = Faccao(herois)
faccao.executar_hacks()