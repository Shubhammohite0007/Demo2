package javaprograms;

public class asscendingarray {
	
	public static void main(String[] args) {
		
		int a[]= {8,5,7,3,2,1,0};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}		

		}	
		System.out.println(a[a.length-1]);
	}

}
