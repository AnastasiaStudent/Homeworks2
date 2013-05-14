package de.aufgabe6.kartenspiel;

import java.util.*;

/**
 * @author Anastasia Baron
 * @author Dmitry Petrov
 */
public class Geben {
	/*
	 * Schreiben Sie ein Programm, das ein Kartenspiel mit 52 Karten mit 4
	 * Farben (Kreuz, Pik, Herz und Karo) zu je 13 Karten (Ass, Konig, Dame,
	 * Bube, 10, 9, 8, 7, 6, 5, 4, 3, 2) auf eine uber die Kommandozeile
	 * definierte Anzahl von Spielern verteilt. Das zweite
	 * Kommandozeilenargument gibt an wie viele Karten jeder Spieler erhalten
	 * soll. Hinweis: Karten konnen als String-Objekte reprasentiert werden
	 * ("karo 6","herz dame", ...). Eine Liste eignet sich zur Darstellung des
	 * Kartenstapels, mit der shuffle-Methode aus der Collections-Klasse kann
	 * der Kartenstapel gemischt werden und mit der Methode sublist(...) soll
	 * man ein Blatt je Spieler definieren und aus dem restlichen Kartenstapel
	 * loschen. Inspiratation:
	 * http://www.tutorialspoint.com/java/util/collections_shuffle.htm
	 */
	public static void main(String[] args) {

		List<String> ls = new LinkedList<String>();
//		ls.add("karo 2");
//		ls.add("karo 3");
//		ls.add("karo 4");
//		ls.add("karo 5");
//		ls.add("karo 6");
//		ls.add("karo 7");
//		ls.add("karo 8");
//		ls.add("karo 9");
//		ls.add("karo 10");
//		ls.add("karo Bube");
//		ls.add("karo Dame");
//		ls.add("karo Konig");
//		ls.add("karo (kick) Ass");
//
//		ls.add("pic 2");
//		ls.add("pic 3");
//		ls.add("pic 4");
//		ls.add("pic 5");
//		ls.add("pic 6");
//		ls.add("pic 7");
//		ls.add("pic 8");
//		ls.add("pic 9");
//		ls.add("pic 10");
//		ls.add("pic Bube");
//		ls.add("pic Dame");
//		ls.add("pic Konig");
//		ls.add("pic (kick) Ass");
//
//		ls.add("herz 2");
//		ls.add("herz 3");
//		ls.add("herz 4");
//		ls.add("herz 5");
//		ls.add("herz 6");
//		ls.add("herz 7");
//		ls.add("herz 8");
//		ls.add("herz 9");
//		ls.add("herz 10");
//		ls.add("herz Bube");
//		ls.add("herz Dame");
//		ls.add("herz Konig");
//		ls.add("herz (kick) Ass");
//
//		ls.add("kreuz 2");
//		ls.add("kreuz 3");
//		ls.add("kreuz 4");
//		ls.add("kreuz 5");
//		ls.add("kreuz 6");
//		ls.add("kreuz 7");
//		ls.add("kreuz 8");
//		ls.add("kreuz 9");
//		ls.add("kreuz 10");
//		ls.add("kreuz Bube");
//		ls.add("kreuz Dame");
//		ls.add("kreuz Konig");
//		ls.add("kreuz (kick) Ass");
		String array[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "Konig", "(kick) Ass"};
		String sad[] = {"kreuz", "karo", "piko", "herz"};
		
		// nur wenn syso benutzt wird
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < sad.length; i++) {
			for (int s = 0; s < array.length; s++) {
				//System.out.println((sb.append(array[s].toString() + " " + sad[i].toString())));
				ls.add(array[s].toString() + " " + sad[i].toString());
			}
		}
		// Methode aus der Collections-Klasse mischt den Kartenstapel
		Collections.shuffle(ls);

		// Zum Einlesen von den Kommandozeilen
		int anzahlSpieler = Integer.parseInt(args[0]);
		int anzahlKarten = Integer.parseInt(args[1]);
		System.out.print("Anzahl der Karten : " + anzahlSpieler + "\n");
		System.out.print("Anzahl von Spielern: " + anzahlKarten + "\n");

		// Schleife zum Erstellen einer Liste fuer jeden Spieler
		int i = 0;
		while (i < anzahlSpieler) {
			// wird wiederholt so oft, bis die gewuenschte Anzahl nicht erzielt
			// wird

			List<String> spieler = new LinkedList<String>(ls.subList(0,
					anzahlKarten));
			ls.removeAll(spieler);

			// loescht die Elemente dieser Liste vom ganzen Stapel
			System.out.println(spieler);
			// gibt die Karte dieses Spilers zurueck
			i++;
		}
	}
}
