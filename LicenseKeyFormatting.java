package Grind75;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("--a-a-a-a--",2));
    }
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = s.length()-1; i >= 0 ; i--) {
            char ch = Character.toUpperCase(s.charAt(i));
            if (ch=='-') continue;
            if (count==k){
                sb.append('-');
                count=0;

            }
            sb.append(ch);
            count++;
        }

        return sb.reverse().toString();
    }
}
