package javaprograms;

public class duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sshhuubbham";
		char ch[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;i<str.length();j++) {
				if(ch[i]==ch[j]) {
					
					System.out.println("duplicate num are "+ch[j]);
					break;
				}
				
			}
			
		}
		

	}

}
