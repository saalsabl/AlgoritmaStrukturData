public class Latihan {
    Latihan[] mobil;
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;

    public Latihan(Latihan[] mobil){
        this.mobil = mobil;
    }
    public Latihan(String merk, String tipe, int tahun, int top_acceleration, int top_power){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }
    public int findMaxAcceleration() {
        return findMaxAcceleration(0, mobil.length - 1);
    }
    private int findMaxAcceleration(int left, int right) {
        if (left == right) {
            return mobil[left].top_acceleration;
        }
        
        int mid = (left + right) / 2;
        int maxLeft = findMaxAcceleration(left, mid);
        int maxRight = findMaxAcceleration(mid + 1, right);
        
        return Math.max(maxLeft, maxRight);
    }
    public int findMinAcceleration() {
        return findMinAcceleration(0, mobil.length - 1);
    }
    private int findMinAcceleration(int left, int right) {
        if (left == right) {
            return mobil[left].top_acceleration;
        }
        
        int mid = (left + right) / 2;
        int minLeft = findMinAcceleration(left, mid);
        int minRight = findMinAcceleration(mid + 1, right);
        
        return Math.min(minLeft, minRight);
    }
    public double calculateAveragePower() {
        double totalPower = 0;
        for (Latihan mobil : mobil) {
            totalPower += mobil.top_power;
        }
        return totalPower / mobil.length;
    }
}

