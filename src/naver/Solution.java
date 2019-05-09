package naver;

public class Solution {
		static int[][] showDice =  new int [7][7];
	
	public int solution (int[] A ) {
		int resultOfDice = 0, current = 0;

		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				current = checkDice(A[i], A);
				resultOfDice = current;
			}
			else {
				if (current > checkDice(A[i], A)) {
					resultOfDice = current;
				}
			}
		}
		return resultOfDice;
	}
	
	public int checkDice(int num, int[] A) {
		int match = 0;
		for(int i = 0; i < A.length; i++) {
			match += showDice[A[i]][num];
		}
		return match;
	}
	private static void initM() {
		for(int i = 1; i < 7; i++) {
			for (int j = 1; j <7; j++) {
				showDice[i][j] = 1;
			}
		}
		showDice[1][1] = 0;
		showDice[2][2] = 0;
		showDice[3][3] = 0;
		showDice[4][4] = 0;
		showDice[5][5] = 0;
		showDice[6][6] = 0;
		
		showDice[1][6] = 2;
		showDice[2][5] = 2;
		showDice[3][4] = 2;
		showDice[4][3] = 2;
		showDice[5][2] = 2;
		showDice[6][1] = 2;
	}
	public static void main(String args[]){
		initM();
		Solution sol = new Solution();
		int [] A = {1,1,6,6,2,4}; 
		System.out.println(sol.solution(A));
	}
}
