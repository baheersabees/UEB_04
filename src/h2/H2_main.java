package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x, y, a, b, c;
		int input=10;
		
		x = (input == 10 || input==11);
		y = (input == 11|| input==1);
		
		
		a = (x&&y);
		b = (x||x!=y);
		c = ((x&&!y) || (!x&&!y));
		
		System.out.println("input: " + input);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
	}
}
