public class EmailSender implements PengirimNotifikasi {
    @Override
    public void kirim(String tujuan, String isi) {
        System.out.println("[EMAIL " + tujuan + "] " + isi);
    }
}
