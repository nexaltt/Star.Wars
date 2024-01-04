from Personnage import Personnage



class PersoGentil(Personnage):

    def __init__(self, strength=None):
        super().__init__()
        self.strength = strength

    def __str__(self):
        return f"PersoGentil{super().__str__()} [Force: {self.strength}]"
