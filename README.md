# pomegranate
Team pomegranate -- Angela Tom, Tabassum Fabiha, Shayan Chowdhury, Nadine Jackson

APCS2 pd2

L01 -- What Does the Data Say?

2018-03-14

# Hypothesis
The best case for quicksort is when the array is already in order. The runtime is O(nlogn).
The worst case for quicksort is when all elements are the same; it has a runtime of O(n^2).
A normal case is randomized numbers and the runtime is O(nlogn);

# Background
Summary of QuickSort algorithm:
  QSort(arr): Calls QSortH method to sort the array.
  QSortH(arr, left, right):
              1) If @param left is equal to @param right, then the range is 0
                 and you don't do anything.
                 Else, @param left should be less than @param right and you
                 continue.
              2) Perform partition within the given range at pivot point equal
                 to the median of the range. The return value is now stored.
              3) Call QSortH to sort everything from @param left to one less
                 than the stored number and everything from one more than the
                 stored number to @param right.

# Methodology
We tested the runtime of our quicksort algorithm by testing different sizes of arrays ranging from 1000 to 14,000, adding 1000 array sizes at a time.
For each size, we ran 1000 trials and divided the overall time by 1000 to get an average runtime for the certain array size.
In our experiment, we ran the worst case tests, best case tests, and then normal tests respectively.
Data is sent into a csv file.

# Results


# Conclusions


