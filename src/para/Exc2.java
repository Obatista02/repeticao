package para;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				 in = in + 1;
			}else {
				out = out + 1;
			}
		}
		System.out.println(in + " dentro");
		System.out.println(out +" fora");
		sc.close();
	}

}
