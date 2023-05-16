package paket;

import java.util.Scanner;

public class zad1 {
	public static void main(String [] args) {
		System.out.println("Unesite N");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int zbir = 0;
		for(int i = 0 ; i<=n ; i++) {
			zbir+=i;
		}
		System.out.println("zbir je " +zbir );
	}

}
