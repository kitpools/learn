package kakaoblind2020;

import java.util.*;

// ���ڿ� s�� �Է¹����� ���� �տ������� 1�� ������ �߶� String���� compress�� ����
// �ݺ��� ���� : 2�� ������ �߶� �� ������ ���ؼ� �� ª���� compress�� ����
// ~ s.length/2�� ������ �ڸ��ű��� �ݺ�
// compress.length�� answer�� ����
// answer�� return



class Solution{
	public int solution(String s) {
		int answer = 0;
		int stack = 0;
		String compress = "";
		String temp;
		String[] array = s.split(""); // s���ڿ��� 1�� ������ �ڸ� 
		
		try {
			for(int i=0; i<array.length; i++) {
				if(array[i].equals(array[i+1])) { // �߸� ���ڿ� ��, ������ stack++ !�������ڸ�+1�� �񱳸� ���ؼ� ������ �߻��ϴµ� ��� �ذ�����
					stack++;
					
				}else { // �ٸ��� stack�� �� ���ڸ� compress�� �ٿ��ְ� �ݺ�
					stack++;
					
					if(stack==1) { // 1�� ����
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
			
		}catch(ArrayIndexOutOfBoundsException e) { //������ �ڸ� ��
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
		
		System.out.printf("������ ���ڿ��� �Է����ּ���! >> ");
		String s = sc.next();
		
		
		Solution.solution(s);
	}

}
