package com.tech.Mission;

import java.util.Random;

public class DiceCount {

	public static void main(String[] args) {
		//�󵵼� üũ
//		�ֻ��� 10000�� ������ (���� ó��)
//		1�� : 50001; ����
//		2�� : 3000?; ����
//		3�� : 20001; ����
//		4�� : 1000?; ����
//		
//		�� total�� ������ �Ǿ���.
//		
//		�������
//		1�� ���� ����
//		2�� ���� ����
//		3�� ���� ����
//		��Ÿ����
//		�� ���� 100%���;���.
		
//		���� ������ tbasic@daum.net
//		�ֻ���_ȫ�浿13.zip ->���� ���� �Ȱ��� ����.
		
//		�迭, ����Ȱ��, for�� Ȱ��, ���ǹ����� ����
		
		Random r=new Random(); 
		int num=r.nextInt(6)+1; //1���� 6�����̰�
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
		
		
		System.out.println("1��: "+one+" 2��: "+two+" 3��: "+three+" 4��: "+four+" 5��: "+five+" 6��: "+six);
		System.out.println("�� �ֻ��� ���� Ƚ��: "+total);
		System.out.println("1�� ������ : "+(one/total*100+"%")+ " 2�� ������ : "+(two/total*100+"%")+
				" 3�� ������ : "+(three/total*100+"%")+" 4�� ������ : "+(four/total*100+"%")+"5 �� ������ : "+(five/total*100+"%")+" 6�� ������ : "+(six/total*100+"%"));
		System.out.println("�� �� ������:"+totalPer+"%");
}

}
