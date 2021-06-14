package OOP.StopWatch;

public class Display {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        StopWatch watch = new StopWatch();
        System.out.println("Start: "+watch.getStartTime());

//        int[] arr = new int[size];
//        for(int i = 0;i < size;i++){
//            arr[i] = i+1;
//        }

        watch.stop();
        System.out.print("End: "+watch.getEndTime());
        System.out.print("Elapsed time: "+watch.getElapsedTime());
    }
}
