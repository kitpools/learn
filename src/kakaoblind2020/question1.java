package kakaoblind2020;

import java.util.*;

// 문자열 s를 입력받으면 제일 앞에서부터 1개 단위로 잘라서 String변수 compress에 넣음
// 반복문 시작 : 2개 단위로 잘라서 이 변수와 비교해서 더 짧은걸 compress에 넣음
// ~ s.length/2개 단위로 자른거까지 반복
// compress.length를 answer에 넣음
// answer을 return



class Solution{
	public int solution(String s) {
		int answer = 0;
		int stack = 0;
		String compress = "";
		String temp;
		String[] array = s.split(""); // s문자열을 1개 단위로 자름 
		
		try {
			for(int i=0; i<array.length; i++) {
				if(array[i].equals(array[i+1])) { // 잘린 문자열 비교, 같으면 stack++ !마지막자리+1과 비교를 못해서 에러가 발생하는데 어떻게 해결할지
					stack++;
					
				}else { // 다르면 stack과 그 문자를 compress에 붙여주고 반복
					stack++;
					
					if(stack==1) { // 1은 생략
						temp = array[i];
						compress = compress + temp;
						stack = 0;
						temp = "";
						
					}else {
						temp = stack+array[i];
						compress = compress + temp;
						stack = 0;
						temp = "";
						
					}
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException e) { //마지막 자리 비교
			if(array[array.length-2].equals(array[array.length-1])) {
				stack++;
			
				if(stack==1) {
					temp = array[array.length-2];
					compress = compress + temp;
					System.out.println(compress);
					
				}else {
					temp = stack+array[array.length-2];
					compress = compress + temp;
					System.out.println(compress);
					
				}
			}else {
				temp = array[array.length-1];
				compress = compress + temp;
				System.out.println(compress);
			}
		}
		
		answer = compress.length();
		
		
		return answer;
		
	}
}

public class question1 {

	public static void main(String[] args) {
		
		Solution Solution = new Solution();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("압축할 문자열을 입력해주세요! >> ");
		String s = sc.next();
		
		
		Solution.solution(s);
	}

}
