//Main class
package P;
import P1.*;
import P2.*;
public class Momos {
    public static void main(String[] args) {
        TwoDim ref;
        ref = new TwoDim(1, 2);
        System.out.println(ref);
        ref = new ThreeDim(3, 4, 5);
        System.out.println(ref);
    }
}