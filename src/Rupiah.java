import java.util.Locale;

public final class Rupiah {
    private Rupiah() {
    }

    public static String format(int angka) {
        return String.format(Locale.US, "Rp%,d", angka).replace(',', '.');
    }
}
