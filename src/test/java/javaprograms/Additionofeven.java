package javaprograms;

public class Additionofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=14;
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}System.out.println(sum);

	}

}
