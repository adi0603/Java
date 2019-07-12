import java.io.*;
import java.util.*;
class Day
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter date in dd/mm/yyyy format.");
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s,"/");
        String a[]=new String[3];
        boolean valid=true;
        int i=0;
        while(st.hasMoreTokens())
        {
            a[i]=st.nextToken();
            i++;
        }
        int d=Integer.parseInt(a[0]);
        int m=Integer.parseInt(a[1]);
        int y=Integer.parseInt(a[2]);
        int ar[]={31,y%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        String week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(!(d>=1&&m>=1&&y>=1&&d<=ar[m-1]&&m<=12))
        {
            valid=false;
        }
        if(valid)
        {
            int i1=6;
            int sum=0;
            for(int x=2001;x<=y;x++)
            {
                if((x-1)%4==0)
                {
                    i1+=2;
                }
                else
                {
                    i1++;
                }
            }
            for(int x=0;x<=m-2;x++)
            {
                sum=sum+ar[x];
            }
            sum=sum+d;
            sum=sum+i1;
            int s1=sum%7;
            System.out.println("Day on "+s+" is "+week[s1-1]+".");
        }
        else
        {
            System.out.println("Invalid date.");
        }
    }
}
