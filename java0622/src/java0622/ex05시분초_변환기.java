package java0622;

public class ex05시분초_변환기 {

	public static void main(String[] args) {
		// 정수형 변수에 초를 초기화
		int second = 3850;
		
		// 초단위의 값을 시/분/초 형태로 변환하기
		// 결과값 : 0시 0분 0초
		
		int si = second / 60 /60;
		
		int bun = (second - si*60*60)/60;
		// int bun = second % 360 / 60;
		int cho = second%60;
		
		System.out.println("결과값 : " + si + "시 " + bun +"분 " + cho +"초");
	}

}
