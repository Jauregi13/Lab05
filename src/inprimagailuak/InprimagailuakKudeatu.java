package inprimagailuak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import ilara.Ilara;


public class InprimagailuakKudeatu {
	// OSATU HAU: DATUEN ERREPRESENTAZIOA
	
	
	public static void hasieratu () {
		// OSATU HAU
		

	}
	
	public static void tratatuEskaera(String[] osagaiak) {
		// OSATU HAU

	}

	
	public static void inprimatu () {	
		// OSATU HAU

	}
	
	public static void main(String args[]) throws FileNotFoundException {
        String fitxIzena = "inprimagailuak/inp_gertaerak.txt";
    	Scanner sc = new Scanner(new File(fitxIzena)); 
        String lerroa;
        String[] osagaiak;

        hasieratu();
		while(sc.hasNextLine()) {
			lerroa = sc.nextLine();			
			osagaiak = lerroa.split("\\s+");
            tratatuEskaera(osagaiak);
		}

        inprimatu();
        sc.close();
	}
}