
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
public class ShellSort {
    private static int[] arrayA = {64,21,33,70,12,85,44,3,97,24,51,40};
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayA));
        sort();
        System.out.println(Arrays.toString(arrayA));
    }
    
    private static void sort(){
        int inner,outer,temp,h=1; //Последовательность Кнута
        while(h<arrayA.length/3)
            h=h*3+1;
        
        while(h>0){
            
           for(outer=h;outer<arrayA.length;outer++){
               temp=arrayA[outer];
               inner=outer;
               
               while(inner>h-1 && arrayA[inner-h]>=temp){
                   arrayA[inner] = arrayA[inner-h];
                   inner-=h;
               }
               
               arrayA[inner]=temp;
           }
           h=(h-1)/3;
        }   
    }    
    
}
