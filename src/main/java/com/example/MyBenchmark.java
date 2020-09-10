package com.example;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyBenchmark {

    @State(Scope.Thread)
    public static class ClassState {
        static final int COUNT = 10000;
    }



    @BenchmarkMode(Mode.Throughput) @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public List<Boolean> testFillEmptyList() {
        List<Boolean> list = new ArrayList<>();
        for (int i=0;i<ClassState.COUNT;i++) {
            list.add(Boolean.TRUE);
        }
        return list;
    }
    @Benchmark
    public List<Boolean> testFillAllocatedList() {
        List<Boolean> list = new ArrayList<>(ClassState.COUNT);
        for (int i=0;i<ClassState.COUNT;i++) {
            list.add(Boolean.TRUE);
        }
        return list;
    }

    @Benchmark
    public void BlackholeTest(Blackhole blackhole) {
        int a = 1;
        int b = 2;
        int sum = a + b;
        blackhole.consume(sum);
    }

}