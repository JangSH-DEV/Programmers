package level1;

// 짝수와 홀수
public class Level1_13 {
	
	public String solution(int num) {
		String answer = "";
		
		if(num%2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_13 answer = new Level1_13();
		
		System.out.println(answer.solution(3));
		System.out.println(answer.solution(4));
	}
}