import javax.swing.*;
import java.util.*;

public class ourProject {
    public static void main(String[] args) {
        Ships ship1 = new Ships();
        Ships ship2 = new Ships();
        Random rand = new Random();


        ship1.setShip1cell();
        ship1.setShip1cell();
        ship1.setShip1cell();
        ship1.setShip1cell();

        ship1.setShip2cell();
        ship1.setShip2cell();
        ship1.setShip2cell();

        ship1.setShip3cell();
        ship1.setShip3cell();

        ship1.setShip4cell();

    }
}
class Ships{
    Random rand = new Random();
    int[] Ship4cell;
    int[] Ship3cell;
    int[] Ship2cell;
    int[] Ship1cell;


    public void setShip1cell(int ship1cell){
        for (int i=0;i<4;i++){
            if (Ship1cell[i] == 0){
               this.Ship1cell[i] = ship1cell;
               rand.changeRandom();
               break;
            }
        }
    }

    public void setShip2cell(int ship2cell) {
        for (int i=0;i<3;i++){
            if (Ship2cell[i] == 0){
                this.Ship2cell[i] = ship2cell;
                rand.changeRandom();
                break;
            }
        }
    }

    public void setShip3cell(int ship3cell) {
        for (int i=0;i<2;i++){
            if (Ship3cell[i] == 0){
                this.Ship3cell[i] = ship3cell;
                rand.changeRandom();
                break;
            }
        }
    }

    public void setShip4cell(int ship4cell) {
        for (int i=0;i<1;i++){
            if (Ship4cell[i] == 0){
                this.Ship4cell[i] = ship4cell;
                rand.changeRandom();
                break;
            }
        }
    }
}

class Interface{

}

class Random extends Ships{
    int random = (int)(Math.random()*100) + 1;
    int[] usedRandoms;

    public int[] changeRandom(){
        for (int i=0;i<100;i++) {
            if (usedRandoms[i] == 0) {
                usedRandoms[i] = random;
                this.random = (int) (Math.random() * 100) + 1;
                for (int j = 0; j < 100; j++) {

                }
                return usedRandoms;
            } else {
                return usedRandoms;
            }
        }
    }
}
