import java.util.Scanner;

public class PrimeNumberPattern {
	
	public static void primeInPattern() { 
		int primecount=0, count=1, num=2;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows are to be printed");
		int n = scan.nextInt();
		primecount = (n*(n+1))/2;
		
		while (count <= primecount) {
			for (int row=1; row <= n ;row++){
				for (int col=1; col<=row ; col++){		
					boolean isPrime=true;
						if(num==2){
							isPrime=true;
						}
						else if(num%2==0){
							isPrime=false;
							col--;
						}
						
						else if (num > 2){
							for(int i=3; i<num; i++){
								if (num%i==0){
									isPrime=false;
									col--;
									break;
								}
							}
						}
						
						if(isPrime == true){
							System.out.print(num + " ");
							count++;
						}
						
						num++;
					
				}
				System.out.println();
			}
		
		
		}
		
	}

}
