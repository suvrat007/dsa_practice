package Grind75;

public class TitleToNumber {
//    public int titleToNumbers(String columnTitle) {
//        int total =0 ;
//        char[] titles = columnTitle.toCharArray();
//        for (int i = titles.length-1; i > 0  ; i--) {
//            int power = (titles.length-1) - i ;
//            total += Math.pow(26,power) * (titles[i] - 'A'+1);
//        }
//        return total;
//    }
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
    }

    public static int titleToNumber(String columnTitle) {
        char[] cols = columnTitle.toCharArray();
        int totalAlphabets = cols.length;
        int columnNumber = 0;
        for (int i = 0; i<totalAlphabets ; i++){
            int asciiValue = cols[i] - '@';
            columnNumber= columnNumber*26 + asciiValue;
        }
        return columnNumber;
    }
}
