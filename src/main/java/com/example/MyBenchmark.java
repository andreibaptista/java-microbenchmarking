package com.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyBenchmark {
    static final int COUNT = 10000;
    @BenchmarkMode(Mode.Throughput) @OutputTimeUnit(TimeUnit.MINUTES)
    public List<Boolean> testFillEmptyList() {
        List<Boolean> list = new ArrayList<>();
        for (int i=0;i<COUNT;i++) {
            list.add(Boolean.TRUE);
        }
        return list;
    }
    @Benchmark
    public List<Boolean> testFillAllocatedList() {
        List<Boolean> list = new ArrayList<>(COUNT);
        for (int i=0;i<COUNT;i++) {
            list.add(Boolean.TRUE);
        }
        return list;
    }
}