# java-microbenchmarking project using JMH

 It consists of a small library and a build system plug-in. The library provides annotations and utilities to declare your benchmarks as annotated Java classes and methods, including a BlackHole class to consume generated values to avoid code elimination. The library also offers correct state handling in the presence of multithreading.
 
 The build system plug-in generates a JAR with the relevant infrastructure code for running and measuring the tests correctly. That includes dedicated warm-up phases, proper multithreading, running multiple forks and averaging across them, and much more.
