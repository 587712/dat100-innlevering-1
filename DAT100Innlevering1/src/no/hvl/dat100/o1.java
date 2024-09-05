package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class o1 {
	public static void main(String[] args) {
		double skatt = 0; //Output-variabel
		String userInput = showInputDialog("Skriv inn bruttoløn: "); //Input bruttoløn
		int bruttoLoen = parseInt(userInput); //Verifiser input
		int[] trinn = {1350001, 937901, 670001, 292851, 208051}; //Nedre verdiar for skattetrinna
		double[] andel = {17.6, 16.6, 13.6, 4.0, 1.7}; //Satsar for skattetrinna
		//Beregn skatt
		//Trinn 5
		if(bruttoLoen > trinn[0]) {
			skatt += (bruttoLoen - trinn[0]) * andel[0] / 100;
			bruttoLoen -= (bruttoLoen - trinn[0]);
		}
		//Trinn 4
		if(bruttoLoen > trinn[1]) {
			skatt += (bruttoLoen - trinn[1]) * andel[1] / 100;
			bruttoLoen -= (bruttoLoen - trinn[1]);
		}
		//Trinn 3
		if(bruttoLoen > trinn[2]) {
			skatt += (bruttoLoen - trinn[2]) * andel[2] / 100;
			bruttoLoen -= (bruttoLoen - trinn[2]);
		}
		//Trinn 2
		if(bruttoLoen > trinn[3]) {
			skatt += (bruttoLoen - trinn[3]) * andel[3] / 100;
			bruttoLoen -= (bruttoLoen - trinn[3]);
		}
		//Trinn 1
		if(bruttoLoen > trinn[4]) {
			skatt += (bruttoLoen - trinn[4]) * andel[4] / 100;
			bruttoLoen -= (bruttoLoen - trinn[4]);
		}
		System.out.println(skatt); //Print resultat
	}
}
