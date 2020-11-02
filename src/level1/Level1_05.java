package level1;

import java.util.Arrays;
import java.util.Collections;

// 문자열 내림차순으로 배치하기
public class Level1_05 {

	public String solution(String s) {

		// s를 배열로 반환해서 str배열에 저장
		String[] str = s.split("");
		
		// Collections.reverse()를 사용해서 str배열을 역순으로 정렬
		// reverse 매개변수로는 list가 들어가야해서 Arrays의 함수인 asList 사용
		Collections.reverse(Arrays.asList(str));
		 
		// String.join함수를 이용해서 ""규칙으로 str배열을 차례대로 합침
		return String.join("", str);
	}
	
	public static void main(String[] args) {
		Level1_05 answer = new Level1_05();
		System.out.println(answer.solution("Zbcdefg"));
	}
}