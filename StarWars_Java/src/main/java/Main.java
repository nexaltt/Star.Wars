package cinemaGalactique;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class TestCinema {

	public static void main(String[] args) {

		///Etape 2
		OeuvreCinematographique oeuvre1 = new OeuvreCinematographique("Star Wars, épisode V : L'Empire contre-attaque", 1980, 5, 18000.00, 538000.00);
		OeuvreCinematographique oeuvre2 = new OeuvreCinematographique();
		//oeuvre2 = oeuvre2.saisieOeuvre();
		System.out.println(oeuvre2.toString());

		///Etape 3
		Role role1 = new Role("Luke", "Skywalker");

		///Etape 4
		ArrayList<Object> elementsGalactiques = new ArrayList<Object>();
		elementsGalactiques.add(oeuvre1);
		elementsGalactiques.add(oeuvre2);
		elementsGalactiques.add(role1);

		///Etape 5
		for (Object element : elementsGalactiques) {
			System.out.println(element.toString());
		}

		Role role2 = new Role("Han", "Solo");
		Couple<Role, Role> coupleRole1 = new Couple<Role, Role>(role1, role2);
		Comedien comedien1 = new Comedien("Harrison", "Ford", coupleRole1);

		// Autres étapes et tests si nécessaire
	}
}
