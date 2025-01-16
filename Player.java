package CardApp1;

public class Player {
    Card turn(Card[] c){//Cardクラスの配列を受け取る
        int rnd = (int)(Math.random()*c.length);
        return c[rnd];//Cardクラスのインスタンスを返す
    }
}