public class Mahasiswa {
    public String nama;
    public int NIM;
    public char gender;
    public double IPK;

    double hitungrataRata(Mahasiswa[]mahasiswa){
        double total = 0;
        for (int i = 0; i < 3; i++){
            total += mahasiswa[i].IPK;
        }
        return total / 3;      
    }
    double cariIPKTerbesar (Mahasiswa[]mahasiswa){
        double besar = mahasiswa[0].IPK;
        for (int i = 0; i < 3; i++){
            if (mahasiswa[i].IPK > besar){
                besar = mahasiswa[i].IPK;
            }
        }
        return besar;
    }
    void tampilData(Mahasiswa[]mahasiswa){
        System.out.println("\n");
        for (int i = 0; i < 3; i++){
            System.out.println("----------------------------------------");
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("Nama : "+ mahasiswa[i].nama +"\nNIM : "+ mahasiswa[i].NIM +"\nJenis kelamin : "+ mahasiswa[i].gender + "\nNilai IPK : "+ mahasiswa[i].IPK);

        }
    }
}

