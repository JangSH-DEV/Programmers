package level1;

import java.util.Arrays;

// 제일 작은 수 제거하기
public class Level1_20 {

	public int[] solution(int[] arr) {
		int arrLength = arr.length;
		int cnt = 0;

		if(arrLength == 1) {
			int[] answer = { -1 };
			return answer;
		}

		// 최솟값 구하기
		int min = arr[0];

		for(int i = 0; i < arrLength; i++) {
			min = Math.min(min, arr[i]);
		}

		int[] answer = new int[arrLength - 1];

		for(int i = 0; i < arrLength; i++) {
			// 최솟값은 넣지 않고 진행
			if(arr[i] == min) {
				continue;
			}
			answer[cnt++] = arr[i];
		}

		return answer;
    }
	
	public static void main(String[] args) {
		Level1_20 answer = new Level1_20();
		int[] arr1 = {4, 3, 2, 1};
		int[] arr2 = {10};
		
		System.out.println(Arrays.toString(answer.solution(arr1)));
		System.out.println(Arrays.toString(answer.solution(arr2)));
	}
}