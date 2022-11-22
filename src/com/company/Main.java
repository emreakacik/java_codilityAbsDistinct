package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] A={-2,2,4,6};
        System.out.println(solution(A));
    }
    public static int solution(int[] A){
        int sayac=0;

        for (int i=0; i < A.length;i++){
            if (A[i]<0){
                A[i]=-A[i];
            }
        }
        Arrays.sort(A);
        for (int i=1; i < A.length;i++){
            if (A[i]==A[i-1]){
                sayac++;
            }
            System.out.println(A[i]);
        }
        return A.length-sayac;
    }
}
