package java.TDD_JUNIT;

public class removefirst2A {

	public String remove (String string) {
		int len = string.length();
		char c1,c2;
		String reststring="";
		
		if(len>=1)
		{
			c1=string.charAt(0);
			if(len==1)
			{
				if(c1!='A')
					return string;
				else
					return reststring;
			}
			else
			{
				c2=string.charAt(1);
				if(len>2)
					reststring=string.substring(2);
				if(c1=='A'&&c2=='A')
					return reststring;
				else if(c1=='A'&& c2!='A')
					return (c2+reststring);
				else if(c1!='A'&&c2=='A')
					return (c1+reststring);
				else
					return (c1+c2+reststring);
				
			}
		}
		else
			return reststring;
		
	}

}
