class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int result = -1;
		int sumBefore = 0, sumAfter = 0;
		// Calculating sum of all elements except first
		for (int i = 1; i < A.length; i++) {
			sumAfter = sumAfter + A[i];
		}
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				if (sumAfter == 0) {
					result = i;
					break;
				}
			}
			if (i == (A.length - 1)) {
				if (sumBefore == 0) {
					result = i;
					break;
				}
			}
			if (sumBefore == sumAfter) {
				result = i;
				break;
			}
			sumBefore = sumBefore + A[i];
			sumAfter = sumAfter - A[i + 1];
		}
		return result;
	}
}