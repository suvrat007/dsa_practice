package Grind75;

public class CheckRecord {
//    public boolean checkRecord(String s) {
//        boolean con1 = false;
//        boolean con2 = false;
//
//        int Acount = 0;
//        int contLCount = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='A') {
//                Acount++;
//                if (!con2){
//                    contLCount=0;
//                }
//            }
//            if (s.charAt(i)=='L'){
//                contLCount++;
//                if (contLCount >= 3) {
//                    con2 = true;
//                }
//            }else {
//                contLCount=0;
//            }
//        }
//        if (Acount< 2) con1=true;
//
//        return con1 && !con2;
//    }
    public boolean checkRecord(String s) {
        int countA =0 , countL =0;

        for (char ch : s.toCharArray()){
            if (ch!='L') countL=0;
            if (ch=='L') countL++;
            if (ch=='A') countA++;
            if (countA==2 || countL==3) return false;
        }
        return true;
    }
}
