package de.university.aufgabe4.anastasia.exc;

public class WrongQuantityOfDigits extends Exception {

	public WrongQuantityOfDigits() {
		System.out.println("Sie muessen nur 4 stellige Nummer eingeben");
	}

}