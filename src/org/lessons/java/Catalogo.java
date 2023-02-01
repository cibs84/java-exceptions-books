package org.lessons.java;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int bookNumber = 0;
		boolean loopExit = false;

		while (!loopExit) {
			try {
				System.out.println("Quanti libri vuoi inserire?");
				bookNumber = Integer.parseInt(scan.nextLine());
				if (bookNumber <= 0) {
					System.out.println("Errore: non inserire 0 o numeri negativi. Riprova...");
				} else {
					loopExit = true; // esce dal ciclo
				}
			} catch (NumberFormatException e) {
				System.out.println("Errore: inserire un numero. Riprova...");
			}
		};

		Libro[] libri = new Libro[bookNumber];

		// Crea tutti i libri
		for (int i = 0; i < libri.length; i++) {

			System.out.println("Inserisci il libro n." + (i + 1) + " di " + libri.length);
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

			} catch (EmptyFieldException e) {
				System.out.println(e.getMessage());
				System.out.println("Riprova...");
				System.out.println();
				i--; // riporta l'iterazione allo stesso elemento che ha generato l'eccezione
			} catch (PageNumberException e) {
				System.out.println(e.getMessage());
				System.out.println("Riprova...");
				System.out.println();
				i--; // riporta l'iterazione allo stesso elemento che ha generato l'eccezione
			} catch (NumberFormatException e) {
				System.out.println("Inserire un numero");
				System.out.println("Riprova...");
				System.out.println();
				i--; // riporta l'iterazione allo stesso elemento che ha generato l'eccezione
			}
		}

		// Stampa tutti i libri
		for (int i = 0; i < libri.length; i++) {
			System.out.println(libri[i]);
			System.out.println();
		}

		scan.close();
	}

}
