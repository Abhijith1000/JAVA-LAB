import java.util.*;
class Vowels{
    public static void main (String arg[]){
        int vow=0;
        int con=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string and number of characters");
        String s=sc.nextLine();
        int n=sc.nextInt();
        char[] ch=new char[n];

        for(int i=0;i<n;i++){
        ch[i]= s.charAt(i);}

        for(int i=0;i<n;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
            vow=vow+1;
            }
            else{
                con=con+1;
            } }
            System.out.println("number of vowels="+vow);
              System.out.println("number of consonants="+con);

}
}