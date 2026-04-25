class Personagem:
    def __init__(self, vida: int, resistencia: int):
        self.__vida = vida
        self.__resistencia = resistencia

    # Getter da vida
    @property
    def vida(self):
        return self.__vida

    # Setter da vida (com controle)
    @vida.setter
    def vida(self, valor):
        if valor < 0:
            self.__vida = 0
        else:
            self.__vida = valor

    # Getter da resistência (opcional, mas útil)
    @property
    def resistencia(self):
        return self.__resistencia

    def __str__(self):
        return f"Personagem com {self.__vida} de vida e {self.__resistencia} de resistência"


class Cavaleiro(Personagem):
    def __init__(self, vida: int, resistencia: int, armadura_pesada: bool):
        super().__init__(vida, resistencia)
        self.armadura_pesada = armadura_pesada

    def __str__(self):
        tipo_armadura = "com armadura pesada" if self.armadura_pesada else "sem armadura pesada"
        return f"Cavaleiro com {self.vida} de vida, {self.resistencia} de resistência e {tipo_armadura}"
  