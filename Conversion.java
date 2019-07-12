class Conversion
{
    public static String DecimaltoBinary(int n)
    {
        String s="";
        int t=n;
        while(t!=0)
        {
            int r=t%2;
            s=r+s;
            t=t/2;
        }
        return s;
    }

    public static String DecimaltoBinary(double n)
    {
        int x=(int)n;
        String b1=DecimaltoBinary(x);
        double y=n-x;
        String b2="";
        for(int z=1;z<=10;z++)
        {
            y=y*2;
            b2=b2+(int)y;
            y=y-(int)y;
            if(y==0)
            {
                break;
            }
        }
        String b3=b1+"."+b2;
        return b3;
    }

    public static String DecimaltoOctal(int n)
    {
        String s="";
        int t=n;
        while(t!=0)
        {
            if(t%8==1)
            {
                s="1"+s;
            }
            if(t%8==0)
            {
                s="0"+s;
            }
            t=t/8;
        }
        return s;
    }

    public static String DecimaltoOctal(double n)
    {
        int x=(int)n;
        double y=n-x;
        String b1=DecimaltoOctal(x);
        String b2="";
        for(int z=1;z<=10;z++)
        {
            y=y*8;
            b2=b2+(int)y;
            y=y-(int)y;
            if(y==0)
            {
                break;
            }
        }
        String b3=b1+"."+b2;
        return b3;
    }

    public static String DecimaltoHexadecimal(int n)
    {
        String s="";
        int t=n;
        while(t!=0)
        {
            int r=t%16;
            s=(char)((r<=9)?(r+48):(r+55))+s;
            t=t/16;
        }
        return s;
    }

    public static String DecimaltoHexadecimal(double n)
    {
        int x=(int)n;
        double y=n-x;
        String b1=DecimaltoHexadecimal(x);
        String b2="";
        for(int z=1;z<=10;z++)
        {
            y=y*16;
            b2=b2+(char)(((int)y<=9)?((int)y+48):((int)y+55));
            y=y-(int)y;
            if(y==0)
            {
                break;
            }
        }
        String b3=b1+"."+b2;
        return b3;
    }

    public static String OctaltoBinary(String n)
    {
        String ar[]={"000","001","010","011","100","101","110","111"};
        String s="";
        for(int x=0;x<=n.length()-1;x++)
        {
            char ch=n.charAt(x);
            if(ch=='.')
            {
                s=s+ch;
            }
            else
            {
                s=s+ar[ch-48];
            }
        }
        s=s.replace("0"," ");
        s=s.trim();  
        s=s.replace(" ","0");
        return s;
    }

    public static String HexadecimaltoBinary(String n)
    {
        String ar[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        String s="";
        for(int x=0;x<=n.length()-1;x++)
        {
            char ch=n.charAt(x);
            if(ch=='.')
            {
                s=s+ch;
            }
            else 
            {
                if((ch-48)<9)
                {
                    s=s+ar[ch-48];
                }
                else if(ch>='A'&&ch<='F')
                {
                    s=s+ar[ch-55];
                }
            }
        }
        s=s.replaceAll("0"," ");
        s=s.trim();  
        s=s.replaceAll(" ","0");
        return s;
    }

    public static double BinarytoDecimal(String b)
    {
        int i=b.indexOf('.');
        String b1="",b2="";
        if(i>=0)
        {
            b1=b.substring(0,i);
            b2=b.substring(i+1);
        }
        else
        {
            b1=b;
        }
        int l=b1.length();
        int l2=b2.length();
        double d=0.0;
        int x,p;
        for(x=l-1,p=0;x>=0;x--,p++)
        {
            char ch=b1.charAt(x);
            int digit=ch-48;
            d=d+Math.pow(2,p)*digit;
        }
        for(x=0,p=-1;x<=l2-1;x++,p--)
        {
            char ch=b2.charAt(x);
            int digit=ch-48;
            d=d+Math.pow(2,p)*digit;
        }
        return d;
    }

    public static double OctaltoDecimal(String b)
    {
        int i=b.indexOf('.');
        String b1="",b2="";
        if(i>=0)
        {
            b1=b.substring(0,i);
            b2=b.substring(i+1);
        }
        else
        {
            b1=b;
        }
        int l1=b1.length();
        int l2=b2.length();
        double d=0.0;
        int x,p;
        for(x=l1-1,p=0;x>=0;x--,p++)
        {
            char ch=b1.charAt(x);
            int digit=ch-48;
            d=d+Math.pow(8,p)*digit;
        }
        for(x=0,p=-1;x<=l2-1;x++,p--)
        {
            char ch=b2.charAt(x);
            int digit=ch-48;
            d=d+Math.pow(8,p)*digit;
        }
        return d;
    }

    public static String OctaltoHexadecimal(String n)
    {
        String s="";
        double d=Conversion.OctaltoDecimal(n);
        s=Conversion.DecimaltoHexadecimal(d);
        return s;
    }

    public static double HexadecimaltoDecimal(String n)
    {
        double s=0.0;
        String d=Conversion.HexadecimaltoBinary(n);
        s=Conversion.BinarytoDecimal(d);
        return s;
    }

    /*public static String BinarytoHexadecimal(String n)
    {
        String d=Conversion.BinarytoDecimal(n);
        String s=Conversion.DecimaltoHexadecimal(d);
        return s;
    }*/
}
