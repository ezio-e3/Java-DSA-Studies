# Java-DSA-Studies
Java Data Structures and Algorithm Studies and Notes
<br>
## Arrays?
Arrays are data structures with a fixed defined size that store collection of elements of the same data type in 
**contiguous** memory locations, meaning memory addresses are right next to each other. This data structure is good for 
quick data retrieval but is limited in deleting data as there is no inbuilt delete method on arrays in **JAVA**, 
so you would need to write a custom method to delete elements in your array.
## Searching Algorithms?
Searching algorithms are used to search a collection of data for a specific value. there are generally 2 classifications.
- sequential search, e.g **linear search**
- interval search, e.g **binary search**
#### Linear Search
This search algorithm traverses each element in the collection sequentially until the desired value is found. Linear
search can be slow for larger collections of data.
#### Binary Search
Binary search is a more efficient search algorithm for larger collections of data. However, this algorithm only works
for sorted collections of data. It works by repeatedly dividing the collection in half and comparing the middle element
to the desired value. If the middle element is equal to the desired result then the search is complete, but if the middle
element is greater than the desired result the search will continue in the left half of the divided collection, else 
search will continue on the right side of divided collection when middle value is less than desired result.

Binary search has time complexity of O(log n)
