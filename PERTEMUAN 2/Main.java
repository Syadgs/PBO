public class Main{
    public static void main(String[] args){
        Kubus Kubus1 = new Kubus(5.0);

        // a. Hitung dan cetak volume dari kubus1
        double volumeKubus1 = Kubus1.hitungVolume();
        System.out.println("Volume Kubus1: " + volumeKubus1);

        // b. Hitung dan cetak luas permukaan dari kubus1
        double luasPermukaanKubus1 = Kubus1.hitungLuasPermukaan();
        System.out.println("Luas Permukaan Kubus1: " + luasPermukaanKubus1);
    }
}

