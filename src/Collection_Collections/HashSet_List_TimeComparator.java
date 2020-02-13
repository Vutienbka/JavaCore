package Collection_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet_List_TimeComparator {
    private static void ListHashSetPerformanceBenchmark() {
        final int COUNT = 500;
        //final int COUNT = 5000000;

        HashSet<Integer> intHashSet = new HashSet<>();
        StopWatch stopWatch = new StopWatch();

        for (int i = 0; i < COUNT; i++) {
            intHashSet.add(i);
        }

        stopWatch.start(System.currentTimeMillis());
        for (int i = 0; i < COUNT; i++) {
            intHashSet.contains(i);
        }
        stopWatch.stop(System.currentTimeMillis());
        System.out.println("HashSet Time:");
        System.out.println((int) stopWatch.getElapseTime() + "ms");


        //stopWatch.Reset();
        List<Integer> intList = new ArrayList<Integer>() {
        };
        for (int i = 0; i < COUNT; i++) {
            intList.add(i);
        }

        stopWatch.start(System.currentTimeMillis());
        for (int i = 0; i < COUNT; i++) {
            intList.contains(i);
        }
        stopWatch.stop(System.currentTimeMillis());
        System.out.println("List Time:");
        System.out.println((int) stopWatch.getElapseTime() + "ms");
    }

    public static void main(String[] args) {
        ListHashSetPerformanceBenchmark();
    }
}

