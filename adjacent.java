import java.io.*;
public class Program
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
    void array()throws IOException
    {
    System.out.println("Enter any natural numbers");
    int a;
    for(int i=0;i<a.length;i++)
    {
        a[i]=Integer.parseInt(br.readLine());
    }
        for(int i=0;i<a.length;i++)
        {
            int b=i+1;
            int c=i+2;
            if(a[i]==b)
            a[i]=c;
        }
        for(int i=0;i<a.lenth();i++);
        {
            System.out.println(a[i]);
        }
    }
}