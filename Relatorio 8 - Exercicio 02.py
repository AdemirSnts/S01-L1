class Heroi:
    def __init__(self, nome: str, funcao: str):
        self.nome = nome
        self.funcao = funcao

    def usar_ultimate(self):
        raise NotImplementedError("As subclasses devem implementar este método")


class Tanque(Heroi):
    def __init__(self, nome: str):
        super().__init__(nome, "Tanque")

    def usar_ultimate(self):
        print(f"{self.nome}  levanta um escudo gigante!")


class Dano(Heroi):
    def __init__(self, nome: str):
        super().__init__(nome, "dano")

    def usar_ultimate(self):
        print(f"{self.nome}  dispara um ataque devastador!")


# MAIN
herois = [
    Tanque("Capitao america"),
    Dano("Thanos"),
    Tanque("Homem de ferro"),
    Dano("Superman")
]

for heroi in herois:
    heroi.usar_ultimate()