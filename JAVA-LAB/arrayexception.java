import java.io.*;
import java.util.*;
class arrayexception {
    public static void main(String arg[]){

    int a[];
    a=new int [5];
     try{
        for(int i=0;i<7;i++){
            a[i]=i;
        }
     }
     catch(Exception e){
        System.out.println("array out of bounds exception occured");
     }
    
    
}
}