//A number is Sparse if there are no two adjacent 1s in its binary representation. 
//For example 5 (binary representation: 101) is sparse, but 6 (binary representation: 110) is not sparse.
//Given a number x, find the smallest Sparse number which greater than or equal to x.

// Java program to find next sparse number  
import java.util.*;  
  
class GFG{ 
static int nextSparse(int x)  
{  
    // Find binary representation of x and store it in bin.get(].  
    // bin.get(0] contains least significant bit (LSB), next  
    // bit is in bin.get(1], and so on.  
    ArrayList<Integer> bin = new ArrayList<Integer>();  
    while (x != 0)  
    {  
        bin.add(x&1);  
        x >>= 1;  
    }  
  
    // There my be extra bit in result, so add one extra bit  
    bin.add(0);  
    int n = bin.size(); // Size of binary representation  
  
    // The position till which all bits are finalized  
    int last_final = 0;  
  
    // Start from second bit (next to LSB)  
    for (int i=1; i<n-1; i++)  
    {  
    // If current bit and its previous bit are 1, but next  
    // bit is not 1.  
    if (bin.get(i) == 1 && bin.get(i-1) == 1 && bin.get(i+1) != 1)  
    {  
            // Make the next bit 1  
            bin.set(i+1,1);  
  
            // Make all bits before current bit as 0 to make  
            // sure that we get the smallest next number  
            for (int j=i; j>=last_final; j--)  
                bin.set(j,0);  
  
            // Store position of the bit set so that this bit  
            // and bits before it are not changed next time.  
            last_final = i+1;  
        }  
    }  
  
    // Find decimal equivalent of modified bin.get(]  
    int ans = 0;  
    for (int i =0; i<n; i++)  
        ans += bin.get(i)*(1<<i);  
    return ans;  
}  
  
// Driver program  
public static void main(String[] args)  
{  
    int x = 38;  
    System.out.println("Next Sparse Number is "+nextSparse(x)); 
}  
} 
