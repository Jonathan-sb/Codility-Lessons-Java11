//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson4_countingElements;

public class FrogRiverLeaves {
    public FrogRiverLeaves() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{1};
        System.out.println(solution(2, a));
    }

    public static int sumCon(int x) {
        int half;
        if (x % 2 == 0) {
            half = x / 2;
            return x * half + half;
        } else {
            half = x / 2 + 1;
            return x * half;
        }
    }

    public static int solution(int X, int[] A) {
        int len = A.length;
        int sumStepCounter = 0;
        int[] steps = new int[X + 1];

        for(int i = 0; i < len; ++i) {
            if (A[i] <= X && steps[A[i]] == 0) {
                steps[A[i]] = 1;
                ++sumStepCounter;
            }

            if (sumStepCounter == X) {
                return i;
            }
        }

        return -1;
    }
}
