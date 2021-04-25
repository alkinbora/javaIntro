package miniProject;

public class miniProject1 {
	
	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayý.");
			return;
		}
		
		for (int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
			
		}
		
		if(isPrime==false) {
			System.out.println("Sayý asal deðildir.");
		}
		else {
			System.out.println("Sayý asaldýr.");
		}
	}

}


