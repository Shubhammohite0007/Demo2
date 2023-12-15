package javaprograms;

public class duplicateint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,2,3,4,5,32,2};
		
		for(int i=0;i<=
				a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count=count+1;
					System.out.println("duplicate num"+a[i]+" "+count);
				}
			}
		}

	}

}
