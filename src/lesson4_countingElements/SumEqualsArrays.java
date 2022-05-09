//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson4_countingElements;

import java.util.Arrays;

public class SumEqualsArrays {
    public SumEqualsArrays() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{0, 1, 2};
        System.out.println(fast_solution(a, b, 3));
    }

    public static boolean slow_sol(int[] a, int[] b, int m) {
        int n = a.length;
        int sum_a = Arrays.stream(a).sum();
        int sum_b = Arrays.stream(b).sum();

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                int change = b[j] - a[i];
                sum_a += change;
                sum_b -= change;
                if (sum_a == sum_b) {
                    return true;
                }

                sum_a += change;
                sum_b -= change;
            }
        }

        return false;
    }

    public static boolean fast_solution(int[] a, int[] b, int m) {
        int n = a.length;
        int sum_a = Arrays.stream(a).sum();
        int sum_b = Arrays.stream(b).sum();
        int d = sum_b - sum_a;
        d %= 2;
        if (d != 1 && d != -1) {
            d /= 2;
            int[] count = counting(a, m);

            for(int i = 0; i < n; ++i) {
                if (b[i] - d >= 0 && b[i] - d <= m && count[b[i] - d] > 0) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public static int[] counting(int[] A, int m) {
        int n = A.length;
        int[] count = new int[m + 1];

        for(int i = 0; i < n; ++i) {
            ++count[A[i]];
        }

        return count;
    }
}
