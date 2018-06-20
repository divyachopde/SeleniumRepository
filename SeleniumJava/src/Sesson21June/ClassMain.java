package Sesson21June;

public class ClassMain {

	public static void main (String Args[]) {
		
		boolean a= true;
		boolean b= false;
		short c = 1;
		int d= 12;
		long e= 18999;
		float f = 12.3f;
		double g = 12.11;
		char h= 'a';
		final int i=10;//final is for constant
		double j=d;//type conversion
		double k=d;
		Boolean b1 = true;//type casting
		Boolean b2 = new Boolean(true);
		Short s = c;
		Integer x= d;
		Long y= e;
		Float z = f;
		Double q=g;
		Character w = h;
		 
		String r = "123"; // type casting object(parsing)
		int t = Integer.parseInt(r);
		
		long l = 1666;//type casting primitive
		int u = (int) l;
		
		double v = 12.345;
		float m = (float) v;
		
		
		
		System.out.println(d++);//post increment	
		System.out.println(d);
		System.out.println(++d);
		
		System.out.println(m);
		
		System.out.println(t);
		System.out.println(u);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(q);
		System.out.println(w);
	}
}
