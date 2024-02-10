import java.util.*;
class palindrome{
public static void main(String arg[]){
    String str;
    String rev="";
    System.out.println("enter the string");
    Scanner sc =new Scanner(System.in);
    str=sc.nextLine();
    int length= str.length();
    for(int i=str.length()-1;i>=0;i--){
        rev= rev+str.charAt(i);
}
if(str.equals(rev)){
System.out.println("palindrome");}
else{
    System.out.println("not palindrome");
}
}
}
