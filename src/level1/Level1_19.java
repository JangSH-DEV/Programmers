package level1;

// 하샤드 수
public class Level1_19 {
	public boolean solution(int x) {
		boolean answer = false;
		
		String[] temp = String.valueOf(x).split("");
		
		int tempLength = temp.length;
		int sum = 0;
		
		for(int i=0; i<tempLength; i++) {
			sum += Integer.parseInt(temp[i]);
		}

		if (x % sum == 0) {
			answer = true;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Level1_19 answer = new Level1_19();
		
		System.out.println(answer.solution(10));
		System.out.println(answer.solution(11));
		System.out.println(answer.solution(12));
		System.out.println(answer.solution(13));
	}
}