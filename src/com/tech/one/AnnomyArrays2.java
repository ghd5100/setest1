package com.tech.one;

import java.util.Arrays;

public class AnnomyArrays2 {

	public static void main(String[] args) {
//		무명배열
//		사용되는 곳이 한차례 사용되고 재사용하지 않을때
		System.out.println("sum: "+sum(new int[] {5,5,5,5,5}));
		//출력과 동시에 무명배열을 넣어버림. 앞에서 배열 선언한적 없음.
	}
//아래는 함수임.
	private static int sum(int[] arrs) {  //위에 무명 배열을 arrs로 받아줌. 배열형식을 무명배열에서 가져옴.
		int total=0;
		for (int i = 0; i < arrs.length; i++) {
			total+=arrs[i];//total=total+arr[i]; 이라는 말
		}
		return total;   //리턴해주면 그 값이 저 무명배열 값에 들어감. 건네받음. NEW INT쪽으로 값을 보내쥼.
	}

}
