public class Kubus {
    //atribut
    private double Sisi;
    
    //constructor
    public Kubus(double Sisi) {
        this.Sisi = Sisi;
    }

    // Method untuk menghitung volume kubus
    public double hitungVolume() {
        return Math.pow(Sisi, 3);
    }

    // Method untuk menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(Sisi, 2);
    }
}
