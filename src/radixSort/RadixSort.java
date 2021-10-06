package radixSort;

import java.util.ArrayList;

import ilara.Ilara;

public class RadixSort {

	/*
	 * a taulako zenbaki osoak gorantz ordenatzen ditu radixsort metodoaren bidez,
	 * eta zenbaki ordenatuak inprimatu egiten ditu
	 * @param a: ordenatu beharreko zenbakien arraya
	 *        digituMax: a taulako zenbakien artean digitu-kopuru maximoa
	 */
	public Ilara<Integer> radixSort(Integer[] a, int digituMax) {
		// HAU OSATU
		Ilara<Integer> emaitza = new Ilara<Integer>();
		ArrayList<Ilara> taula = new ArrayList<Ilara>();
		
		for (int i = 0; i < digituMax; i++) {
			
		}
		
		 
		return emaitza;
	
	}
	

	
	
    public static void main(String[] args) { 
   	
		Integer[] a = {101, 207, 198, 713, 542, 23, 78, 2, 966, 205};
		Ilara<Integer> emaitza;
		System.out.println("HASIERAKO ZENBAKIAK:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
 
		RadixSort rs = new RadixSort();
		emaitza = rs.radixSort(a, 3);

		System.out.println("RADIX SORT ORDENAZIOAREN EMAITZA:");
		System.out.print("< ");
		for (Integer z : emaitza) {
			System.out.print(z + " ");
		}
		System.out.println(">");
    } 
}
