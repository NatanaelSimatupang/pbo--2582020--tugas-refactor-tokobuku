import java.util.List;

public interface Produk {
    String getJudul();

    String getPenulis();

    int getHarga();

    int hargaAkhir();

    String keterangan();

    // Produk mendaftarkan diri ke daftar kemampuan yang dimilikinya (kirim/unduh).
    void daftarkanKe(List<DapatDikirim> dikirim, List<DapatDiunduh> diunduh);
}
