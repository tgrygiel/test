import java.util.Arrays;
import java.util.Scanner;

import aisd.InsertSort;
import aisd.InsertSort2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int wiek = 27;
		System.out.println(wiek);
		
		
		double chleb = 2.70;
		double mleko = 2.30;
		double baton = 4;
		
		double suma = chleb + mleko + baton;
		System.out.println(suma);	
		
		
		String imie = "Tomek";
		String kurs = "zaczal kurs programowania w Javie";
		String rezultat1 = imie + " " + kurs;
				
		System.out.println(rezultat1);
		
		// Deklaracja i inicjalizacja zmiennych
		
		int mojaLiczba = 10;
		mojaLiczba = mojaLiczba + 1;
		mojaLiczba += 10;
		
		double rezultat2 = 11/2;
		
		System.out.println(rezultat2);
		
		
		// Instrukcje warunkowe
		int jakasLiczba = 10;
		boolean wynik = jakasLiczba < 5;
		
		if (jakasLiczba + 5 > 20) {
			System.out.println("Wynik jest: true");
		} else {
			System.out.println("NIE PRAWDA");
		}
		
		// TABLICE		

		int[] numeryWLoterii = { 7, 10, 23, 16, 3, 1 };
		
		int iloscElementowWTablicy = numeryWLoterii.length;
		
		int piataLiczbaZTablicy = numeryWLoterii[4];
		
		System.out.println( numeryWLoterii[4] );
		
		numeryWLoterii[4] = 121;
		
		System.out.println( numeryWLoterii[4] );
				
		System.out.println( Arrays.toString(numeryWLoterii) );
		
		
		String[] listaAut = new String[5];
		
		
		System.out.println( Arrays.toString(listaAut) );
		
		
		// Petla WHILE
		int cenaTelewizora = 3000;
		while(cenaTelewizora < 4000) {
			System.out.println("Telewizor klasy premium");
			cenaTelewizora = 4000;
		}
		
		int licznik = 0;
		while(licznik < 10) {
			System.out.println("CZEŒÆ Wszystkim");
			licznik = licznik + 1;
		}
		
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		System.out.println("PODAJ LICZBE");
//		int liczba = scanner.nextInt();
//		
//		if (liczba > 10) {
//			System.out.println("Liczba wieksza od 10: " + liczba);
//		} else {
//			System.out.println("Liczba mniejsza lub rowna 10 " + liczba);
//		}
//		
//		
//		System.out.println("LOTERIA !!!!!!!");
//		
//		int[] typowaneLiczby = new int[4];
//		int licznik2 = 0;
//		while(licznik2 < 4) {
//			System.out.println("PODAJ " + licznik2 + " LICZBE");
//			int typowanaLiczba = scanner.nextInt();	
//			typowaneLiczby[licznik2] = typowanaLiczba;
//			licznik2 = licznik2 + 1;
//		}
//		
//		System.out.println(Arrays.toString(typowaneLiczby));
//		
		
		
		// Petla FOR
		
		String[] names = { "Tomek", "Ania", "Marysia" };
	
		System.out.println("Petla for");
		
		for (int licznik4 = 0 ; licznik4 < names.length ; licznik4 = licznik4 + 1 ) {
			System.out.println( names[licznik4] );
		}
		
		
		// Cwiczenie 8 (slajd 21)

		int[] losoweLiczby = { 5, 6, 11 };
		int sumaLiczb = 0;
		for (int index = 0 ; index < losoweLiczby.length ; index = index + 1 ) {
			sumaLiczb = sumaLiczb + losoweLiczby[index];
			
			
		}
		
		
		
		
		
		System.out.println("WYNIK sumowania: " + sumaLiczb);
		
		
		int[] testArray = {17, 5, 19, 2,4};
		InsertSort insertSort = new InsertSort();
		InsertSort2 insertSort2 = new InsertSort2();
		System.out.println(Arrays.toString(insertSort2.sort(testArray)));
	}
	
}
