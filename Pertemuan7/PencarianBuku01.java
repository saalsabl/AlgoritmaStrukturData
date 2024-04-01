public class PencarianBuku01 {
   //Percobaan1 
    Buku01 listBk[] = new Buku01[5];
        int idx;

        void tambah(Buku01 m) {
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        void tampil() {
            for (Buku01 m : listBk) {
                m.tampilDataBuku();
            }
        }

        public int FindSeqSearch(int cari) {
            int posisi = -1;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku == cari) {
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        public void Tampilpoisisi(int x, int pos) {
            if (pos != -1) {
                System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
            } else {
                System.out.println("Data " + x + " tidak ditemukan");
            }
        }

        public void TampilData(int x, int pos){
            if (pos != -1){
                System.out.println("Kode Buku\t     : " + x);
                System.out.println("Judul\t         : " + listBk[pos].judulBuku);
                System.out.println("Tahun Terbit\t  : " + listBk[pos].tahunTerbit);
                System.out.println("Pengarang\t     : " + listBk[pos].pengarang);
                System.out.println("Stock\t         : " + listBk[pos].stock);
            } else {
                System.out.println("Data " + x + "tidak ditemukan");
            }
        }

        //Percobaan 2
        public int FindBinarySearch(int cari, int left, int right){
            if (right >= left){
                int mid = left + (right - left) / 2;
                if (listBk[mid].kodeBuku == cari){
                    return mid;
                } if (listBk[mid].kodeBuku > cari){
                    return FindBinarySearch(cari, left, mid - 1);
                } else {
                    return FindBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }
}
