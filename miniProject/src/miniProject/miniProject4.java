package miniProject;

public class miniProject4 {

	public static void main(String[] args) {
		int number = 220;
		int number2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i==0) {
				toplam1 = toplam1 +i;
			}
		}
		
		for(int i=1; i<number2; i++) {
			if(number2 % i==0) {
				toplam2 = toplam2 +i;
			}
		}
		
		if(number==toplam2 && number2==toplam1) {
			System.out.println("Bu iki sayý arkadaþtýr.");
		}
		else {
			System.out.println("Bu iki sayý arkadaþ deðildir.");
		}
	}

}
