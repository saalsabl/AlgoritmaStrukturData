import java.util.Scanner;
public class Dragon01{

    int x, y, width, height;

    void moveLeft(){
        x--;
    }

    void moveRight(){
        x++;
    }

    void moveUp(){
        y++;
    }

    void moveDown(){
        y--;
    }

    void detectCollision(int x, int y){
        if ((x < 0 || x > width) || (y < 0 || y > height)){
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }
    void printPosition(){
        System.out.println(x+","+y);
    }
}

