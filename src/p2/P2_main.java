package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 6;
        double x = 1.5, y = 2.3;
        int intResult;
        double doubleResult;

        // --- Originale Zeilen zur Überprüfung (a-f) ---
        intResult = c - a * 3;
        System.out.println("a: " + intResult);  // -3

        intResult = c / b;
        System.out.println("b: " + intResult);  // 1

        intResult = a + b / c;
        System.out.println("c: " + intResult);  // 3

        doubleResult = c / b;                   // ORIGINAL (falsch!)
        System.out.println("d original: " + doubleResult);  // 1.0

        doubleResult = c + a / b;               // ORIGINAL (falsch!)
        System.out.println("e original: " + doubleResult);  // 6.0

        doubleResult = x + y * b;               // ORIGINAL (schon korrekt)
        System.out.println("f original: " + doubleResult);  // 13.0

        // --- Korrigierte Zeilen (nur d, e, f wie verlangt) ---
        // Minimaländerung: nur EIN (double)-Cast pro Zeile!
        doubleResult = (double) c / b;          // jetzt 1.2
        System.out.println("d korrigiert: " + doubleResult);

        doubleResult = c + (double) a / b;      // jetzt 6.6
        System.out.println("e korrigiert: " + doubleResult);

        doubleResult = x + y * b;               // unverändert – war schon richtig
        System.out.println("f korrigiert: " + doubleResult);  // 13.0
    }
}