The Question given was to find whether a matrix is a rising matrix or not.
For this problem I took a matrix of mxn and using a for loop I checked the columns if all of them had a descending order then the matrix was a rising one but even if one of them was not in a descending order then it was not a rising matrix.
The most important variable here was count which was a boolean variable and its value decided whether the matrix is rising or not.
Test case 1:

Enter  n:4

83 86 77 15 

93 35 86 92 

49 21 62 27 

90 59 63 26 

Not a rising Matrix

Enter  n:2

83 86 

77 15 

Not a rising Matrix


Enter  n:3

83 86 77 

15 93 35 

86 92 49 

Not a rising Matrix

Test Case 2:

Enter  n:3
Enter a[0][0]: 3
Enter a[0][1]: 6
Enter a[0][2]: 9
Enter a[1][0]: 2
Enter a[1][1]: 5
Enter a[1][2]: 8
Enter a[2][0]: 1
Enter a[2][1]: 4
Enter a[2][2]: 7

 printing the elements ....

3       6       9
2       5       8
1       4       7       It is a rising matrix


Enter  n:2
Enter a[0][0]: 3
Enter a[0][1]: 6
Enter a[1][0]: 2
Enter a[1][1]: 5

 printing the elements ....

3       6
2       5       It is a rising matrix


Enter  n:2
Enter a[0][0]: 6
Enter a[0][1]: 5
Enter a[1][0]: 9
Enter a[1][1]: 8

 printing the elements ....

6       5
9       8       Not a rising Matrix
