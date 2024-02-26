import java.util.Scanner;
public class DragonMain01 {
    public static void main(String[] args) {
        Dragon01 dg1 = new Dragon01();
        dg1.width = 20;
        dg1. height = 20;
        dg1.x = 15;
        dg1.y = 15;
        
        for(int i = 0; i < 20; i++){
            dg1.printPosition();
            dg1.detectCollision(dg1.x, dg1.y);
            dg1.moveDown();
        }
    }
}
