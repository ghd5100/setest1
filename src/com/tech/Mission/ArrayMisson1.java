package com.tech.Mission;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMisson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arr 5�� �迭 ����
		// �迭�� �����Է�(50~100���̷� �Է�)
		// <��¹�>
		// �հ� sum
		// ��� avg
		// �ִ����� max
		// �ּ����� min
		// �迭����
		int arr[] = new int[5];

		// �� ����Ʈ�ϱ�
		Scanner s = new Scanner(System.in);

//
//		int sum = 0, max = arr[0], min = arr[0];
//		float avg = 0.0f;  �̰Ÿ� ���⿡�ٰ� ������ min�� �߸� ����.
		// ���� �ݺ��Է� �ϰ� �迭�� �ֱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println("����" + (i + 1) + "�Է��ϼ���");
			arr[i] = s.nextInt();

		}

		int sum = 0, max = arr[0], min = arr[0];
		float avg = 0.0f;
		
		for (int i = 0; i < arr.length; i++) { // �ݺ����� �հ豸�ϱ�
			sum+= arr[i]; // == ���� �������� sum+=arr[i]
			if (max < arr[i]) max = arr[i];
			if (min > arr[i]) min = arr[i];

		}

		avg = (float) sum / arr.length;

		// ���

		System.out.printf(Arrays.toString(arr));
		System.out.printf("sum: %d,avg: %f",sum,avg);
		System.out.printf("\nmax: %d,min: %d",max,min);
		// �ִ� �ּ�����
//������ ��ġ����������. or�� �����Ѵ�. ������ �������� ���°��� �����ϰ������ or�� ����.

// 3���� �迭 -> ����ó��. ��������. ���� ������ �ؼ��� ���̰��Ѵ�. x,y,z ��.
	}

}
