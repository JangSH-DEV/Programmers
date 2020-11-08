package level1;

// 평균 구하기
public class Level1_14 {

	public double solution(int[] arr) {
		double answer = 0;
		int arrLength = arr.length;
		
		for(int i=0; i<arrLength; i++) {
			answer += arr[i];
		}
		
		answer /= arrLength;
		
        return answer;
	}
	
	public static void main(String[] args) {
		Level1_14 answer = new Level1_14();
		
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {5, 5};
		
		System.out.println(answer.solution(arr1));
		System.out.println(answer.solution(arr2));
	}
}