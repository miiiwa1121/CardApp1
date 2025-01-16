package CardApp1;

public class Game {
    Player p;//Playerクラスのインスタンスを保持
    Card[] c;//Cardクラスの配列を宣言

    Game() {
        p = new Player();//Playerクラスのインスタンスを生成
        c = new Card[52];//Cardクラスの配列を生成
        String[] mark = {"♠", "♦", "♣", "♥"};//マークの配列

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card cd = new Card();//Cardクラスのインスタンスを生成
                cd.mark = mark[i];//markフィールドに代入
                cd.number = j + 1;//numberフィールドに代入
                c[i * 13 + j] = cd;//Cardクラスのインスタンスを配列に代入
            }
        }
    }
    void start() {
        Card cd = p.turn(c);//Playerクラスのturnメソッドを呼び出す
        cd.open();//Cardクラスのopenメソッドを呼び出す
        judge(cd);//judgeメソッドを呼び出す
    }

    void judge(Card c) {
        if (c.number >= 10) {
            System.out.println("Win");
        }
    }
}
