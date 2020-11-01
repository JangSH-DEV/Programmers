package level1;

// 두 정수 사이의 합
public class Level1_04 {
	
	public long solution(int a, int b) {
        long answer = 0;
        
        // a와 b가 같은 경우는 둘 중 아무 수나 리턴
        if(a==b) {
        	return a;
        }
        
        if(a>b) { // a보다 b가 작을경우
        	for(int i=b; i<=a; i++) {
        		answer += i;
        	}
        } else { // a보다 b가 클 경우
        	for(int i=a; i<=b; i++) {
        		answer += i;
        	}
        }
        
        return answer;
	}
	
	public static void main(String[] args) {
		Level1_04 answer = new Level1_04();
		System.out.println(answer.solution(3, 5));
		System.out.println(answer.solution(3, 3));
		System.out.println(answer.solution(5, 3));
	}
}