import java.util.*;
import java.lang.*;
import java.io.*;


class sanket
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		while(S-->0)
		{
		    int Ni = Integer.parseInt(br.readLine());
		    String strHi[] = br.readLine().trim().split(" ");
		    System.out.println(isSuitableStrip(strHi,Ni));
	    }
	}
	static String isSuitableStrip(String str[], int N)
	{
	    int lm = Integer.parseInt(str[0]);
	    int rm = Integer.parseInt(str[N-1]);
	    if(N%2==0 || leftMost != 1 || rightMost != 1)
	        return "no";
	    
	    for(int i=1;i<N;i++)
	    {
	        int Hi = Integer.parseInt(str[i]);
	        int prev = Integer.parseInt(str[i-1]);
	        
	        if(i<=N/2 && Hi!=prev+1)
	            return "no";
	        else if(i>N/2 && Hi!=prev-1)
	            return "no";
	    }
	    return "yes";
	}
}
