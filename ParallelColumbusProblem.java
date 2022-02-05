// Question 3: Parallel Columbus
// Problem Statement –  Nobel Prize-winning Austrian-Irish physicist Erwin Schrödinger developed a machine and brought as many Christopher Columbus from as many parallel universes he could. Actually he was quite amused by the fact that Columbus tried to find India and got America. He planned to dig it further.

// Though totally for research purposes, he made a grid of size n X m, and planted some people of America in a position (x,y) [in 1 based indexing of the grid], and then planted you with some of your friends in the (n,m) position of the grid. Now he gathered all the Columbus in 1,1 positions and started a race.

// Given the values for n, m, x, y, you have to tell how many different Columbus(s) together will explore you as India for the first time.

// Remember, the Columbus who will reach to the people of America, will be thinking that as India and hence wont come further.

// Function Description:

// Complete the markgame function in the editor below. It has the following parameter(s):

// Parameters:

// Name	Type	Description
// n	Integer	
// The number of rows in the grid.

// m	Integer	The number of columns in the grid.
// x	Integer	The American cell’s Row.
// y	Integer	The American cell’s Column.
// Constraints:

// 1 <= n <= 10^2
// 1 <= m <= 10^2
// 1 <= x <= n
// 1 <= y <= m
// Input Format:

// The first line contains an integer, n, denoting the number of rows in the grid.
// The next line contains an integer m, denoting the number of columns in the grid.
// The next line contains an integer, x, denoting the American cell’s row.
// The next line contains an integer, y, denoting the American cell’s column.
// Sample Cases

// Sample Input 1

// 2

// 2

// 2

// 1

// Sample Output 1

// 1

// Explanation

// The only way possible is (1,1) ->(2,1) -> (2,2), so the answer is 1. 

import java.util.*;
public class ParallelColumbusProblem {
    static int noOfPaths(int destX,int destY,int srcX,int srcY){
        if(destX==srcX||destY==srcY){
            return 1;
        }
        return noOfPaths(destX-1, destY, srcX, srcY)+noOfPaths(destX, destY-1, srcX, srcY);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        int result = noOfPaths(n, m, 1,1)-noOfPaths(n,m,x,y)*noOfPaths(x, y, 1, 1);
        System.out.println(result);
        s.close();
    }
}
