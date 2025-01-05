package Revision.RecursionRev;

public class RemovingAlphabets {
    public static void main(String[] args) {
        System.out.println(removeApple("bacapplecad"));
    }
    static void removeApha(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            removeApha(p , up.substring(1));
        }else {
            removeApha(p+ch,up.substring(1));
        }
    }

    static String removeApple(String p){
        if (p.isEmpty()){
            return " ";
        }

        if (p.startsWith("apple")){
            return removeApple(p.substring(5));
        }else {
            return p.charAt(0)+removeApple(p.substring(1));
        }
    }
}
