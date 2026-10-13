package no.hvl.dat100;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class NavnSortering {
	/* 
	 * Har fil med navn på filen "navn.txt". På første linje finner
	 * vi antall navn.
	 * 
	 * Ønsker å lese disse, sortere dem og skrive dem sortert til
	 * en ny fil, "sortert.txt".
	 */
	public static void main(String[] args) throws Exception {

		//lager scanner
		File innfil = new File("navn.txt");
		Scanner leser = new Scanner(innfil);

		// Leser tallet på første linje, antall navn
		int antNavn = Integer.parseInt(leser.nextLine());

		// lager tabell for navn
		String[] navnTab = new String[antNavn];

		for (int i = 0; i < antNavn; i++) {
			navnTab[i] = leser.nextLine();
		}

		leser.close();

		Arrays.sort(navnTab);

		File utfil = new File("sortert_navn.txt");
		PrintWriter skriver = new PrintWriter(utfil);

		for (String navn : navnTab) {
			skriver.println(navn);
		}

		skriver.close();
	}

}
