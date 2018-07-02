package Session30June;

public class StrngMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ABC";
		//String b="ABC";
		String b= new String("ABC");
		
		if(a==b) {
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("a and b not equal");
			
		}
		
		if(a.equals(b)) {
			System.out.println("a and b are equal1");
		}
		else {
			System.out.println("a and b not equal");
			
		}
		
		//convert int to string
		
		int Q=1234;
		String s= String.valueOf(Q);
		
		System.out.println(s);
		
		String S=Q + "" +10;
		
		System.out.println(S);
		
		String B="Test\nTest";//new line
		String B1="Test\\nTest";//
		System.out.println(B);
		
		String star= "****\n****\n****\n****\n";
		System.out.println(star);
		
	}

}
