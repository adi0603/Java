import java.io.*;
class Anagram
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Combination ob=new Combination();
        System.out.println("Enter a word");
        String s= br.readLine();
        System.out.print("\f");
        System.out.println("Anagrams are ..............");
        ob.anagram(s);
    }
}
