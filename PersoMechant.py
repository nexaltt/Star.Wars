from Personnage import Personnage

class PersoMechant(Personnage):


    def __init__(self, malice=None):
        super().__init__()
        self.malice = malice

    def __str__(self):
        return f"PersoMechant{super().__str__()} [Malice: {self.malice}]"
