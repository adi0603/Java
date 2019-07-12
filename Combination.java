class Combination
{
    public static void anagram(String s)
    {
        anagram("",s);
    }

    private static void anagram(String fix,String s)
    {
        int l=s.length();
        if(l==1)
        {
            System.out.println(fix+s);
        }
        else
        {
            for(int x=0;x<=l-1;x++)
            {
                char ch=s.charAt(x);
                String r=s.substring(0,x)+s.substring(x+1);
                anagram(fix+ch,r);
            }
        }
    }
}
