
public class SortArray {
	static int[] array(int[] arr) {
		
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
		
			
       return arr;
	}
	public static void main(String[] args) {
		
		int arr[] = {15,34,20,18};
        int a[] = array(arr);
        for( int i = 0; i < a.length ; i++ ) {
        	System.out.print(a[i]+ " ");
        }
	}

}
