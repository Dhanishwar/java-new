import java.util.*;
class sen
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence with a full stop :");
        String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='.')
            s=s+str.charAt(i);
        }
        String s1[]=s.split(" ");
        String te="";
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s1.length-i-1;j++)
            {
                if(s1[j].length()>s1[j+1].length())
                {
                    te=s1[j+1];
                    s1[j+1]=s1[j];
                    s1[j]=te;
                }
            }
        }
        String s2=s1[0];
        char a=s2.charAt(0);
        a=Character.toUpperCase(a);
        String s3=a+s2.substring(1);
        System.out.print(s3+" ");
        for(int i=1;i<s1.length;i++)
        {
            String x=s1[i].toLowerCase();
            System.out.print(x+" ");
        }
        System.out.println(".");
    }
}
