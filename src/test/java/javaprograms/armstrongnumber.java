package javaprograms;

public class armstrongnumber {

	//153==1^3+5^3+3^3=153
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rem=0;
		int num=154;
		int temp=num;
		int sum=0;
		
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("not armstrong");
		}

	}

}
