public class Graph01 {
    int vertex;
    DoubleLinkedLists list[];

    public Graph01(int v) {
        vertex = v;
        list = new DoubleLinkedLists[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal,jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' +asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' +asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' +asal) + ": " + (totalIn + totalOut));
        
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
        
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }
    
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isAdjacent(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }

    public void cekEdge(int asal, int tujuan) throws Exception {
        if (isAdjacent(asal, tujuan)) {
            System.out.print("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga\n");
            System.out.println("");
        } else {
            System.out.print("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga\n");
            System.out.println("");
        }
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
        if (isAdjacent(asal, tujuan)) {
            list[asal].updateJarak(tujuan, jarakBaru);
            System.out.println("Jarak dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan) + " telah diperbarui menjadi " + jarakBaru + " m");
        } else {
            System.out.println("Tidak ada jalan langsung dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan));
        }
    }

    public int hitungEdge() {
        int jumlahEdge = 0;
        for (int i = 0; i < vertex; i++) {
            jumlahEdge += list[i].size();
        }
        return jumlahEdge;
    }
}
