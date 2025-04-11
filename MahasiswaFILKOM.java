public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75;
        } else {
            return 0;
        }
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char prodiKode = nim.charAt(6);
        String prodi = switch (prodiKode) {
            case '2' -> "Teknik Informatika";
            case '3' -> "Teknik Komputer";
            case '4' -> "Sistem Informasi";
            case '6' -> "Pendidikan Teknologi Informasi";
            case '7' -> "Teknologi Informasi";
            default -> "Tidak Diketahui";
        };
        return prodi + ", " + angkatan;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() +
               "\nnim : " + nim +
               "\nipk : " + ipk +
               "\nstatus : " + getStatus();
    }
}
