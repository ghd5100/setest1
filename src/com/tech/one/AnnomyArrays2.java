package com.tech.one;

import java.util.Arrays;

public class AnnomyArrays2 {

	public static void main(String[] args) {
//		����迭
//		���Ǵ� ���� ������ ���ǰ� �������� ������
		System.out.println("sum: "+sum(new int[] {5,5,5,5,5}));
		//��°� ���ÿ� ����迭�� �־����. �տ��� �迭 �������� ����.
	}
//�Ʒ��� �Լ���.
	private static int sum(int[] arrs) {  //���� ���� �迭�� arrs�� �޾���. �迭������ ����迭���� ������.
		int total=0;
		for (int i = 0; i < arrs.length; i++) {
			total+=arrs[i];//total=total+arr[i]; �̶�� ��
		}
		return total;   //�������ָ� �� ���� �� ����迭 ���� ��. �ǳ׹���. NEW INT������ ���� ������.
	}

}
