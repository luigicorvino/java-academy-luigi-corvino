package esercizio1;

public class Main {

	public static void main(String[] args) {
		int[] arr = {547, 87, 1, 24, 4, 9, 54, 37, 26, 19}; 

		System.out.println(calcolaMediaInteri(arr));

	}
	
	private static int calcolaMediaInteri(int[] arrayInt) {
		int sum=0;
		for(int i=0; i<arrayInt.length;i++ ) {
			sum+=arrayInt[i];
		}
		return sum/arrayInt.length;
	}

}
