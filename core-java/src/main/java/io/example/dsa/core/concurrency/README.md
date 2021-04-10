## Fixed thread pool vs cached thread pool vs Scheduled thread pool

## Volatile vs Atomic
* i++ is ot an atomic operation (https://stackoverflow.com/questions/25168062/why-is-i-not-atomic)
* declared volatile, in which case the Java Memory Model ensures that all threads see a consistent value for the variable
* It is a compile-time error if a final variable is also declared volatile.
  
