package para;

import java.util.Locale;
import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		for(int i =1; i<=n ; i++) {
			double media = (a * 2.0 + b * 3.0 + c * 5.0)/10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
