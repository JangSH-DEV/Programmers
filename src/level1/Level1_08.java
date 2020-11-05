package level1;

// 수박수박수박수박수박수?
public class Level1_08 {

	public String solution(int n) {
		String answer = "";
		
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_08 answer = new Level1_08();
		
		System.out.println(answer.solution(3));
		System.out.println(answer.solution(4));
	}
}