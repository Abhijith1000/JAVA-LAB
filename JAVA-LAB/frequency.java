import java.util.*;
class frequency{
    public static void main(String[] args) {
        String str;
        char c;
        int count=0,length;
        System.out.println("enter the string");
        Scanner sc=new Scanner (System.in);
        str=sc.nextLine();
        length=str.length(); 
        System.out.println("enter the character");
        c=sc.nextLine().charAt(0);

        for(int i=0;i<length;i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        
        System.err.println("the frequency of "+c+" is:"+count);
    }
}
