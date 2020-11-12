package level1;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자
public class Level1_18 {

	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = x;
		
		for(int i=0; i<n; i++) {
			answer[i] = num;
			num += x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_18 answer = new Level1_18();
		System.out.println(Arrays.toString(answer.solution(2, 5)));
		System.out.println(Arrays.toString(answer.solution(4, 3)));
		System.out.println(Arrays.toString(answer.solution(-4, 2)));
	}
}