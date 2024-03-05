public class Main {
    public static void main(String[] args) {
        // Membuat objek Penjual
        Penjual penjual1 = new Penjual("John Doe", "Jalan Raya 123", "081234567890");

        // Membuat objek Produk dengan menggunakan objek Penjual
        Produk produk1 = new Produk("John Doe", "Jalan Raya 123", "081234567890",
                "Laptop", 1500.0, 10, "Laptop dengan spesifikasi tinggi");

        // Menampilkan informasi penjual
        System.out.println("Informasi Penjual:");
        System.out.println(penjual1.getInfoPenjual());
        System.out.println();

        // Menampilkan informasi produk, termasuk informasi penjual
        System.out.println("Informasi Produk:");
        System.out.println(produk1.getInfoProduk());
    }
}
