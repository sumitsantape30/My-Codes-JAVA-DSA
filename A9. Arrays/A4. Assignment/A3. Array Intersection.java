Array Intersection

You have been given two integer arrays/list(ARR1 and ARR2) of size M and N, respectively. 
You need to print their intersection; An intersection for this problem can be defined when both the 
arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.
The intersection elements printed would be in the order they appear in the first array/list(ARR1)

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements of the first the array/list.
Third line contains an integer 'M' representing the size of the second array/list.
Fourth line contains 'M' single space separated integers representing the elements of the second array/list.

Output format :
For each test case, print the intersection elements in a row, separated by a single space.
Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5

Time Limit: 1 sec 

Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 4 3
10

Code:

import java.util.*;
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					arr2[j] = -5;
					System.out.print(arr1[i]+" ");
					break;
				}
				
			}
		}
		System.out.println();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int a1[] = new int[n];
//            take1(a1,n);
            for(int i = 0; i < n; i++)
            {
            	a1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int a2[] = new int[m];
        	//take2(a2,m);
            for(int i = 0; i < m; i++)
            {
            	a2[i] = sc.nextInt();
            }
            intersections(a1, a2);
        	t--;
        
        }        sc.close();
    }
}
