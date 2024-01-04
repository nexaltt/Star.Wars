from Film import Film
from Acteur import Acteur
from Personnage import Personnage

# Etape 2
film1 = Film("Star Wars, épisode V : L'Empire contre-attaque", 1980, 5, 18000.50, 200000.99)
film2 = Film()
print(film1)

# Etape 3
personnage1 = Personnage("Lando", "Calrissian")

# Etape 4
galaxySaga = []
galaxySaga.append(film1)
galaxySaga.append(film2)
galaxySaga.append(personnage1)

# Etape 5
for element in galaxySaga:
    print(element)

# Etape 8
personnage2 = Personnage("Boba", "Fett")
pairePerso = (personnage1, personnage2)
acteur1 = Acteur("Harrison", "Ford", pairePerso)
