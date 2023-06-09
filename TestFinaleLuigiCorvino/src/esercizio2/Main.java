package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, count=0;
		int currentNum=0;
		while(true) {

			//Validazione inserimento numero
			currentNum = inserisciInteroDaTastiera(sc);

			//Caso in cui si vuole terminare
			if(currentNum==-1) {
				break;
			}

			//Caso in cui si inserisce un numero non valido		
			if(!isGradeValid(currentNum)) {
				System.out.println("Valore inserito non corretto!");
				continue;
			}
			
			//Caso in cui si inserisce un numero valido
			sum+=currentNum;
			count++;
		}

		//Stampa Risultato
		if(count!=0) {
			int average= calcolaMedia(sum, count);
			System.out.println("La media dei tuoi "+ count +" esami è: "+average);
		}else {
			System.out.println("Non hai inserito esami");
		}

		sc.close();

	}
	
	private static int inserisciInteroDaTastiera(Scanner sc) {
		boolean retry=true;
		int num=0;
		do {
			System.out.println("Inserire il numero (o -1 per terminare)");
			try {
				num= Integer.parseInt(sc.nextLine());
				retry=false;
			}catch(NumberFormatException ex) {
				System.out.println("Input non valido. Riprovare");
			}	
		}while(retry);
		return num;
	}
	
	private static boolean isGradeValid(int num) {
		return (num>=18 && num<=30);
	}

	
	private static int calcolaMedia(int sum, int count) {
		return sum/count;
	}
}
