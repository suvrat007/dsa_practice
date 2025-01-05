package practise;

public class subset {
    public static void main(String[] args) {
//        prmtations("","abc");

    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        if (ch=='a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skips(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch=='a'){
            return skips(up.substring(1));
        }else{
            return ch + skips(up.substring(1));
        }
    }

    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }



        if (up.startsWith("apple")){
            return skipapple(up.substring(5));
        }else{
            return up.charAt(0)+skipapple(up.substring(1));
        }
    }

    static void sub(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);

        sub(p,up.substring(1));
        sub(p+ch, up.substring(1));
    }
    static void subascii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);

        subascii(p,up.substring(1));
        subascii(p+ch, up.substring(1));
        subascii(p+ (ch+0), up.substring(1));

    }



}
