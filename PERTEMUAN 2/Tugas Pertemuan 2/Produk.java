public class Produk extends Penjual{
    // Atribut tambahan pada kelas Produk
    private String namaProduk;
    private double harga;
    private int stok;
    private String deskripsi;

    // Konstruktor
    public Produk(String namaPenjual, String alamatPenjual, String nomorTeleponPenjual,
                  String namaProduk, double harga, int stok, String deskripsi) {
        super(namaPenjual, alamatPenjual, nomorTeleponPenjual); // Memanggil konstruktor kelas induk
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
    }

    // Getter dan setter untuk atribut private pada kelas Produk
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Metode untuk mendapatkan informasi produk
    public String getInfoProduk() {
        return "Nama Produk: " + namaProduk + "\nHarga: " + harga + "\nStok: " + stok + "\nDeskripsi: " + deskripsi
                + "\n\n" + getInfoPenjual();
    }
}