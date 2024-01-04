class Film:


    def __init__(self, title=None, release_year=None, episode_number=None, budget=None, box_office=None, cast=None):
        self.title = title
        self.release_year = release_year
        self.episode_number = episode_number
        self.budget = budget
        self.box_office = box_office
        self.cast = cast if cast else []

    def __str__(self):
        return (f"Classe: {self.__class__.__name__} [Titre: {self.title}, "
                f"Année: {self.release_year}, Épisode: {self.episode_number}, "
                f"Budget: {self.budget}, Recette: {self.box_office}, Distribution: {self.cast}]")

    def total_cast(self):
        return len(self.cast)

    def total_characters(self):
        return sum(len(performer.roles) for performer in self.cast)

    def compute_profit(self):
        profit = self.box_office - self.budget
        return (profit, profit > 0)

    def is_prior(self, year):
        if self.release_year == year:
            raise ValueError("Même année")
        return self.release_year < year

    def sort_cast(self):
        self.cast.sort(key=lambda performer: performer.last_name)

    def summarize(self, dictionary):
        for year, work in dictionary.items():
            print(f"{year} - {work.title} - {work.compute_profit()[0]}")
