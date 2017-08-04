
public class PrimeNumberCheck {

	public static void checkPrimeNumber(int num) {
		int i; 
		
		if (num %2 == 0) {
			System.out.println(num + "  not Prime Number");
		}
		else {
			boolean flag = false;
			for (i = 3 ; i < num /2 ; i ++) {
				if (num % i==0){
					System.out.println(num + " not Prime Number");
					flag = true;
					break;
				}
				
			}
			if (flag==false) {
				System.out.println(num + " Prime Number");
			}
		}
	}
}
