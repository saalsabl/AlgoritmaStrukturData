public class Segitiga {
    public int alas;
    public int tinggi;
    public double miring;

    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    double hitungLuas(){
        return alas*tinggi/2;
    }
    double hitungSisiMiring(){
        miring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return miring;
    }
    double hitungKeliling(){
        return alas+tinggi+miring;
    }
}
