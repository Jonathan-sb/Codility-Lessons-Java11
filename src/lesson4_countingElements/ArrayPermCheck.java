//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson4_countingElements;

import java.util.Arrays;

public class ArrayPermCheck {
    public ArrayPermCheck() {
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 1, 3}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int len = A.length;

        for(int i = 0; i < len; ++i) {
            if (A[i] != i + 1) {
                return 0;
            }
        }

        return 1;
    }
}
