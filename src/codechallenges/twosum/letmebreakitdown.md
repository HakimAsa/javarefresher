### <u>1. First Approach</u>
- A poor way to think of this problem is to loop the array of the integers for the first index by initializing it to 0.
Then a second loop for the second index and initialize it to firstIndex+1 (i.e. the second number of the array nums )
- Then compare the sum of the first and the second integers to the target. If matched, return the indices of those integers immediately.
- The edge case is to return <code>[0, 0]</code> if there is no match.

### <u>2. Second Approach (Think of how to avoid nested <code>for</code> loop since it is <code>O(n^2)</code> in complexity)</u>