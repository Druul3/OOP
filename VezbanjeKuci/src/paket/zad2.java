package paket;

import java.util.Scanner;

public class zad2 {
public static void main (String [] args) {
	
	System.out.println("unesite neki broj");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int flag = 0;
	for(int i = 2; i<n ; i++) {
		if(n%i==0) {
			flag = 1;
			break;
		}
		else	flag = 2;	
	}
	if(flag == 1) {
		System.out.println("nije");
		
	}else if(flag == 2)System.out.println("jeste");
	
sc.close();
}
}
