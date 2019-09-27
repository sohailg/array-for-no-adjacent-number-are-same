public class Program
{
    public static void main(String[] args) {
        String s="Hello";
        char c;
        int e=0;
        int d=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            int p=c;
            if(p>=65&&p<=90)
            e++;
            else
            if(p>=97&&p<=122)
            d++;
        }
        System.out.println("No of characters in Uppercase:"+e);
        System.out.println("No of characters in Lowercase:"+d);
    }
}