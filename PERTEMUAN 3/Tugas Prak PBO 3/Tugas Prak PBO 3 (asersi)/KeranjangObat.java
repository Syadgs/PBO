public class KeranjangObat {
    private String[] keranjang;
    private int count;
    //private static final int MAX_SIZE = 15;

    public KeranjangObat(){
        keranjang = new String[15];
        count = 0;
    }

    /**
     * @param Obat
     */
    public void tambahObat(String Obat){
        assert(count < 15) : "Jumlah Obat Melampaui Batas";
        keranjang [count] = Obat;
        count++;
    }

    public void tampilkanObat(){
        for (int i = 0; i < keranjang.length; i++){
            System.out.println(keranjang[i]);
        }
    }
}
