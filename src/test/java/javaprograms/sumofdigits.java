package javaprograms;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12;
	     int rem=0;
	     int sum=0;
	     for(int i=0;i<=num;i++) {
	    	 if(i%2==0) {
	    		 sum=sum+i;
	    	 }
	    	 
	     }
	     System.out.println(sum);

	}

}
