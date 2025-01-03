package array;

public class ArrayTest04 {
	
	public static void main(String[] args) {
		String[] names = {"라미란","곽선영","이세영","박주현"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		names[1]="곽선영";
		System.out.println("====수정후====");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);	
		}
		
		//향상된 for-->forEach	
		System.out.println("====향샹된 for====");
		//for(변수선언:집합) {}
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}