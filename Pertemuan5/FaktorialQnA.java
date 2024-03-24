public class FaktorialQnA {
    public int FaktorialBF (int n){
        int fakto = 1;
        int i = 1;

        do{
            fakto = fakto * i;
            i++;
        } while (i <= n);

        return fakto;
    }
    
    
}
