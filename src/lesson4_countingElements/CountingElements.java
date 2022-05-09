

package lesson4_countingElements;

public class CountingElements {
    public CountingElements() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 0, 1, 0, 2, 1};
        a = counting(a, 2);
        int[] var5 = a;
        int var4 = a.length;

        for(int var3 = 0; var3 < var4; ++var3) {
            int i = var5[var3];
            System.out.println(i);
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
