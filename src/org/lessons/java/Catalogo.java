package org.lessons.java;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bookNumber = 0;
		boolean loopExit = false;
		
		do {
			try {
				System.out.println("Quanti libri vuoi inserire?");
				bookNumber = Integer.parseInt(scan.nextLine());
				if (bookNumber <= 0) {
					System.out.println("Errore: non inserire 0 o numeri negativi. Riprova...");
				} else {
					loopExit = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Errore: inserire un numero. Riprova...");
			}
		} while (!loopExit);
		
		Libro[] libri = new Libro[bookNumber];
		
		// Ciclo Input Libri
		for (int i = 0; i < libri.length; i++) {
			loopExit = false;
			
			
			do {
				System.out.println("Inserisci il libro n." + (i+1) + " di " + libri.length);
				System.out.println();

				try {
					System.out.println("Titolo:");
					String title = scan.nextLine();
					
					System.out.println("Numero pagine:");
					int pageNumber = Integer.parseInt(scan.nextLine());
					
					System.out.println("Autore:");
					String author = scan.nextLine();
					
					System.out.println("Editore:");
					String editor = scan.nextLine();
					System.out.println();
					
					libri[i] = new Libro(title, pageNumber, author, editor);
					
					loopExit = true;
				} catch (EmptyFieldException e) {
					System.out.println("Stop1!! " + e.getMessage());
				} catch (PageNumberException e) {
					System.out.println("Stop2!! " + e.getMessage());
				} catch (Exception e) {
					System.out.println("Stop3!! " + e.getMessage());
				}
			} while (!loopExit);
		}
		
		// Stampa i libri
		for (int i = 0; i < libri.length; i++) {
			System.out.println(libri[i].toString());
			System.out.println();
		}
		
		scan.close();
	}

}
