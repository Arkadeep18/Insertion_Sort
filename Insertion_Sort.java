package neww;

public class Insertion_Sort {
	public static void main(String[] args) {
		 int arr[] = {5, 4, 7, 2, 12};
		 
		 for(int i=1;i<arr.length;i++) {  //Traverse starts from index 1
			 int key = arr[i];
			 int j = i-1;
			 
			 while(j>=0 && arr[j]>key) {
				 arr[j+1] = arr[j];
				 j--;
			 }
			 arr[j+1] = key;
					 
		 }
		 System.out.println("Sorted array");
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
}
