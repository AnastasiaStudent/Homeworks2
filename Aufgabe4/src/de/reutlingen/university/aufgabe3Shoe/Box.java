package de.reutlingen.university.aufgabe3Shoe;
/**
 * 
 * @author Petrov Dmitrij, Baron Anastasia;
 * 
 *Beliebige Objekte sollen in einer Schachtel aufbewahrt 
 *werden k�nnen. Erstellen Sie dazu eine generische 
 *Klasse Box mit Methoden zum hinzuf�gen und entfernen 
 *von Objekten. Au�erdem soll die Klasse Box �ber eine 
 *Methode public String toString() verf�gen, welche den
 * Inhalt der Schachtel zur�ckgibt. 
 * 
 * @param <T>
 */
public class Box<T> { //"Beliebige Objekte sollen in einer Schachtel aufbewahrt werden k�nnen." 
 private T pairShoe;  
    public Box() {}  
	
	public void addShoes(T pairShoe){ //hinzufuegen
	this.pairShoe=pairShoe;
	}
	
	public void removePairShoe() { //entfernen
			pairShoe = null;
		}
		
	public String toString(){ // gibt den Inhalt der Schachtel zurueck
	
		return "In diesem Schachtel liegen: " + pairShoe.toString();
		}
	

	
}