package no.hvl.dat100.eksempler;

public class MiniExcel {

	private static int[][] data = 
		{
		  { 1, 2, 0 }, 
		  { 3, 4, 0 }, 
		  { 5, 6, 0 }, 
		  { 0, 0, 0 } 
		  
		  };

	public static void skrivUt() {

		System.out.println("---------------");

		// TODO
		
		for (int[] rad : data) {
			
			for (int v : rad) {
				System.out.print(v + " ");
			}
			
			System.out.println();
		}

		System.out.println("---------------");
	}

	public static void beregnSum() {

		// TODO - SUMMER RAD
		
		for (int[] rad : data) {
			int radLengde = rad.length;
			int radSum = 0;

			for (int v : rad) {
				radSum += v;
			}

			rad[radLengde-1] = radSum;
		}
		
		// TODO - SUMMER KOLONNER
		
		int sisteradpos = data.length-1;
		int radlengde = data[0].length;
		
		int[] sisterad = data[sisteradpos];
		
		// Vi går gjennom egentlig vanlig, men kolonne først og så rad, og legger til [rad][kolonne].
		
		for (int k = 0; k<radlengde; k++) {
			int sum = 0;

			for (int r = 0; r<sisteradpos; r++) {
				sum += data[r][k];
			}

			sisterad[k] = sum;
		}
		
	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
