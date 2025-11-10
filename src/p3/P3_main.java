package p3;

public class P3_main {
    public static void main(String[] args) {
        
        // Alle 4 möglichen Kombinationen von x und y durchgehen
        boolean[] werte = {true, false};
        
        System.out.println("x     y     (a)          (b)     (c)     (d)");
        System.out.println("---------------------------------------------");
        
        for (boolean x : werte) {
            for (boolean y : werte) {
                // (a) !(x!=y && x==y)
                boolean a = !(x != y && x == y);
                
                // (b) x || true
                boolean b = x || true;
                
                // (c) x && false
                boolean c = x && false;
                
                // (d) (x && !y) || (!x)
                boolean d = (x && !y) || (!x);
                
                // Ausgabe in Tabellenform
                System.out.printf("%-5b %-5b %-12b %-7b %-7b %b%n", 
                                  x, y, a, b, c, d);
            }
        }
    }
}