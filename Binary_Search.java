import java.util.*;
class Binary_Search {
	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Binary_Search ob = new Binary_Search();
		int arr[];
		int x;
		arr=new int [5];
		System.out.print("Enter any 5 numbers:- \n");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int n = arr.length;
		System.out.print("Enter the number you want to search:- \n");
		x=sc.nextInt();
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
		sc.close();
	}
}