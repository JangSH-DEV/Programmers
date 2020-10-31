package level1;

// 가운데 글자 가져오기
public class Level1_03 {
	
	public String solution(String s) {
        String answer = "";
        int sLength = s.length();
        
        if(sLength % 2 == 0) {
        	answer = s.substring(sLength/2-1, sLength/2+1);
        } else {
        	answer = s.substring(sLength/2, sLength/2+1);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_03 answer = new Level1_03();
		System.out.println(answer.solution("abcde"));
		System.out.println(answer.solution("qwer"));
	}
}