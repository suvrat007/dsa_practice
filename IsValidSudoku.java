package Grind75;

import java.util.HashMap;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> map = new HashMap<>();
        // loop for rows
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                if (value == '.') {
                    continue;
                }
                if (map.containsKey(value)) {
                    return false;
                }

                map.put(value, 1);
            }
            map.clear();
        }
        // loop for cols
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[col][row];
                if (value == '.') {
                    continue;
                }
                if (map.containsKey(value)) {
                    return false;
                }
                map.put(value, 1);
            }
            map.clear();
        }
        // loop for boxes
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {

                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {
                        char value = board[row][col];
                        if (value == '.') {
                            continue;
                        }
                        if (map.containsKey(value)) {
                            return false;
                        }
                        map.put(value,1);
                    }
                }
                map.clear();
            }
        }

        return true;
    }
}
