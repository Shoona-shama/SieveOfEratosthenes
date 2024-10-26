package erastos;

import java.util.Scanner;

public class SiebdesEratosthenesErsteLoesungsWeg {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Geben Sie eine positive ganze Zahl n ein: ");
		    int n = in.nextInt();
		    boolean[] Prime = new boolean[n+1];
		    int i = 2;
		    while(i<=n) {
		    	if(! Prime[i]) {
		    		System.out.print(i+",");
		    		int j = i+i;
		    		
		    		while(j <= n) {
		    			Prime[j]= true;
		    			
		    			j += i;
		    			
		    		}
		    		
		    	i++;
		    	
		    }
		
	}

  }
}
