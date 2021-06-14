package ArrayAndMethodInJava;

public class FindMinElementInArray {
    public static void main(String[] args) {
        int[] arr = {4,2,6,7,2,7,12,63,63,-7};
        int index = minValue(arr);
        System.out.print("Min value in array is: "+index);
    }
    public static int minValue(int[] array){
        int min=array[0];
        for(int i = 1; i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
