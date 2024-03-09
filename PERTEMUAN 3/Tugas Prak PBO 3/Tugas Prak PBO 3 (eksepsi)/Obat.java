public class Obat {
        private String nama;
        private boolean tersedia;
        
        public Obat(String nama) {
            this.nama = nama;
            tersedia = true;
        }
        public Obat(String string, boolean b) {
            //TODO Auto-generated constructor stub
        }
        public String getNama() {
            return nama;
        }
        public boolean isTersedia() {
            return tersedia;
        }
        public void setTersedia(boolean tersedia) {
            this.tersedia = tersedia;
        }
}
