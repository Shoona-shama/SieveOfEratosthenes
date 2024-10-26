package erastos;

import java.util.Scanner;

public class SiebeAlgorithmZweiteLoesungsWeg {
	
	
	public static void main(String[] args) {
		
		boolean[] gestrichen;
		int obergrenze;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Sieb des Eratosthenes: Alle Primzahlen bis n");
		
		System.out.println("Eingabe von n:");
		obergrenze = in.nextInt();

		    gestrichen = new boolean[obergrenze+1];
		
		      for (int position = 2; position+position <= obergrenze; position++) {
		
			
		         if(!gestrichen[position]) {
	
		             for (int posVielfaches=position+position; 
		                posVielfaches <= obergrenze; 
		                posVielfaches += position)
		                gestrichen[posVielfaches] = true;
		         }
		       }
		                 System.out.println("Alle Primzahlen im Bereich 1 bis " + obergrenze);
		
	                    	for (int i=2; i<=obergrenze; i++)
			
	                         	if (!gestrichen[i])
			
	                            	System.out.print(i + " ");
		                            System.out.println(" "); 
	                               	in.close();
		}

}
