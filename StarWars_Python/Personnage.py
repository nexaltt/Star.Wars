class Personnage :

    def __init__(self, first_name=None, last_name=None):
        self.first_name = first_name
        self.last_name = last_name

    def __str__(self):
        return f"Personnage [Prénom: {self.first_name}, Nom: {self.last_name}]"
