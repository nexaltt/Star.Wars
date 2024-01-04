package cinemaGalactique;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
/*
@Author Yanis
@ Projet : StarWars
*/
public class OeuvreCinematographique {

	private String nom;
	private int anneePublication;
	private int serieNumero;
	private double budget;
	private double revenus;
	private ArrayList<Comedien> distribution;
	private ArrayList<Object> elementsGalactiques;

	/// Constructeurs

	OeuvreCinematographique(){}

	public OeuvreCinematographique(String nom, int anneePublication, int serieNumero, double budget, double revenus) {
		this.nom = nom;
		this.anneePublication = anneePublication;
		this.serieNumero = serieNumero;
		this.budget = budget;
		this.revenus = revenus;
	}

	public OeuvreCinematographique(String nom, int anneePublication, int serieNumero, double budget, double revenus,
								   ArrayList<Comedien> distribution) {
		this.nom = nom;
		this.anneePublication = anneePublication;
		this.serieNumero = serieNumero;
		this.budget = budget;
		this.revenus = revenus;
		this.distribution = distribution;
	}

	/// Set et Get

	public ArrayList<Comedien> getDistribution() {
		return distribution;
	}

	public void setDistribution(ArrayList<Comedien> distribution) {
		this.distribution = distribution;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnneePublication() {
		return this.anneePublication;
	}
	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}
	public int getSerieNumero() {
		return this.serieNumero;
	}
	public void setSerieNumero(int serieNumero) {
		this.serieNumero = serieNumero;
	}
	public double getBudget() {
		return this.budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public double getRevenus() {
		return revenus;
	}
	public void setRevenus(double revenus) {
		this.revenus = revenus;
	}

	@Override
	public String toString() {
		return "Class : "+getClass().getSimpleName()+" [Nom=" + nom + ", AnneePublication=" + this.anneePublication + ", SerieNumero=" + serieNumero + ", Budget="
				+ this.budget + ", Revenus=" + this.revenus + ", Distribution=" + this.distribution + "]";
	}

	public OeuvreCinematographique saisieOeuvre() {
		OeuvreCinematographique oeuvre = new OeuvreCinematographique();
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Entrez les informations de l'oeuvre cinématographique.");

			System.out.print("Nom: ");
			String nom = scanner.nextLine();

			System.out.print("Année de publication: ");
			int anneePublication = scanner.nextInt();

			System.out.print("Numéro de série: ");
			int serieNumero = scanner.nextInt();

			System.out.print("Budget de production: ");
			double budget = scanner.nextDouble();

			System.out.print("Revenus: ");
			double revenus = scanner.nextDouble();

			oeuvre = new OeuvreCinematographique(nom, anneePublication, serieNumero, budget, revenus);
		}
		catch (InputMismatchException e) {
			System.out.println("Saisie non valide. Veuillez réessayer.");
			saisieOeuvre();
		}
		finally {
			scanner.close();
		}
		return oeuvre;
	}

	// Compter le nombre de comédiens
	public int nbComediens() {
		return distribution.size();
	}

	// Calculer le nombre total de rôles joués
	public int nbRoles() {
		int totalRoles = 0;
		for (Comedien comedien : this.distribution) {
			totalRoles += comedien.getRolesJoues().size();
		}
		return totalRoles;
	}

	// Calculer le résultat financier
	public Couple<Double, Boolean> calculResultatFinancier() {
		Double resultat = revenus - budget;
		return new Couple<>(resultat, resultat > 0);
	}

	// Vérifier si l'année donnée est antérieure à l'année de publication
	public Boolean estAvant(int annee) throws Exception {
		if (this.anneePublication == annee) {
			throw new Exception("L'année donnée est la même que l'année de publication.");
		}
		return anneePublication > annee;
	}

	// Trier la distribution par ordre alphabétique
	public void trierDistribution() {
		Collections.sort(distribution, new Comparator<Comedien>() {
			@Override
			public int compare(Comedien c1, Comedien c2) {
				return c1.getNomArtiste().compareTo(c2.getNomArtiste());
			}
		});
	}

	// Afficher un résumé des oeuvres stockées
	public void afficherResume(HashMap<Integer, OeuvreCinematographique> dictionnaire) {
		for (HashMap.Entry<Integer, OeuvreCinematographique> entry : dictionnaire.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNom() + " - " + entry.getValue().calculResultatFinancier().getPremierElement());
		}
	}
