
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {15,34,20,18};
		for(int i = 0,temp;i < arr.length;i++) {
			for(int j = 1;j < arr.length-i-1;j++){
				 temp=0;
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("after swapping");
		for(int x : arr){
			System.out.println(x);
		}
		
	}

}
