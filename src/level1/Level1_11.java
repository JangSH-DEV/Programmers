package level1;

// 문자열 다루기 기본
public class Level1_11 {
	
	public boolean solution(String s) {
		boolean answer = false;
		int sLength = s.length();
		int cnt = 0;
		
		if(sLength == 4 || sLength == 6) {
			for(int i=0; i<sLength; i++) {
				if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
					cnt++;
				}
			}
			if(cnt == sLength) {
				answer = true;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_11 answer = new Level1_11();
		
		System.out.println(answer.solution("a234"));
		System.out.println(answer.solution("1234"));
	}
}