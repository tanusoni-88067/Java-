import java.io.*;
class Src
{
public static void main(String args[])throws 
IOException,FileNotFoundException
{
 FileInputStream fin=new FileInputStream(args[0]);
 FileOutputStream fout=new FileOutputStream(args[1]);
 int b;
 while((b=fin.read())!=-1)
 {
 fout.write(b);
 }
 System.out.println("File copies successfully");
 fin.close();
 fout.close();
}
}