## Topics

### JVM Architecture
* Java Memory model
* Stack vs Heap vs Method Area

### Garbage Collection
* Serial GC
  * -XX:+UseSerialGC
  *  freezes all application threads whenever it’s working
  *  designed for single threaded environment

* Parallel GC
  * default
  * uses multiple threads to scan through and compact the heap
  * it will stop application threads when performing either a minor or full GC collection
  * best suited for apps that can tolerate application pauses and are trying to optimize for lower CPU overhead caused by the collector

* Concurrent Mark and sweep
  * -XX:+USeParNewGC
  * multiple threads scans for un-used objects - mark
  * Stop The World(STW) when initializing the mark and
  * require more CPU resource
   
* G1 GC
  * better performance for heap larger than 4 GB
  * multiple background threads to scan through the heap that it divides into regions, spanning from 1MB to 32MB (depending on the size of your heap). G1 collector is geared towards scanning those regions that contain the most garbage objects first, giving it its name (Garbage first).
  * it compacts the heap on-the-go, unlike CMS(which compact at STW)
  * XX:+UseStringDeduplication - introduced in Java 8,  finds the duplicate strings and point it to the same underlying character array 
  
#### PermGen vs Metaspace
* permgen part of the heap that was traditionally allocated for class meta-data, interned strings and static variables
* perm-gen is completely removed in java 8 and class metadata is allocated out of native memory called metaspace.
* by default metaspace has the limit of available native memory, but can be configured using MaxMetaspaceSize
* Metaspace GC triggers when usage reaches MaxMetaspaceSize