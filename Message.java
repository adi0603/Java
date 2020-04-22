import java.io.*;
import java.util.*;
class Message
{
    public static void main(String args[])throws IOException
    {
        File f=new File("message.txt");
        FileReader fr=new FileReader(f);
        BufferedReader fbr=new BufferedReader(fr);
        ArrayList<String> ar=new ArrayList<String>(100);

        String word="";
        int c,count=0;
        while ((c=fr.read()) != -1)
        {
            if (c==32 || c=='\n' || c=='!' || c==',' || c=='.')
            {
                if(!(word.equals("")))
                {
                    ar.add(word);
                }
                word="";
            }
            else
            {
                word=word+(char)c;
            }
            if (c == '\n') // Increment count if this character is newline 
            {
                count++;
            }
        }
        fbr.close();
        fr.close();

        int value[]=new int[ar.size()];
        for (int i=0; i<ar.size()-1; i++)
        {
            int times=1;
            for (int j=i+1; j<ar.size(); j++)
            {
                if(ar.get(i).equalsIgnoreCase(ar.get(j)))
                {
                    times++;
                }
            }
            value[i]=times;
        }
        int maxIndex=0;
        for (int i = 0; i < ar.size(); i++)
        {
            if (value[i]>value[maxIndex])
            {
                maxIndex=i;
            }
        }
        if (count <= 11)
        {
            System.out.println("Meeting Time is "+count+" AM");
        }
        else if(count >12 && count<= 24)
        {
            System.out.println("Meeting Time is "+count+" PM");
        }
        else if (count==12)
        {
            System.out.println("Meeting Time is "+count+" PM");
        }
        System.out.println("Meeting Place is "+ar.get(maxIndex));
    }
}