package Grind75;

public class ConvertToBase7 {
    public String convertToBase7(int num) {
        if (num == 0 ) return "0";
        StringBuilder sb = new StringBuilder();

        boolean pos = (num<0) ? false: true;
        num = Math.abs(num);

        while(num>0){
            int rem = num%7;
            sb.append(rem);
            num=num/7;
        }

        if (!pos) {
            sb.append('-');
        }

        return sb.reverse().toString();
    }
}
