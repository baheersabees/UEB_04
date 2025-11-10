package h1;

public class H1_main {
	public static void main(String[] args) {
		int zone=1;
		double price=2.0;
		
		switch(zone) {
		default:
			price=2.00;
			break;
		case 6:
			price=4.00;
			break;
		case 5:
			price+=0.70;
		case 3, 4:
			price+=0.50;
		case 2:
			price+=0.35;
		case 1:
			break;
		}
		
		System.out.println("Der Gesamte Preis beträgt: "+ price+"€");
	}
}
