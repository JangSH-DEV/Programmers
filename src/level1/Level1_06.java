package level1;

// 서울에서 김서방 찾기
public class Level1_06 {
	
	public String solution(String[] seoul) {
		String answer = "";
		int seoulLength = seoul.length;
		
		for(int i=0; i<seoulLength; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_06 answer = new Level1_06();
		String[] names = {"Jane", "Kim"};
		System.out.println(answer.solution(names));
	}
}