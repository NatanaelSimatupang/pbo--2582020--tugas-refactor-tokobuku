public class CheckoutService {
    private final StrukPrinter printer;
    private final PenyimpanRiwayat riwayat;
    private final PengirimNotifikasi notifikasi;

    public CheckoutService(StrukPrinter printer, PenyimpanRiwayat riwayat, PengirimNotifikasi notifikasi) {
        this.printer = printer;
        this.riwayat = riwayat;
        this.notifikasi = notifikasi;
    }

    public void checkout(String pelanggan, String alamatEmail, Keranjang keranjang, MetodeBayar metode) {
        int bayar = metode.totalBayar(keranjang.totalBelanja());

        printer.cetak(pelanggan, keranjang, metode, bayar);

        riwayat.simpan(pelanggan + ";" + keranjang.jumlah() + " buku;" + Rupiah.format(bayar));
        notifikasi.kirim(alamatEmail, "Terima kasih " + pelanggan + ", total bayar " + Rupiah.format(bayar));
    }
}
