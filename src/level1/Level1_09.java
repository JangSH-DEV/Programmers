package level1;

import java.util.Arrays;

// 문자열 내 마음대로 정렬하기
public class Level1_09 {
	
	public String[] solution(String[] strings, int n) {
		int stringsLength = strings.length;
		String[] answer = new String[stringsLength];
		
		// n번째 단어 뒤에 strings 값 더해서 strings 배열에 저장
		for(int i=0; i<stringsLength; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		
		// 오름차순 정렬
		Arrays.sort(strings);
		
		// n번째 단어를 제외한 1번째 이후 값을 answer 배열에 저장
		for(int i=0; i<stringsLength; i++) {
			answer[i] = strings[i].substring(1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Level1_09 answer = new Level1_09();
		
		String[] strings1 = {"sun", "bed", "car"};
		String[] strings2 = {"abce", "abcd", "cdx"};
				
		System.out.println( Arrays.toString(answer.solution(strings1, 1)) );
		System.out.println( Arrays.toString(answer.solution(strings2, 2)) );
	}
}