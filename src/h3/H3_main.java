package h3;

public class H3_main {
	public static void main(String[] args) {
		float celsiusFloat = 14.2f;
        float fahrenheitFloat;

        double celsiusDouble = 14.2;
        double fahrenheitDouble; 
        
        fahrenheitFloat = celsiusFloat * (9f/5f) + 32f;
        System.out.println("Float-Konvertierung: " + celsiusFloat + " Celsius = " + fahrenheitFloat + " Fahrenheit");
        
        fahrenheitDouble = celsiusDouble * (9.0/5.0) + 32.0;
        System.out.println("Double-Konvertierung: " + celsiusDouble + " Celsius = " + fahrenheitDouble + " Fahrenheit");
	}
}
