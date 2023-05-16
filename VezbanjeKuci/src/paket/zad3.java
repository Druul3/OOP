package paket;

import java.util.Scanner;

public class zad3 {
	public static void main (String [] args) {
		System.out.println("unesite neki tekst");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("duzina teksta:"+ str.length());
		System.out.println("karakter na prvoj poziciji "+str.charAt(0)+ " a na poslednjem "  +str.charAt(str.length()-1));
		System.out.println("malim slovima:"+str.toLowerCase());
		System.out.println("velikim:"+str.toUpperCase());
		System.out.println("da li tekst sadrzi m ili n "+str.contains("m") +str.contains("n"));
		
	sc.close();}

}
