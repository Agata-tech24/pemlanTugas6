public class Pekerja extends Manusia {
    private double gaji;
    private int tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int tahunSekarang = 2025;
        int lamaKerja = tahunSekarang - tahunMasuk;
        double bonus;

        if (lamaKerja <= 5) {
            bonus = 0.05 * gaji;
        } else if (lamaKerja <= 10) {
            bonus = 0.1 * gaji;
        } else {
            bonus = 0.15 * gaji;
        }

        return bonus;
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public double getPendapatan() {
        return gaji + getBonus() + getTunjangan() + (jumlahAnak * 20);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntahun masuk : " + tahunMasuk +
                "\njumlah anak : " + jumlahAnak +
                "\ngaji : " + gaji;
    }
}
