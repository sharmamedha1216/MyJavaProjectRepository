
public class ListPrimeNumbers {

	public static void listPrimeNum (int n) {
		int i, num=3, count, primecount=1;
		String primelist= "";
		for (count = 1; primecount <= n ; count ++ ) {
				
				if (num %2 == 0) {
					//System.out.println(num + "  not Prime Number");
				}
				else {
					boolean flag = false;
					for (i = 3 ; i < num /2 ; i ++) {
						if (num % i==0){
							//System.out.println(num + " not Prime Number");
							flag = true;
							break;
						}
					}
					if (flag==false) {
						//System.out.println(num + " Prime Number");
						primelist = primelist +" "+ num;
						primecount++;
						
					}
				}
				num++;
		}
		
		System.out.println(primelist);
		
	}
}
