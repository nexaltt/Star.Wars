class Acteur:

    def __init__(self, first_name=None, last_name=None, roles=None):
        self.first_name = first_name
        self.last_name = last_name
        self.roles = roles if roles else []

    def __str__(self):
        return (f"Classe: {self.__class__.__name__}\n"
                f"Prénom: {self.first_name}\n"
                f"Nom: {self.last_name}\n"
                f"Rôles: {self.roles}")

    def total_roles(self):

        return len(self.roles)
