package Collection_Collections;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public void start(long startTime) {
        this.startTime = startTime;
    }

    public void stop(long stopTime) {
        this.endTime = stopTime;
    }

    public long getElapseTime() {
        return this.endTime - this.startTime;
    }
}
