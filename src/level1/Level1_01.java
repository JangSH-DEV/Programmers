package level1;

import java.util.HashMap;
import java.util.Map;

public class Level1_01 {

	// 완주하지 못한 선수
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        // key에 player이름 : value에 1을 먼저 넣고 참여한 인원에 value를 -1를 해준다.
        for(String player : participant) map.put(player, 1);
        for(String player : completion) map.put(player, map.get(player) - 1);
        
        // key값을 get()에 넣어 0이 아니면 key값으로 저장
        // => 값 0이 완주한 인원들
        // => 값 1이 참여하여 완주하지 못한 인원들
        for(String key : map.keySet()) {
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        
//        int completion_length = completion.length;
//        
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        
//        for(int i=0; i<completion_length; i++) {
//        	if( participant[i].equals(completion[i]) ) {
//        		answer = participant[i+1];
//        	} else {
//        		break;
//        	}
//        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println( solution(participant, completion) );
	}
	
}