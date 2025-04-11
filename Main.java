public class Main {
    public static void main(String[] args) {
        // Manusia
        Manusia m1 = new Manusia("A", "111", true, true);
        Manusia m2 = new Manusia("B", "112", false, true);
        Manusia m3 = new Manusia("C", "113", true, false);
        System.out.println(m1 + "\n");
        System.out.println(m2 + "\n");
        System.out.println(m3 + "\n");

        // Mahasiswa
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("165150300111000", 2.9, "D", "114", true, false);
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("165150200111000", 3.4, "E", "115", false, false);
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("165150400111000", 3.8, "F", "116", false, false);
        System.out.println(mhs1 + "\n");
        System.out.println(mhs2 + "\n");
        System.out.println(mhs3 + "\n");

        // Pekerja
        Pekerja pk1 = new Pekerja(1000, 2023, 2, "G", "117", true, true);
        Pekerja pk2 = new Pekerja(2000, 2015, 0, "H", "118", true, true);
        Pekerja pk3 = new Pekerja(3000, 2005, 10, "I", "119", true, true);
        System.out.println(pk1 + "\n");
        System.out.println(pk2 + "\n");
        System.out.println(pk3 + "\n");

        // Manager
        Manager man = new Manager("HRD", 7500, 2010, 3, "J", "120", true, true);
        System.out.println(man);
    }
}
