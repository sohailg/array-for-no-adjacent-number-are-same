# arrayfor-no-adjacent-number-are-same

The idea is to put the highest frequency element first (a greedy approach). We use a priority queue (Or Binary Max Heap) and put all elements and ordered by their frequencies (highest frequency element at the root). We then one by one take the highest frequency element from the heap and add it to result. After we add, we decrease the frequency of the element and temporarily move this element out of priority queue so that it is not picked next time.

We have to follow the step to solve this problem, they are:

   1. Build a Priority_queue or max_heap, pq that stores elements and their frequencies.
    …… Priority_queue or max_heap is built on the bases of the frequency of elements.
    2.Create a temporary Key that will be used as the previously visited element (the previous element in the resultant array. Initialize it { num = -1, freq = -1 }
    3.While pq is not empty.
        a.Pop an element and add it to the result.
        b.Decrease frequency of the popped element by ‘1’.
        c.Push the previous element back into the priority_queue if it’s frequency > ‘0’.
        d.Make the current element as the previous element for the next iteration.
    4.If the length of resultant string and original are not equal, print “not possible”. Else print result.
#hacktoberfest
