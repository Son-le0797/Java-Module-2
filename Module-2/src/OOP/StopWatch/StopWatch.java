package OOP.StopWatch;

public class StopWatch {
    private long startTime = 0;
    private long endTime;

    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return startTime;
    }

    public  long getEndTime(){
        return endTime;
    }

    public long getElapsedTime(){
        long elapsed = (endTime - startTime);
        return elapsed;
    }

}
