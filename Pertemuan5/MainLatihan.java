public class MainLatihan {
    public static void main(String[] args) {
        Latihan[] mobil = {
            new Latihan("BMW", "M2 Coupe", 2016, 6816, 728),
            new Latihan("Ford", "Fiesta ST", 2014, 3921, 575),
            new Latihan("Nissan", "370Z", 2009, 4360, 657),
            new Latihan("Subaru", "BRZ", 2014, 4058, 609),
            new Latihan("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Latihan("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Latihan("Toyota", "86/GT86", 2014, 4180, 609),
            new Latihan("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Latihan latihan = new Latihan(mobil);

        int maxAcceleration = latihan.findMaxAcceleration();
        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);

        int minAcceleration = latihan.findMinAcceleration();
        System.out.println("Top Acceleration Terendah: " + minAcceleration);

        double averagePower = latihan.calculateAveragePower();
        System.out.println("Rata-rata Top Power: " + averagePower);
    }
    
}
