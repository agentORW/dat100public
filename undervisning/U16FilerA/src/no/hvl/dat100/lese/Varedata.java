package no.hvl.dat100.lese;

import no.hvl.dat100.varelager.Vare;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Varedata {
    public static void main(String[] args) throws FileNotFoundException {

        final int MAX_ANT = 100;
        Vare[] vareliste = new Vare[MAX_ANT];

        File fileInput = new File("varedata.txt");
        Scanner in = new Scanner(fileInput);

        in.nextLine();

        int i = 0;
        while (in.hasNextLine()) {
            String linje = in.nextLine();
            String[] varedetaljer = linje.split(";");
            int nr = Integer.parseInt(varedetaljer[0]);
            String navn = varedetaljer[1];
            double pris = Double.parseDouble(varedetaljer[2]);
            int antall = Integer.parseInt(varedetaljer[3]);

            
        }


    }
}
