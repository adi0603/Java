import java.io.*;
class Time
{
    public static void main(String args[])throws IOException
    {          
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String min[]={"Zero","One","Two","Three","Four","Five","Six","Seven",
                "Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen",
                "Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty",
                "Twenty one","Twenty two","Twenty three","Twenty four","Twenty five",
                "Twenty six","Twenty seven","Twenty eight","Twenty nine"};
        String hr[]={"Zero","One","Two","Three","Four","Five","Six","Seven",
                "Eight","Nine","Ten","Eleven","Twelve"};
        int ch=3;
        do
        {
            System.out.println("\f");
            System.out.println("Enter hour.");
            int h=Integer.parseInt(br.readLine());
            System.out.println("Enter minute.");
            int m=Integer.parseInt(br.readLine());
            if(h>=1&&h<=11||h==12&&m<31)
            {
                if(m==0)
                {
                    System.out.println(hr[h]+" O' Clock.");
                }
                else if(m>=1&&m<=14||m>=16&&m<=29)
                {
                    System.out.println(min[m]+" minutes past "+hr[h]+".");
                }
                else if(m==15)
                {
                    System.out.println("Quater past "+hr[h]+".");
                }
                else if(m==30)
                {
                    System.out.println("Half past "+hr[h]+".");
                }
                else if(m==45)
                {
                    System.out.println("Quater to "+hr[h+1]+".");
                }
                else if(m>=31&&m<=44||m>=46&&m<=59)
                {
                    System.out.println(min[60-m]+" minutes to "+hr[h+1]+".");
                }
            }
            else if(h==12&&m>=31)
            {
                if(m>=31&&m<=44)
                {
                    System.out.println(min[60-m]+" minutes to "+hr[1]+".");
                }
                else if(m==45)
                {
                    System.out.println("Quater to "+hr[1]+".");
                }
                else if(m>=46&&m<=59)
                {
                    System.out.println(min[60-m]+" minutes to "+hr[1]+".");
                }
            }
            else
            {
                System.out.println("Invalid Input.");
            }
            System.out.println("You want to enter more time.\nEnter 1 for YES & 0 for NO");
            ch=Integer.parseInt(br.readLine());
        }while(ch!=0);
        System.out.println("\f");
    }
}
