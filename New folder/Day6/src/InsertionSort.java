
public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {10,56,45,3,16};
		for(int i = 1;i < arr.length;++i){
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j-1;
				
			}
			arr[j+1] = key;
		}
		System.out.println("after swapping");
		for(int x : arr){
			System.out.println(x);
		}
		
	}

}
