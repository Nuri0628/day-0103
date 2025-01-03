package programmers;

public class Ex01 {
	
	public static void main(String[] args) {
		Solution solution=new Solution();
		int[] result=solution.solution(15,5);
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]+" ");
		}
	}
}



class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        
        for(int i=1; i<=n; i++) {
        	//k=3 i가 k의 배수이면?
        	if(i%k==0) {
        		int[] temp=new int[answer.length+1];
        		//answer->temp
        		for(int j=0; j<answer.length; j++)
        			temp[j]=answer[j];
        	}
        		//임시공간의 마지막 주소에 배소를 저장	
        		temp[temp.length-1]=i; //length는 배열의 길이정보, length-1: 배열의 마지막 값
        	
        		answer=temp;
        	}
        }
        
        
        return answer;
    }

}
	

