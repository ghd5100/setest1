package com.tech.Mission;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMisson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arr 5개 배열 선언
		// 배열에 성적입력(50~100사이로 입력)
		// <출력물>
		// 합계 sum
		// 평균 avg
		// 최대점수 max
		// 최소점수 min
		// 배열선언
		int arr[] = new int[5];

		// 툴 임포트하기
		Scanner s = new Scanner(System.in);

//
//		int sum = 0, max = arr[0], min = arr[0];
//		float avg = 0.0f;  이거를 여기에다가 넣으면 min이 잘못 나옴.
		// 성적 반복입력 하고 배열에 넣기
		for (int i = 0; i < arr.length; i++) {
			System.out.println("성적" + (i + 1) + "입력하세요");
			arr[i] = s.nextInt();

		}

		int sum = 0, max = arr[0], min = arr[0];
		float avg = 0.0f;
		
		for (int i = 0; i < arr.length; i++) { // 반복으로 합계구하기
			sum+= arr[i]; // == 같은 문법으로 sum+=arr[i]
			if (max < arr[i]) max = arr[i];
			if (min > arr[i]) min = arr[i];

		}

		avg = (float) sum / arr.length;

		// 출력

		System.out.printf(Arrays.toString(arr));
		System.out.printf("sum: %d,avg: %f",sum,avg);
		System.out.printf("\nmax: %d,min: %d",max,min);
		// 최대 최소점수
//범위가 겹치지않을때는. or로 연결한다. 범위가 교집합이 없는곳을 선정하고싶으면 or로 연결.

// 3차원 배열 -> 영상처리. 자율주행. 같은 공간적 해석에 쓰이곤한다. x,y,z 축.
	}

}
