import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Keranjang {
    private final List<Produk> produk = new ArrayList<>();
    private final List<DapatDikirim> dikirim = new ArrayList<>();
    private final List<DapatDiunduh> diunduh = new ArrayList<>();

    public void tambah(Produk p) {
        produk.add(p);
        p.daftarkanKe(dikirim, diunduh);
    }

    public List<Produk> getProduk() {
        return Collections.unmodifiableList(produk);
    }

    public List<DapatDiunduh> getDapatDiunduh() {
        return Collections.unmodifiableList(diunduh);
    }

    public int jumlah() {
        return produk.size();
    }

    public int totalBelanja() {
        int total = 0;
        for (Produk p : produk) {
            total += p.hargaAkhir();
        }
        return total;
    }

    public int totalBeratGram() {
        int total = 0;
        for (DapatDikirim d : dikirim) {
            total += d.getBeratGram();
        }
        return total;
    }
}
