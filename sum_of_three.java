// Monocarp has an integer n
// He wants to represent his number as a sum of three distinct positive integers x, y, and z. Additionally, Monocarp wants none of the numbers x, y, and z to be divisible by 3.
// Your task is to help Monocarp to find any valid triplet of distinct positive integers x, y, and z, or report that such a triplet does not exist.

// Input
// The first line contains a single integer t(1≤t≤104) — the number of testcases.
// The only line of each testcase contains a single integer n(1≤n≤109).

// Output
// For each testcase, if there is no valid triplet x, y, and z, print NO on the first line.
// Otherwise, print YES on the first line. On the second line, print any valid triplet of distinct positive integers x, y, and z 
// such that x+y+z=n, and none of the printed numbers are divisible by 3. If there are multiple valid triplets, you can print any of them.

// Example
// inputCopy
// 4
// 10
// 4
// 15
// 9
// outputCopy
// YES
// 4 5 1
// NO
// YES
// 2 8 5
// NO


import java.util.*;
public class sum_of_three {
    public static void main(String[] args) {
        Scanner kx= new Scanner (System.in);
        int n=kx.nextInt();
        while(n!=0){
            int a=kx.nextInt();
            if (a<7 || a==9)
                System.out.println("NO");
            else {
                System.out.println("YES");
                if (a % 3 == 0) {
                    System.out.println("1 4 " + (a - 5));
                } else {
                    System.out.println("1 2 " + (a - 3));
                }
            }
            n--;
        }
    }
}
