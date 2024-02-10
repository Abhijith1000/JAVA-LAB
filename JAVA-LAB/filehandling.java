import java.io.*;
class filehandling {
    public static void main(String[] args) throws Exception {

    try{
        FileInputStream f1=new FileInputStream("ag.txt");
        FileOutputStream f2=new FileOutputStream("ag2.txt");
        int c;

        do{
            c=f1.read();
            if(c!=-1){
                f2.write((char)c);
            }}
            while(c!=-1);
            f1.close();
            f2.close();}
            catch(Exception e){
                System.out.println("File not found");}
               }}
            
        
    
        
    
