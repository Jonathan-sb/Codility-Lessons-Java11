//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson4_countingElements;

import java.util.Arrays;

public class MissingPositiveInt {
    public MissingPositiveInt() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1, -3};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        int len = A.length;
        int v = 0;
        int j = 0;
        Arrays.sort(A);

        for(int i = 0; i < len; ++i) {
            v = A[i];
            if (v > 0) {
                if (i == 0 || v != A[i - 1]) {
                    ++j;
                }

                if (v != j) {
                    return j;
                }
            }
        }

        return j + 1;
    }
}
