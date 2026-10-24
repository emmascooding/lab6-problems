---- Performance Comparison ----
---- Populate both lists ----
ArrayList - Random insert/delete: 203.289 ms
LinkedList - Random insert/delete: 3907.874 ms
ArrayList - Sequential insert/delete (start/end): 408.222 ms
LinkedList - Sequential insert/delete (start/end): 5.345 ms
ArrayList - Random access (get): 5.805 ms
LinkedList - Random access (get): 2178.365 ms

Random access: ArrayList jumps straight to an index. LinkedList has to walk node by node.
Random insert/delete: both are O(n), but LinkedList must first walk to the position, and that walk costs more than ArrayList shifting elements.
Start/end operations: LinkedList only updates its head or tail pointer. ArrayList shifts every element when you insert or remove at index 0.