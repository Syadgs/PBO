public class Penjual {
    // Atribut
    private String nama;
    private String alamat;
    private String nomorTelepon;

    // Konstruktor
    public Penjual(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter dan setter untuk atribut private
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    
    public String getInfoPenjual() {
        return "Nama Penjual: " + nama + "\nAlamat: " + alamat + "\nNomor Telepon: " + nomorTelepon;
    }
}