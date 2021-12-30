package com.tech.Mission;

import java.util.Arrays;
public class dd {
	public static void main(String[] args) {
		int arr[] = { 80, 40, 70, 90, 30 };
		// 위배열의 총점,평균,최대값을 출력
		// 출력내용
		// 총점:XX
		// 최대값:90

		int sum = 0, max = arr[0], min = arr[0];
		float avg = 0.0f;

		for (int i = 0; i < arr.length; i++) { // 반복으로 합계구하기
			sum += arr[i]; // == 같은 문법으로 sum+=arr[i]
			if (max < arr[i])
				max = arr[i];

		}

		avg = (float) sum / arr.length;

		// 출력

		System.out.printf(Arrays.toString(arr));
		System.out.printf("\nsum: %d,avg: %f", sum, avg);
		System.out.printf("\nmax: %d", max);
		// 최대 최소점수

	}
}
