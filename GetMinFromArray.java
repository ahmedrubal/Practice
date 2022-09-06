package javaDemo;

public class GetMinFromArray {

	public static void main(String[] args) {
		
		int []arr= {4,0,1,4,8,12,-1};
		int len = arr.length;
		int min =arr[0];
		for(int i =0; i<len; i++) {
			System.out.println(i);
			if(arr[i]<min)
				min =arr[i];
		}
		System.out.println(min);

	}

}
