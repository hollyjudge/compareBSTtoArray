# compareBSTtoArray
The goal of this assignment is to compare the Binary Search Tree with a traditional unsorted array data structure, both implemented in Java, using a real-world application to check if a student is on a pre-approved list for access to campus during the lockdown.


EXPERIMENTATION DESCRIPTION
The goal of the experiment was to prove that a binary search tree requires more comparison operations (and therefore takes a longer amount of time) to insert objects/variables than an array, however the binary search tree requires far less comparison operations (and therefore is far quicker) in finding something within the tree than an array is at finding something within the array.
The key to my implementation of the experiment was the creation of a python script and an Experiment class. However, before this, I created 10 text files that were subsets of the original oklist.txt. The text files were of n=500, n=1000, n=1500, n=2000, n=2500, n=3000, n=3500, n=4000, n=4500 and n=5000 data items. All data entries within each subset were unique.

My python script outputted the number of comparison operations required per parameter, that is the number of comparison operations required for searching each student ID within the text file imported. The script ran both AccessBSTApp and AccessArrayApp on the subset files explained above, the name of the java class being used needed to be changed manually and was not automated. Find and insert comparisons were counted separately. The output in the terminal was then saved to a file. The new text files contained the results for the different subsets, the array and BST results for the subset were saved to separate files. I created a class called Experiment that read from these text files that were created. The program looped through each text file comparing the comparison number result for each parameter in the subset to determine the minimum number of comparisons, the maximum number of comparisons and the average.

TEXT FILES EXPLAINED:

oklist= data set used in AccessArrayApp and AccessBSTApp

n500= one example of an initial data set for testing

n500Array= one example of data set outputted: this set contained the number of comparrison opperations required for searching each student ID in an array

n500BST= one example of data set outputted: this set contained the number of comparrison opperations required for searching each student ID in a binary search tree
