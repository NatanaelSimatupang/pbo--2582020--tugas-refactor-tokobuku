public class Transfer implements MetodeBayar {
    private static final int BIAYA_ADMIN = 2500;

    @Override
    public String nama() {
        return "Transfer (+Rp2.500)";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja + BIAYA_ADMIN;
    }
}
