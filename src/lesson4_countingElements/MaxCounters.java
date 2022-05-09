//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson4_countingElements;

public class MaxCounters {
    public MaxCounters() {
    }

    public static void main(String[] args) {
        int i = 0;
        int[] b = new int[]{3, 2};
        int r = b[i] - 1;
        System.out.println(r);
        int[] a = new int[5];
        a = solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        int[] var8 = a;
        int var7 = a.length;

        for(int var6 = 0; var6 < var7; ++var6) {
            int v = var8[var6];
            System.out.print(v);
        }

    }

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currMax = 0;
        int currMin = 0;

        int i;
        for(i = 0; i < A.length; ++i) {
            if (A[i] <= N) {
                counters[A[i] - 1] = Math.max(currMin, counters[A[i] - 1]);
                ++counters[A[i] - 1];
                currMax = Math.max(currMax, counters[A[i] - 1]);
            } else if (A[i] == N + 1) {
                currMin = currMax;
            }
        }

        for(i = 0; i < counters.length; ++i) {
            counters[i] = Math.max(counters[i], currMin);
        }

        return counters;
    }
}
 