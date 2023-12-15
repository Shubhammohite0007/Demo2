package javaprograms;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12;
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=1;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
		}
        System.out.println(c);
	}

}
