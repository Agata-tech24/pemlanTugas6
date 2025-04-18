public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasuk, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * getGaji()); // getGaji() dari superclass
    }

    @Override
    public String toString() {
        return super.toString() +
               "\ndepartemen : " + departemen;
    }
}
