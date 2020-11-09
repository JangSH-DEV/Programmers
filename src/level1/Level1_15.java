package level1;

import java.util.*;

// 나누어 떨어지는 숫자 배열
public class Level1_15 {
	
	public int[] solution(int[] arr, int divisor) {
		int arrLength = arr.length;
		List<Integer> list = new ArrayList<Integer>();
		
		Arrays.sort(arr);
		
		for(int i=0; i<arrLength; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		// list가 비어있으면 list에 -1추가
		if(list.isEmpty()) {
			list.add(-1);
		}
		
		int listSize = list.size();
		int[] answer = new int[listSize];
		
		for(int i=0; i<listSize; i++) {
			answer[i] = list.get(i).intValue();
		}
		
		return answer;
    }
	
	public static void main(String[] args) {
		Level1_15 answer = new Level1_15();
		
		int[] arr1 = {5, 9, 7, 10};
		int[] arr2 = {2, 36, 1, 3};
		int[] arr3 = {3, 2, 6};
		
		System.out.println(Arrays.toString(answer.solution(arr1, 5)));
		System.out.println(Arrays.toString(answer.solution(arr2, 1)));
		System.out.println(Arrays.toString(answer.solution(arr3, 10)));
	}
}