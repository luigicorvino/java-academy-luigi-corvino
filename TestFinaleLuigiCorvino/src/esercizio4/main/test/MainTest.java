package esercizio4.main.test;

import esercizio4.fumetteria.Fumetteria;
import esercizio4.fumetteria.Fumetto;

public class MainTest {

	public static void main(String[] args) {
		Fumetto f1 = new Fumetto("Superman","Marvel",1960,13.35,"Mondadori","Superman","Smith");
		Fumetto f2 = new Fumetto("One Piece","Verdi",1998,10.5,"Mondadori","One Piece","Rossi");
		Fumetto f3 = new Fumetto("Naruto","Neri",2010,9.75,"Mondadori","Superman","Bianchi");
		Fumetto f4 = new Fumetto("Dragon Ball","Rossi",1960,13.35,"Mondadori","Superman","Bianchi");

		Fumetto[] arrayFumetti = new Fumetto[4];
		arrayFumetti[0] = f1;
		arrayFumetti[1] = f2;
		arrayFumetti[2] = f3;
		arrayFumetti[3] = f4;
		Fumetteria fumetteria = new Fumetteria("Comics","via Napoleone","Mario Rossi",5, arrayFumetti);
		
		fumetteria.stampaDati();
		


	}

}
