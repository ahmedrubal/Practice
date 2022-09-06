package javaDemo;

public class GetMaxFromArray {

	public static void main(String[] args) {
	
		int []arr = {2,5,9,0,4,2,1};
		int max=0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);

	}

}
