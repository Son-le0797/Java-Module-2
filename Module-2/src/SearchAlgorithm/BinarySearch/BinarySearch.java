package SearchAlgorithm.BinarySearch;

public class BinarySearch {
    public int binarySearch(int arr[], int l, int r, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if ( r > l) {
            int mid = ( r - l ) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            else if (arr[mid] > x) {
                return binarySearch(arr, l, mid -1, x);
            }
            else
                return binarySearch(arr,mid + 1, r, x);
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        BinarySearch si = new BinarySearch();
        int arr[] = { 40,12,2,24,7,17,4,49 };
        int l = 0;
        int r = arr.length-1;
        int x = 10;
        int result = si.binarySearch(arr,l,r,x);

        System.out.println("Array after sorted: ");
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + "\t");
        }
        if (result == -1)
            System.out.printf("\nElement %d is not present",x);
        else
            System.out.printf("\nElement %d found at index %d",x,result);
    }
}
