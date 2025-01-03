package array;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 실수형 변수 여러개 생성 double, float
		// 1.실수형 배열변수 생성
		double[] ar1; // 'double[]형 배열타입'으로 기억하면 좋음
		double ar2[], ar3;
		ar3 = 3.14; // ar3 배열변수가 아닌 double형 일반 변수
		double[] ar4, ar5; // ar5 배열변수

		double[] arr = new double[100];
		// arr(배열변수이름)[0], arr[1], arr[2], arr[3]

		/*
		 * System.out.println("arr[0]="+arr[0]); System.out.println("arr[1]="+arr[1]);
		 * System.out.println("arr[2]="+arr[2]); System.out.println("arr[3]="+arr[3]);
		 * System.out.println("===================");
		 */
		int n = arr.length; //length: 배열길이 체크
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}