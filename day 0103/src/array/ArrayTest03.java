package array;

public class ArrayTest03 {
	
	public static void main(String[] args) {
		//
		String[] strs=new String[3];
		//참조형변수 default value= null : 아직 참조하지 않음. 숫자 0에 대응
		System.out.println(strs[0]);
		int[] arr=null; //메모리 할당이 아직 이루어지지 않음
		System.out.println(arr);
		//int[] arr2=new int[3] {1,2,3}; []안에 숫자 쓰면 오류
		int[] arr2=new int[] {1,2,3};
		int[] arr3= {1,2,3};
		//배열도 메모리공간 할당과 동시에 초기화 리스트로 초기화 가능
		//int n=10;
		
		int[] arr4;
		arr4= new int[] {1,2,3};
		//arr4= {1,2,3} 오류
	}

}
