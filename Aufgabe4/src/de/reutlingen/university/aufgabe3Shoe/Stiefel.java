package de.reutlingen.university.aufgabe3Shoe;

/**Erstellen Sie f�r die Schuharten Stiefel und Sportschuhe eigene Klassen, 
 * welche von der Klasse Shoes erben.
 * 
 * @author Dmitrij Petrov, Anastasia Baron
 *
 */
public class Stiefel extends Shoes {

	Stiefel(String name, double schuhgroesse) throws NichtErlaubtesFormatException {
		super(name, schuhgroesse);
	}

}
