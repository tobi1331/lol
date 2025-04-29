package test;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] A = {2,5,1,4};
		int p = 0;
		int q = p+1;
		int r = 3;
		
		int[] D = merge2(A,0,1,3);
		System.out.println(Arrays.toString(D));
		
	}
	
	
	public static int[] merge(int[] A,int p, int q, int r) {
		
		int [] B = new int[p];
		int [] C;
		
		for(int i = 0; i>=p; i++) {
			B[i] = A[i];
			
			
		}
		
		
		
		
		System.out.println(Arrays.toString(B));
		
		
		
		return A;
	}
	
	
	
	public static int[] merge2(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }

        
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0; 
        int j = 0; 
        int k = p;

       
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

       
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
		return A;
    }
	

}
