package array;

public class ArrayTest01 {
	
	public static void main(String[] args) {
		//배열: 동일한 데이터 타입의 집합구조, 메모리 상에서 순차적으로 할당 됨
		int n1,n2,n3; //int 지역변수, 지역변수 초기화 해야됨 (local variable)
		//1.배열 변수 선언=2.new 메모리공간 할당
		int[] arr=new int[3]; //stack 메모리할당 = heap 메모리할당 
		//int 타입 배열변수 == 참조변수(reference type) ([]:배열 기호)
		//new 키워드: heap 메모리공간에 할당. 4byte(int) 3개 
		//배열은 할당된 메모리 공간에 접근하기 위한 변수 이름을 자동으로 생성해줌
		//int[3]: 배열변수이름[인덱스 번호] 인덱스 번호=0부터 1씩 증가
		//arr[0], arr[1], arr[2] : default 자동 초기화 됨
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]); //마지막 번호는 인덱스 할당 번호보다 1작음 (int[3])
		//배열의 길이 확인 방법: 배열변수.length
		System.out.println("배열의 개수 :"+arr.length);
		
		//System.out.println(arr[3]); //error message: Index 3 out of bounds for length 3
		
		
		
	} //메소드 area 내부에서 실행된 메모리 소멸시점은 메소드 코드가 끝날 때 사라짐

}
