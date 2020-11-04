package level1;

import java.util.*;

// 같은 숫자는 싫어
public class Level1_07 {

	public int[] solution(int[] arr) {
		int arrLength = arr.length;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// i번째와 i+1번째가 같지 않은 경우 arrayList에 추가
		for(int i=0; i<arrLength-1; i++) {
			if(arr[i] != arr[i+1]) {
				arrayList.add(arr[i]);
			}
		}
		
		// arr배열의 마지막 값 추가
		arrayList.add(arr[arrLength-1]);
		
		// arrayList의 길이만큼 answer 배열 생성
		int[] answer = new int[arrayList.size()];
		int arrayListSize = arrayList.size();
		
		// arrayListSize만큼 반복하며 answer변수에 int형으로 저장
		for(int i=0; i<arrayListSize; i++) {
			answer[i] = arrayList.get(i).intValue();
		}
		
        return answer;
	}
	
	public static void main(String[] args) {
		Level1_07 answer = new Level1_07();
		
		int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
		int[] arr2 = {4, 4, 4, 3, 3};
		
		System.out.println(Arrays.toString(answer.solution(arr1)));
		System.out.println(Arrays.toString(answer.solution(arr2)));
	}
}