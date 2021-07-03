package BehavioralDesignPatten.Strategy;

public class FOO extends StrategySolution{
    private int state = 1;

    protected void start() {
        System.out.print("\nStart  ");
    }

    protected void stop() {
        System.out.println("Stop");
    }

    protected boolean nextTry() {
        System.out.print("\nNextTry-" + state++ + "  ");
        return true;
    }

    protected boolean isSolution() {
        System.out.print("\nIsSolution-" + (state == 3) + "  ");
        return (state == 3);
    }
}
