import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int x=scn.nextInt();
        
        int i=0;
        int j=n-1;
        
        while(i<n && j>=0){
            if(x>arr[i][j]){
                i++;
            }
            else if(x<arr[i][j]){
                j--;
            }
            else{
                System.out.println(i);
                System.out.println(j);
                return;
            }
        }
        System.out.print("Not Found");
    }
}