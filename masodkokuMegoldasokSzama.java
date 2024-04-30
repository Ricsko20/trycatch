public class masodkokuMegoldasokSzama {

    public static int masodfokuMegoldasokSzama(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Nem másodfokú függvény!");
        }
        else if((b * b - 4 * a * c) > 0) {
            return 2;
        }
        else if ((b * b - 4 * a * c) == 0) {
            return 1;
        }
        else if ((b * b - 4 * a * c) < 0) {
            return 0;
        }
        else {
            return -1;
        }
    }

    public static String masodfokuGyokok(double a, double b, double c) {
        double diszkriminans = b * b - 4 * a * c;

        if (a == 0) {
            throw new IllegalArgumentException("Nem másodfokú függvény!");
        } else if (diszkriminans > 0) {
            double x1 = (-b + Math.sqrt(diszkriminans)) / (2 * a);
            double x2 = (-b - Math.sqrt(diszkriminans)) / (2 * a);
            return String.format("x1 = %.1f, x2 = %.1f", x1, x2);
        } else if (diszkriminans == 0) {
            double x = -b / (2 * a);
            return String.format("x = %.1f", x);
        } else {
            return "Nincs valós gyök!";
        }
    }

    public static void main(String[] args) {
        
    }
}
