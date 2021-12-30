package com.tech.Mission;

import java.util.Random;

public class DiceCount {

	public static void main(String[] args) {
		//빈도수 체크
//		주사위 10000번 던져서 (램덤 처리)
//		1면 : 50001; 나옴
//		2면 : 3000?; 나옴
//		3면 : 20001; 나옴
//		4면 : 1000?; 나옴
//		
//		총 total이 만번이 되야함.
//		
//		비율계산
//		1면 추출 비율
//		2면 추출 비율
//		3면 추출 비율
//		나타내기
//		총 비율 100%나와야함.
		
//		메일 보내기 tbasic@daum.net
//		주사위_홍길동13.zip ->메일 제목도 똑같이 적기.
		
//		배열, 램덤활용, for문 활용, 조건문으로 구분
		
		Random r=new Random(); 
		int num=r.nextInt(6)+1; //1부터 6까지이고
//		System.out.println(num);
		float one=0;
		float two=0;
		float three=0;
		float four=0;
		float five=0;
		float six=0;
		
		
		int i=0;
		
		while (i<10000) {
			num=r.nextInt(6)+1;
			if (num==1) {
				one=one+1;
			}else if (num==2) {
				two=two+1;
			}else if (num==3) {
				three=three+1;
			}else if (num==4) {
				four=four+1;
			}else if (num==5) {
				five=five+1;
			}else {
				six=six+1;
			}i++;
		}
		
		float total=one+two+three+four+five+six;
		float totalPer=(one/total*100)+(two/total*100)+(three/total*100)+(four/total*100)+(five/total*100)+(six/total*100);
		
		
		System.out.println("1면: "+one+" 2면: "+two+" 3면: "+three+" 4면: "+four+" 5면: "+five+" 6면: "+six);
		System.out.println("총 주사위 굴린 횟수: "+total);
		System.out.println("1면 추출율 : "+(one/total*100+"%")+ " 2면 추출율 : "+(two/total*100+"%")+
				" 3면 추출율 : "+(three/total*100+"%")+" 4면 추출율 : "+(four/total*100+"%")+"5 면 추출율 : "+(five/total*100+"%")+" 6면 추출율 : "+(six/total*100+"%"));
		System.out.println("총 면 추출율:"+totalPer+"%");
}

}
