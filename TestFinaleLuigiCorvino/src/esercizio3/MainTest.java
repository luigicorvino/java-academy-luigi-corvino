package esercizio3;

import esercizio3.implementazione.Calciatore;

public class MainTest {

	public static void main(String[] args) {
		Calciatore calciatore = new Calciatore("Victor", "Osimhen", 1998, "Lagos",
				"SSC Napoli", "Attaccante", 150_000_000.0, 5, 6_000_000.0);
		
		calciatore.stampaDati();
		
		double stipendioMensile = calciatore.calcolaStipendioMensile();
		
		System.out.println("Lo stipendio mensile di "+calciatore.getNome()+" "+calciatore.getCognome()
		+" è pari a: "+stipendioMensile);

	}

}
