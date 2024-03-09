public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas Pembeli dan Obat
        Pembeli pembeli = new Pembeli("Nama Pembeli");
        Obat obat1 = new Obat("Paracetamol", true);
        Obat obat2 = new Obat("Bodrex", true);
    
        try {
            // Pembelian obat yang tersedia
            pembeli.beliObat(obat1);
    
            // Pembelian obat yang tersedia lagi
            pembeli.beliObat(obat2);
    
            // Pembelian obat ketika keranjang sudah penuh
            for (int i = 0; i < 5; i++) {
                Obat obat = new Obat("Obat " + (i + 3), true);
                pembeli.beliObat(obat);
            }
    
            // Pembelian obat yang tidak tersedia
            Obat obatTidakTersedia = new Obat("Obat Tidak Tersedia", false);
            pembeli.beliObat(obatTidakTersedia);
        } catch (BatasObatPenuhException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (ObatTidakTersediaException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    
}
