package no.hvl.dat100;

import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.showInputDialog;

public class o3 {
	public static void main(String[] args) {
		String userInput = showInputDialog("Skriv inn eit tal over null: "); //Skriv inn heiltal over null
		long n = parseLong(userInput); //Verifiser input
		nFactorial(n); //Kjør metode for n!
	}
	static void nFactorial(long n) {
		long n_ut = 1; //Output-variabel
		//Verifiser gyldig input
		if(n > 0) {
			//Beregn n!
			for(; n > 0; n--) {
				n_ut = n_ut * n;
			}
			System.out.println(n_ut); //Print n!
		}
		//Ved ugyldig input
		else {
			//Skriv inn nytt tal og kjør metode
			nFactorial(parseLong(showInputDialog("Ugyldig input, skriv inn tal over null: ")));
		}
	}
}
