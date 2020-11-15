package level1;

// 이상한 문자 만들기
public class Level1_21 {

	public String solution(String s) {
		String answer = "";
		int sLength = s.length();
		String[] data = s.split("");
		int cnt = 0;
		
		for(int i=0; i<sLength; i++) {
			if(data[i].equals(" ")) {
				cnt = 0;
			} else {
				if(cnt%2 == 0) {
					data[i] = data[i].toUpperCase();
					cnt++;
				} else {
					data[i] = data[i].toLowerCase();
					cnt++;
				}
			}
			answer += data[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_21 answer = new Level1_21();
		
		System.out.println(answer.solution("try hello world"));
	}
}