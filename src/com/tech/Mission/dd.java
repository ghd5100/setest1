package com.tech.Mission;

import java.util.Arrays;
public class dd {
	public static void main(String[] args) {
		int arr[] = { 80, 40, 70, 90, 30 };
		// ���迭�� ����,���,�ִ밪�� ���
		// ��³���
		// ����:XX
		// �ִ밪:90

		int sum = 0, max = arr[0], min = arr[0];
		float avg = 0.0f;

		for (int i = 0; i < arr.length; i++) { // �ݺ����� �հ豸�ϱ�
			sum += arr[i]; // == ���� �������� sum+=arr[i]
			if (max < arr[i])
				max = arr[i];

		}

		avg = (float) sum / arr.length;

		// ���

		System.out.printf(Arrays.toString(arr));
		System.out.printf("\nsum: %d,avg: %f", sum, avg);
		System.out.printf("\nmax: %d", max);
		// �ִ� �ּ�����

	}
}
