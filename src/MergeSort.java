
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaldnikita
 */
public class MergeSort {
    private static int[] arrayA = {64,21,33,70,12,85,44,3,97,24,51,40};
    
    public static void main(String[] args) {    
        recMergeSort(new int[arrayA.length],0,arrayA.length-1);
    }
    
    private static void recMergeSort(int[] workspace,int lowerBound,int upperBound){
        if(lowerBound==upperBound)
            return;
        else{
            int mid = (lowerBound+upperBound)/2;            
            recMergeSort(workspace, lowerBound, mid);
            recMergeSort(workspace, mid+1, upperBound);
            merge(new int[upperBound-lowerBound+1], lowerBound, mid+1, upperBound);
        }
    }
    
    
    private static void merge(int[] workspace,int lowerBound,int mid,int upperBound){
        System.out.println(lowerBound+ " "+mid+" " + upperBound);
        int cDex=0;
        int lowReg = lowerBound;
        int upReg = mid;
        while(lowReg<=mid-1 && upReg<=upperBound){
            if(arrayA[lowReg]<arrayA[upReg])
                workspace[cDex++] = arrayA[lowReg++];
            else
                workspace[cDex++] = arrayA[upReg++];
        }
        while (lowReg<=mid-1)
            workspace[cDex++] = arrayA[lowReg++];
        while (upReg<=upperBound)
             workspace[cDex++] = arrayA[upReg++];
        System.out.println("temporary array: " + Arrays.toString(workspace));
          
        for(int j=0;j<upperBound-lowerBound+1;j++){
            arrayA[lowerBound+j]=workspace[j];
        }
            
        System.out.println("original array: " + Arrays.toString(arrayA));
    }
}
