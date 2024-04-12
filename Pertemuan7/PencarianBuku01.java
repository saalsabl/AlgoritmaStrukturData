public class PencarianBuku01 {
    //Percobaan1 
    Buku01 listBk[] = new Buku01[5];
        int idx;
        
        void tambah(Buku01 m){
            if (idx < listBk.length){
                listBk[idx] = m;
                 idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

    void tampil() {
        for (Buku01 m : listBk){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
            if (listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos){
    if (pos != -1){
        System.out.println("Data : "+ x + " ditemukan pada indeks " + pos);
    } else {
        System.out.println("Data "+ x + " tidak ditemukan");
    }
}

    public void TampilData(String x, int pos){
        if(pos!= -1){
            System.out.println("Kode Buku\t     : " + x );
            System.out.println("Judul\t         : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t  : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t     : " + listBk[pos].pengarang);
            System.out.println("Stock\t         : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public Buku01 FindBuku(String cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                return listBk[j];
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].kodeBuku.equals(cari)) {
                return mid;
        } if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
            return FindBinarySearch(cari, left, mid - 1); 
        } else {
            return FindBinarySearch(cari, mid + 1, right); 
        }
        }
        return -1; 
    }
}