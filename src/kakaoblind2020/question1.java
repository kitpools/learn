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
		String compress;
		String[] array = s.split(""); // s���ڿ��� 1�� ������ �ڸ� 
		
		try {
			for(int i=0; i<array.length; i++) {
				if(array[i].equals(array[i+1])) { // �߸� ���ڿ� ��, ������ stack++ !�������ڸ�+1�� �񱳸� ���ؼ� ������ �߻��ϴµ� ��� �ذ�����
					stack++;
					
				}else { // �ٸ��� stack�� �� ���ڸ� compress�� �ٿ��ְ� �ݺ�
					stack++;
					
					if(stack==1) {
						compress = array[i];
						System.out.printf(compress);
						stack = 0;
					}else {
						compress = stack+array[i];
						System.out.printf(compress);
						stack = 0;
						
					}
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException e) { //������ �ڸ� ��
			if(array[array.length-2].equals(array[array.length-1])) {
				stack++;
			
				if(stack==1) {
					compress = array[array.length-2];
					System.out.println(compress);
					
				}else {
					compress = stack+array[array.length-2];
					System.out.println(compress);
					
				}
			}else {
				compress = array[array.length-1];
				System.out.println(compress);
			}
		}
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
