import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        displayArrReverse(arr,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(arr.length==idx){
            return;
        }
        
        displayArrReverse(arr, idx+1);//faith
        System.out.println(arr[idx]);//expectation

    }

}