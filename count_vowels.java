import java.util.*;
class pa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a paragraph");
        String s=sc.nextLine().toLowerCase();
        StringTokenizer st=new StringTokenizer(s,".");
        int a=st.countTokens();
        System.out.println("there are "+a+"Sentences int paragraph.");
        int count=0;
        System.out.println("the no.of vowels in:");
        for(int i=0;i<a;i++)
        {
            String s1=st.nextToken();
            for(int j=0;j<s1.length();j++)
            {
                char c=s1.charAt(j);
                if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                count++;
            }
            System.out.println("sentence"+(i+1)+"->"+count);
            count=0;
        }
    }
}
