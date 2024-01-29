
//Mimum sum absolute diff pairs:-
import java.util.*;

public class Minmum {

    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };
        Arrays.sort(A);
        Arrays.sort(B);
        int MidDiff = 0;
        for (int i = 0; i < A.length; i++) {
            MidDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println(MidDiff);
    }
}

/*
 * Output:-
 * 0
 */
