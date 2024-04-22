import java.util.ArrayList;
public class SearchData {
    datauts listDt[] = new datauts[17];
    int idx;

    void tambah(datauts n){
        if (idx < listDt.length){
            listDt[idx] = n;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil(){
        for (datauts n : listDt){
            n.tampilData();
        }
    }

    public int FindSeqSearch(String cari){
        for (int j = 0; j < idx; j++){
            if (listDt[j].data.equals(cari)){
                return j;
            }
        }
        return -1;
    }

    public void Tampilposisi(String x, int pos){
        if (pos != -1){
            System.out.println("Data : "+ x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data "+ x + " tidak ditemukan");
        }
    }
    
    public void tampilData(String x, int pos){
        if(pos != -1){
            System.out.println("");
       }
    }

    public datauts findData(String cari) {
        for (int j = 0; j < idx; j++){
            if (listDt[j].data.equals(cari)){
                return listDt[j];
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari) {
        bubbleSort();
        int left = 0;
        int right = idx - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = listDt[mid].data.equals(cari);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }

    public ArrayList<Integer> FindAllSeqSearch(String cari){
        ArrayList<Integer> positions = new ArrayList<>();
        for (int j = 0; j < idx; j++){
            if (listDt[j].data.equals(cari)){
                positions.add(j);
            }
        }
        return positions;
    }

    public ArrayList<Integer> (String cari){
        ArrayList<Integer> positions = new ArrayList<>();
    }
}