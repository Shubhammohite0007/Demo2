package javaprograms;

public class palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=12321;
		int rem=0;
		int rev=0;
		int temp=num;
		
		for(rev=0;num>0;num=num/10) {
			rem=num%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("palandrome number");
		}else {
			System.out.println("not a palandrome num");
		}

	}

}
