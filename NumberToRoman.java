/**
 * This Program Help To Convert Numbers From Decimal To Roman. 
 * Author ADITYA PANDEY 
 * Version 2.0 
 */
import  java.io.*;
class Roman
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("CONVERT NUMBER'S TO ROMAN LESS THEN 4000");
        String ar[][]={{"","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM","MMM"}};
        int c=5;
        do
        {
            if(c<5)
            {
                System.out.println(c+" Attempts Left");
            }
            System.out.println("Enter Password");
            int p=Integer.parseInt(br.readLine());
            if(p==54321)
            {
                if(p==54321)
                {
                    System.out.println("Access    Granted.");
                    Thread.sleep(2000);
                    System.out.println("\f");
                    System.out.println("Enter number");
                    int n=Integer.parseInt(br.readLine());
                    if(n<4000)
                    {
                        int i=0,t=n;
                        String s="";
                        while(t!=0)
                        {
                            int d=t%10;
                            s=ar[i][d]+s;
                            i++;
                            t=t/10;
                        }
                        System.out.println("Roman number = "+s);
                    }
                    else
                    {
                        System.out.println("Out of Range");
                    }
                    break;
                }
            }
            else
            {
                System.out.println("          Access     Denied.\nIncorrect Password");
                c--;
                Thread.sleep(1000);
                System.out.println("\f");
            }
            if(c==5)
            {
                COUNT_TIMER.Timer();
            }
        }while(true);
    }
}
