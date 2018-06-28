import java.io.*;
class names
{
    public static void main(String args[]) throws IOException
    {
        
        DataInputStream in=new DataInputStream(System.in);
        int t ;
        String out="";
        System.out.println("Enter a Number to chane into words :\n");
        t=Integer.parseInt(in.readLine());
        String o[]={"One ","Two ","Three ","Four ","Five ","Six ","Seven ","eight ","Nine "};
        String v[]={"Ten ","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninenty "};
        String u[]={"Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
        int hu=t/100,te=(t%100)/10;
        int on=(t%100)%10;
        int temp=t%100;
        if(t==0)
        
            out=out+"Zero ";
        if(t==1000)
        {
                out="One Thousand ";
            }
            else if(t<1000)
            {
                if(hu!=0)
                {
                    out=out+search(hu,o)+"Hundred ";
                }
                if(te!=1)
                {
                    out=out+search(te,v);
                    out=out+search(on,o);
                }
                if((te==1)&&(on==0))
                out=out+search(temp-10,u);
                if((te==1)&&(on==0))
                out=out+"ten";
            }
            System.out.println("Number in words is=\t"+out);
        }
    static String search(int a,String a1[])
        {
            for(int i=0;i<a1.length;i++)
            if(a==i+1)
            return(a1[i]);
            return("");
        }
    }
