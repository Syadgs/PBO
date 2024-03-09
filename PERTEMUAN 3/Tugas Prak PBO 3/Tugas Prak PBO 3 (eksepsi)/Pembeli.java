public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;
    
    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }

    public String getNama() {
        return nama;
    }
        
    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }
    public int getJumlahObat() {
        return jumlahObat;
    }
    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        try {
            // Cek apakah jumlah obat sudah mencapai batas
            if (jumlahObat < keranjangObat.length) {
                // Cek apakah obat tersedia
                if (obat.isTersedia()) {
                    obat.setTersedia(false);
                    keranjangObat[jumlahObat] = obat;
                    jumlahObat++;
                } else {
                    throw new ObatTidakTersediaException("Obat tidak tersedia");
                }
            } else {
                throw new BatasObatPenuhException("Batas obat penuh, tidak dapat menambah obat lagi");
            }
        } catch (BatasObatPenuhException e) {
            System.out.println(e.getMessage());
        } catch (ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}