package de.aufgabe9;

import java.util.Observable;

public class Produkt extends Observable {
	int pNr;
	String pDescr;
	int holding;
	int minHolding;

	/**
	 * @param Produktnummer
	 * @param Produktbeschreibung
	 * @param Lagerbestand
	 * @param Mindestlagerbestand
	 */
	public Produkt(int pNr, String pDescr, int holding, int minHolding) {
		this.pNr = pNr;
		this.pDescr = pDescr;
		this.holding = holding;
		this.minHolding = minHolding;
	}

	/**
	 * @return the Produktnummer
	 */
	public int getpNr() {
		return pNr;
	}

	/**
	 * @param Produktnummer
	 *            the Produktnummer to set
	 */
	public void setpNr(int pNr) {
		this.pNr = pNr;
	}

	/**
	 * @return the Produktbeschreibung
	 */
	public String getpDescr() {
		return pDescr;
	}

	/**
	 * @param Produktbeschreibung
	 *            the Produktbeschreibung to set
	 */
	public void setpDescr(String pDescr) {
		this.pDescr = pDescr;
	}

	/**
	 * @return the Lagerbestand
	 */
	public int getHolding() {
		return holding;
	}

	/**
	 * @param Lagerbestand
	 *            the Lagerbestand to set
	 */
	public void setHolding(int holding) {
		this.holding = holding;
	}

	/**
	 * @return the Mindestlagerbestand
	 */
	public int getMinHolding() {
		return minHolding;
	}

	/**
	 * @param Mindestlagerbestand
	 *            the Mindestlagerbestand to set
	 */
	public void setMinHolding(int minHolding) {
		this.minHolding = minHolding;

	}

	/**
	 * eine Methode zur Reduktion des Lagerbestandes besitzen
	 * 
	 * @param amount
	 */
	public void removeProducts(int amount) {
<<<<<<< HEAD:Aufgabe11/src/de/aufgabe92/Produkt.java
		if (this.holding >= amount) {
			this.holding = holding - amount;
			setChanged();
			notifyObservers(this.holding);
		} else
			throw new RuntimeException(
					"Unmoeglich! Sie haben nicht genung Ressourcen!");
=======
		if (holding < 0) {
			throw new RuntimeException("kann null nicht sein");
		}
		System.out.println("delete von " + amount + " produkten");
		int sd = getHolding() - amount;
		this.holding = sd;
		setChanged();
		// System.out.println(hasChanged()); wird true sein
		notifyObservers(amount);

	}
>>>>>>> aufgabe:Aufgabe11/src/de/aufgabe9/Produkt.java

	/*
	 * (non-Javadoc)
	 * TODO
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produkt [pNr=" + pNr + ", "
				+ (pDescr != null ? "pDescr=" + pDescr + ", " : "")
				+ "holding=" + holding + ", minHolding=" + minHolding + "]";
	}
}
