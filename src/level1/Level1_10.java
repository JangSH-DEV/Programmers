package level1;

// 문자열을 정수로 바꾸기
public class Level1_10 {
	
	public int solution(String s) {
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		Level1_10 answer = new Level1_10();
		
		System.out.println(answer.solution("+1234"));
		System.out.println(answer.solution("-1234"));
	}
}