package test;

public class bubbleSortWithIfElse {

    public void createArray(){
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*100);
        }
    }

    public String bubbleSort(int[] arr, int n){
        if(n < 0) {
            return null;
        }
        if(n < arr.length - 1){
            if(arr[n+1] < arr[n]){
                int temp = arr[n];
                arr[n] = arr[n + 1];
                arr[n + 1] = temp;
            }
        }
        return bubbleSort(arr, n + 1 );
    }

    public static void main(String[] args) {
//        System.out.println("the array is: "+ );
    }

}
