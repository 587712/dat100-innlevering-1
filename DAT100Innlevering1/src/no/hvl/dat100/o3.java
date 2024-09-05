package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class o3 {
	public static void main(String[] args) {
		String userInput = showInputDialog("Skriv inn eit tal over null: "); //Skriv inn heiltal over null
		int n = parseInt(userInput); //Verifiser input
		nFactorial(n); //Kjør metode for n!
	}
	static void nFactorial(int n) {
		int n_ut = 1; //Output-variabel
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
			nFactorial(parseInt(showInputDialog("Ugyldig input, skriv inn tal over null: ")));
		}
	}
}
