package Grind75;

public class titleToNumber {
    public int titleToNumbers(String columnTitle) {
        int total =0 ;
        char[] titles = columnTitle.toCharArray();
        for (int i = titles.length-1; i > 0  ; i--) {
            int power = (titles.length-1) - i ;
            total += Math.pow(26,power) * (titles[i] - 'A'+1);
        }
        return total;
    }
}
