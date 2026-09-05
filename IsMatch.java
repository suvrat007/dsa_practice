package Grind75;

public class IsMatch {
    public boolean isMatch(String s, String p) {
        return solve(s,p);
    }

    public boolean solve(String s, String p ){
        if (p.length()==0){
            return (s.length()==0) ;
        }

        boolean firstCharMatched = false;

        if (s.length()>0 && (p.charAt(0)==s.charAt(0) || p.charAt(0)=='.')){
            firstCharMatched=true;
        }

        if (p.length() >= 2 && p.charAt(1)=='*'){
            boolean notTake = solve(s, p.substring(2));
            boolean take = firstCharMatched && solve(s.substring(1),p);
            return take || notTake;
        }

        return firstCharMatched && solve(s.substring(1),p.substring(1));
    }
}
