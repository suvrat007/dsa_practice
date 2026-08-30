package Grind75;

public class ReverseBits {
    public int reverseBits(int n) {
        int res= 0;
        for (int i = 0; i < 32; i++) {
            int num = n&1;
            res <<= 1;
            res |= num;
            n >>>= 1;
        }
        return res;

    }
}
