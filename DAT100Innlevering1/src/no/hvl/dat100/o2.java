package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class o2 {
	public static void main(String[] args) {
		int poengsum;
		//Legg inn og beregn poengsummer
		for(int i = 9; i > 0; i--) {
			String userInput = showInputDialog("Skriv inn poengsum: "); //Input poengsum
			poengsum = parseInt(userInput); //Verifiser poengsum
			checkMethod(poengsum); //Kjør metode for beregning av karakter
		}
	}
	static void checkMethod(int poengsum) {
		if(poengsum <= 100 && poengsum >= 0) {
			//Test for A
			if(poengsum >= 90) {
				System.out.println("A");
			}
			//Test for B
			else if(poengsum >= 80) {
				System.out.println("B");
			}
			//Test for C
			else if(poengsum >= 60) {
				System.out.println("C");
			}
			//Test for D
			else if(poengsum >= 50) {
				System.out.println("D");
			}
			//Test for E
			else if(poengsum >= 40) {
				System.out.println("E");
			}
			//Test for F
			else {
				System.out.println("F");
			}
		}
		//Ugyldig
		else {
			String nyUserInput = showInputDialog("Ugyldig input, skriv inn ny sum: "); //Legg inn ny input
			int nysum = parseInt(nyUserInput); //Verifiser ny input
			checkMethod(nysum); //Kjør metode for beregning av karakter med ny input
		}
	}
}
