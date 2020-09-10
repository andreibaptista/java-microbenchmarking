# java-microbenchmarking project using JMH

 It consists of a small library and a build system plug-in. The library provides annotations and utilities to declare your benchmarks as annotated Java classes and methods, including a BlackHole class to consume generated values to avoid code elimination. The library also offers correct state handling in the presence of multithreading.
 
 The build system plug-in generates a JAR with the relevant infrastructure code for running and measuring the tests correctly. That includes dedicated warm-up phases, proper multithreading, running multiple forks and averaging across them, and much more.


 Run progress: 50.00% complete, ETA 00:00:52
 Fork: 1 of 5
 Warmup Iteration   1: 15417.073 ops/s
 Warmup Iteration   2: 17956.473 ops/s
 Warmup Iteration   3: 19344.709 ops/s
 Warmup Iteration   4: 19531.616 ops/s
 Warmup Iteration   5: 19594.089 ops/s
Iteration   1: 15770.995 ops/s
Iteration   2: 11527.629 ops/s
Iteration   3: 10487.826 ops/s
Iteration   4: 10836.898 ops/s
Iteration   5: 11593.463 ops/s

 Run progress: 60.00% complete, ETA 00:00:41
 Fork: 2 of 5
 Warmup Iteration   1: 15104.388 ops/s
 Warmup Iteration   2: 11723.209 ops/s
 Warmup Iteration   3: 13661.347 ops/s
 Warmup Iteration   4: 17806.467 ops/s
 Warmup Iteration   5: 17836.745 ops/s
Iteration   1: 18376.146 ops/s
Iteration   2: 11179.084 ops/s
Iteration   3: 8729.903 ops/s
Iteration   4: 8048.899 ops/s
Iteration   5: 9837.655 ops/s

 Run progress: 70.00% complete, ETA 00:00:31
 Fork: 3 of 5
 Warmup Iteration   1: 8626.423 ops/s
 Warmup Iteration   2: 14634.751 ops/s
 Warmup Iteration   3: 17769.113 ops/s
 Warmup Iteration   4: 19167.940 ops/s
 Warmup Iteration   5: 18539.108 ops/s
Iteration   1: 14656.397 ops/s
Iteration   2: 13260.480 ops/s
Iteration   3: 14034.512 ops/s
Iteration   4: 12508.605 ops/s
Iteration   5: 15424.938 ops/s

 Run progress: 80.00% complete, ETA 00:00:20
 Fork: 4 of 5
 Warmup Iteration   1: 11583.331 ops/s
 Warmup Iteration   2: 12827.315 ops/s
 Warmup Iteration   3: 13280.350 ops/s
 Warmup Iteration   4: 18113.673 ops/s
 Warmup Iteration   5: 19377.980 ops/s
Iteration   1: 19397.737 ops/s
Iteration   2: 14565.368 ops/s
Iteration   3: 19470.145 ops/s
Iteration   4: 19624.813 ops/s
Iteration   5: 19617.723 ops/s

 Run progress: 90.00% complete, ETA 00:00:10
 Fork: 5 of 5
 Warmup Iteration   1: 12103.020 ops/s
 Warmup Iteration   2: 11280.309 ops/s
 Warmup Iteration   3: 14907.900 ops/s
 Warmup Iteration   4: 12919.638 ops/s
 Warmup Iteration   5: 14150.498 ops/s
Iteration   1: 14964.432 ops/s
Iteration   2: 14524.757 ops/s
Iteration   3: 12700.990 ops/s
Iteration   4: 11378.969 ops/s
Iteration   5: 10524.935 ops/s
