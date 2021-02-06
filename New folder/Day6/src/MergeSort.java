
public class MergeSort {
	static void mergesort(int[] arr, int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergesort(arr, low , mid);
			mergesort(arr, mid+1 , high);
			mergearr(arr, low, high);
			}
	}
	static void mergearr(int[] arr , int low , int high) {
		int start = low; int mid = (low+high)/2;
		int l= low;
		int k = mid+1;  int temp[] = new int[arr.length];
		while(low <= mid ){
			if(arr[low] > arr[mid]){
				temp[low] = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp[low];
				low++;
				
			}
		}
		while(mid+1 <= high){
			if(arr[mid+1] > arr[high]){
				temp[high] = arr[high];
				arr[high] = arr[mid+1];
				arr[mid+1] = temp[high];
			}
		}
		while(low <= mid && k <= high){
			if(arr[low] >= arr[k]){
				temp[l] = arr[k];
				k++;	
			}
			else{
				temp[l] = arr[low];
				low++;
			}
			l = l+1;
		}
		if(low > mid)
			while(k <= high){
				temp[l] = arr[k];
				l++;
				k++;		
			}
		
		else
			while(low <= mid){
				temp[l] = arr[low];
				l++;
				low++;
			}
		for(l = start ; l <= high ; l++){
			arr[l] = temp[l];
		}
		System.out.println(arr[l]);
		
		
	}
	public static void main(String[] args) {
		int arr[] = {23,3,6,78,56};
		mergesort(arr, 0, arr.length-1);

		
		
	}

}
