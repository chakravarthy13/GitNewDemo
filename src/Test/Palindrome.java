package Test;

public class Palindrome {
	
	
	public static void main(String[] args) {
		
		String a = "chahc";
		String rev = null;
		
		char[] c = a.toCharArray();
		
		for (int i = c.length; i > 0 ; i++) {
			//System.out.println(c[i]);
			rev = rev+c[i];
			
		}
		
		if(a.equals(rev)) {
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Its not palindrome");
		}
		
		
		
	}

}
