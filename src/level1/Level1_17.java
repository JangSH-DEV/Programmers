package level1;

// 콜라츠 추측
public class Level1_17 {

	public int solution(int num) {
		int answer = 0;
		
		while(num != 1) {
			if(answer >= 500) {
				return -1;
			}
			
			if(num%2 == 0) {
				num /= 2;
			} else if(num%2 == 1) {
				num = num * 3 + 1;
			}
			
			answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_17 answer = new Level1_17();
		System.out.println(answer.solution(6));
		System.out.println(answer.solution(16));
		System.out.println(answer.solution(626331));
	}
}