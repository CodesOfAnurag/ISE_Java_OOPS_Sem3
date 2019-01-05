package q6_String;

public class Str_opr {
	String str;
	String str_word[];
	public Str_opr(String s)
	{
		str=s;
		str_word = str.split(" ");
		for (String x : str_word)
			x=x.trim();
	}
	
	public Str_opr()
	{
		str="";
	}
	
	public void StrPort(int m, int n)
	{
		String str2 = str.substring(m, m+n);
		System.out.println("Portion is : "+str2);
	}
	
	public void StrCount(String word)
	{
		int flag=0, count=0;
		for (String x : str_word)
			if (x.equals(word))
			{
				flag=1;
				count++;
			}
		if (flag==1)	System.out.println("Word Found "+count+" times");
		else			System.out.println("Word Not Found");
	}
	
	public void StrRep(String repwrd, String newwrd)
	{
		String str3 = str.replace(repwrd, newwrd);
		System.out.println("New String : "+str3);
	}
	
	public void StrRearg()
	{
		String str1="";
		for (int i=0; i<str_word.length; i++)
		{
			for( int j=0; j<str_word.length-i-1; j++)
			{
				if (str_word[j].toLowerCase().compareTo(str_word[j+1].toLowerCase())>0)
				{
					String temp = str_word[j];
					str_word[j]=str_word[j+1];
					str_word[j+1]=temp;
				}
			}
			str1=str_word[str_word.length-1-i]+" "+str1;
		}
		
		System.out.println(str1);
	}
	
	public void StrComp(String word)
	{
		if (str.toLowerCase().compareTo(word.toLowerCase()) > 0)	
			System.out.println(str+" is greater than "+word);
		else if (str.toLowerCase().compareTo(word.toLowerCase()) == 0)	
			System.out.println(str+" is Equal to "+word);
		else
			System.out.println(str+" is lesser than "+word);
	}
	
	public void StrConcat(String str2)
	{
		System.out.println("Concatinated String : "+str.concat(str2));
	}
}
