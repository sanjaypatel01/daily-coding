#### Sort k distance array
###An element can maximum be k distance away from its final position.  

##### Video link - https://www.youtube.com/watch?v=yQ84lk-EXTQ

Solution - Use min heap of k+1 size, insert first k+1 elements in heap, now from k+2th elements onwards 
remove root elements (smallest in heap) and insert new element from array. removed elements will form sorted array.

####Time Complexity - O(n*log(k))
####Space Complexity - O(k) Min Heap size of k+1 element is needed