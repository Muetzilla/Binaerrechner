package Main;

import binaer.ToBinaer;
import hex.Hex;

public class Main {
    public Main(){
        ToBinaer tb =  new ToBinaer();
        Hex hex =  new Hex();
        String hexNum = hex.toHex(3984672);
        String binear = tb.tobinaer(1236);

        System.out.println(binear);
        System.out.println(hexNum);
    }
    public static void main(String[] args) {
        new Main();
    }
}
