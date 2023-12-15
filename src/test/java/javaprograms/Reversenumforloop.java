package javaprograms;

public class Reversenumforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		
		int rev=0;
		int rem=0;
		
		for(rev=0;num>0;num=num/10) {
			rem=num%10;
			rev=rev*10+rem;	
		}
		System.out.println(rev);	
	}
}


