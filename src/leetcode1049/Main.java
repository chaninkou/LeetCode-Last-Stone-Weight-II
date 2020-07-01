package leetcode1049;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] stones = {2,7,4,1,8,1};
		
		System.out.println("Stones: " + Arrays.toString(stones));
		
		FindLastStoneWeight solution = new FindLastStoneWeight();
		
		System.out.println("Solution: " + solution.lastStoneWeight(stones));
	}
}
