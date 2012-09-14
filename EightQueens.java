package interview;

import java.util.HashMap;


//this is my own impl

public class EightQueens {
    static int B_SIZE = 8;
    static int count = 0;

    // There are 92 solutions, 12 unique
    static void eightQueens(int row, HashMap<Integer, Integer> queens) {
	if (row == B_SIZE) {
	    System.out.print("Solution " + ++count);
	    for (Integer i : queens.keySet()) {
		System.out.print("[" + i + " = " + queens.get(i) + "]");
	    }
	    System.out.println("");
	    // System.exit(0); if you want just one soln
	} else {
	    for (int col = 0; col < B_SIZE; col++) {
		if (validSpace(queens, row, col)) {
		    queens.put(row, col);
		    eightQueens(row + 1, queens);
		}
	    }
	}
    }

    private static boolean validSpace(HashMap<Integer, Integer> map, int row,
	    int col) {
	for (int row2 = 0; row2 < row; row2++) {
	    if (map.get(row2) == col
		    || (Math.abs(map.get(row2) - col) == (row - row2))) {
		return false;
	    }
	}
	return true;
    }

    public static void main(String[] args) {

	eightQueens(0, new HashMap<Integer, Integer>());

    }
}
