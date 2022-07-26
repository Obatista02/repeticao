package para;

import java.util.Locale;
import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i <n; i++) {
			
			int y = sc.nextInt();
			int x = sc.nextInt();
			
			if(y == 0) {
				System.out.println("Divisao Impossivel!!");
			}
			else {
				double div = (double) x/y;
				System.out.printf("%.2f%n",div);
			}
		}
		
		sc.close();
		
		
	}

}
