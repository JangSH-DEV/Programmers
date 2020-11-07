package level1;

// 핸드폰 번호 가리기
public class Level1_12 {

	public String solution(String phone_number) {
		String answer = "";
		int phoneLength = phone_number.length();
		
		for(int i=0; i<phoneLength-4; i++) {
			answer += "*";
		}
		
		answer += phone_number.substring(phoneLength-4, phoneLength);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_12 answer = new Level1_12();
		
		System.out.println(answer.solution("01033334444"));
		System.out.println(answer.solution("027778888"));
	}
}