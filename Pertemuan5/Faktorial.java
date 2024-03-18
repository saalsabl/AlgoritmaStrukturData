public class Faktorial {
    public int nilai;
    int FaktorialBF(int n){
        int fakto = 1;
        for(int i = 1; i <= n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }
    int FaktorialDC(int n){
        if(n==1){
            return 1;
        }
        else {
            int fakto = n * FaktorialDC(n-1);
            return fakto;
        }
    } 
}
