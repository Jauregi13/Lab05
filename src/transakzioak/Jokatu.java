package transakzioak;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Jokatu {

	public static void main(String[] args) throws IOException  {		
		Transakzio trans = new Transakzio();
		Ordainketa ord;
		ArrayList<Ordainketa> ordainketak = new ArrayList<Ordainketa>();
		Scanner sc = new Scanner(new File("ordainketak/ordainketak.txt"));
		String lerroa;
		String[] zenbakiak;
		int nork, nori, kopurua;

		while(sc.hasNextLine()) {
			lerroa = sc.nextLine();			
			zenbakiak = lerroa.split("\\s+");
			nork = Integer.parseInt(zenbakiak[0]);
			nori = Integer.parseInt(zenbakiak[1]);
			kopurua = Integer.parseInt(zenbakiak[2]);
			ord = new Ordainketa(nork, nori, kopurua);
			ordainketak.add(ord);
		}
		sc.close();	
		int kop = trans.ordainketakSimulatu(ordainketak);
		System.out.println("FALTSIFIKATZAILEAK "+ kop + " BILLETE ON LORTU DITU");

	}

}
