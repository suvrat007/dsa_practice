package Grind75;

public class convertToTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while (columnNumber!=0){
            char c = (char) ((columnNumber-1)%26 + 'A');
            str.append(c);
            columnNumber=(columnNumber-1)/26;
        }
        return str.reverse().toString();

    }
}
