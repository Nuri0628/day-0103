package array2;

public class ArrayTest01 {
	
	public static void main(String[] args) {
		//다차원 배열
		//1.2차원 배열 변수 선언
		//**2차원 배열 구성요소-> 1차원 배열의 집합**
		//일차원 배열과 차이: [] 갯수
		//배열변수이름[인덱스 번호] 인덱스 번호=0부터 1씩 증가
		//구성요소인 1차원 배열에 접근하는 변수를 제공
		
		int[][] arr=new int[2][]; //arr 지역변수
		int[][] arr2=new int[2][3];
		
		int[][] arr4={
				{1,2,3},
				{4,5,6}
				};
		
		int[][] arr5={
				{1,2},
				{3,4,5},
				{6,7,8,9}
				};
		
		int[][] arr6={
				{1,2},
				{3,4,5},
				{6,7,8,9},
				{10,11,12,13,14}
				};
		
		int[][] arr3=new int[][] {
			{1,2,3},
			{4,5,6,7}
			};
		//2차원 배열이 제공해 주는 1차원 배열 변수 이름 arr3[0],arr3[1]
		System.out.println("2차원 배열의 길이: "+ arr3.length);
		//a={1,2,3}; a=arr3[0];
		//a[0], a[1], a[2]: arr3[0][0], arr3[0][1], arr3[0][2]
		//arr3[1]={4,5,6};
		//arr3[1][0], arr3[1][1], arr3[1][2]
		System.out.println("arr3[0] length:" + arr3[0].length);
		System.out.println("arr3[1] length:" + arr3[1].length);
		System.out.println("===========================");
		
		
		for(int i=0; i<2; i++){
			for(int j=0; j<arr3[i].length; j++) {
			System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		System.out.println(arr3[0][0]);
		System.out.println(arr3[0][1]);
		System.out.println(arr3[0][2]);
		
		System.out.println(arr3[1][0]);
		System.out.println(arr3[1][1]);
		System.out.println(arr3[1][2]);
		System.out.println(arr3[1][3]);
		*/
		
	}
}
