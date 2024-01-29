
//Maxmum length chain of pairs:-
import java.util.*;

public class Maximum {

    public static void main(String[] args) {
        int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 25 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int ChainLen = 1;
        int ChainEnd = pair[0][1];
        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] > ChainEnd) {
                ChainLen++;
                ChainEnd = pair[i][1];
            }
        }
        System.out.println("Max Length of Chain = " + ChainLen);
    }
}

/*
 * Output:-
 * Max Length of Chain = 3
 */
