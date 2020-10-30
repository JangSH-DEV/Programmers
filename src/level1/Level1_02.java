package level1;

// 문자열 내 p와 y의 개수
public class Level1_02 {
	
	static boolean solution(String s) {
        boolean answer = true;
        int sLength = s.length();
        int str = 0;
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i=0; i<sLength; i++) {
        	str = s.charAt(i);
        	if(str==80 || str == 112) {
        		pCnt++;
        	} else if(str==89 || str==121) {
        		yCnt++;
        	}
        }
        
        if(!(pCnt==yCnt)) {
        	answer = false;
        }

        return answer;
    }
	
	public static void main(String args[]) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
}