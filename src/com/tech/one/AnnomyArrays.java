package com.tech.one;

import java.util.Arrays;

public class AnnomyArrays {

	public static void main(String[] args) {
//		무명배열
//		사용되는 곳이 한차례 사용되고 재사용하지 않을때
		
		int[] aa= {1,2,3,4,5}; //이거는 aa라는 배열임. 무명아님
		System.out.println(Arrays.toString(aa));
		
//		new int[] {1,2,3,4};  이런식으로 배열명이 없음
		System.out.println(Arrays.toString(new int[] {5,5,5,5,5}));
		//출력과 동시에 무명배열을 넣어버림. 앞에서 배열 선언한적 없음.
		
		
	}

}
