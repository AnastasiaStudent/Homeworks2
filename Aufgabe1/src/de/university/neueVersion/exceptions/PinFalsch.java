package de.university.neueVersion.exceptions;

public class PinFalsch extends Exception {
	
	public PinFalsch() {
		System.out.println("");
		System.out.println("Sie haben entwerder noch keinen PIN eingegeben oder er war falsch.");
	}

}