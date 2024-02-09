import java.util.*;
public class DialPad {
	
    String s,rs[];
	void setString()throws NullPointerException
	{	rs = new String[s.length()];
		for(int i=0; i<s.length(); i++)
		{ 
		switch((int)s.charAt(i))
		  {
			case 50: rs[i]= "abc";
			break;
			
			case 51: rs[i]= "def";
			break;
			
			case 52: rs[i]= "ghi";
			break;
			
			case 53: rs[i]= "jkl";
			break;
			
			case 54: rs[i]= "mno";
			break;
			
			case 55: rs[i]= "pqrs";
			break;
			
			case 56: rs[i]= "tuv";
			break;
			
			case 57: rs[i]= "wxyz";
			break;
		
		  }
		}
	}
	
	void printOut()throws NullPointerException
	{
		System.out.print("{ ");
		for(int i=0; i<rs[0].length();i++)
		{
			if(rs.length>1)
			{
				for(int j=0; j<rs[1].length();j++)
				{
					if(rs.length>2)
					{
						for(int k=0; k<rs[2].length();k++)
						{	
							if(rs.length>3)
							{
								for(int l=0; l<rs[3].length();l++)
								{
									if(rs.length>4)
									{
										for(int m=0; m<rs[2].length();m++)
										{
											System.out.print("'"+rs[0].charAt(i)+rs[1].charAt(j)+rs[2].charAt(k)+rs[3].charAt(l)+rs[4].charAt(m)+"' ");	
										}
									}
									else
										System.out.print("'"+rs[0].charAt(i)+rs[1].charAt(j)+rs[2].charAt(k)+rs[3].charAt(l)+"' ");
								}
							}
							else
								System.out.print("'"+rs[0].charAt(i)+rs[1].charAt(j)+rs[2].charAt(k)+"' ");
						}
					}
					else
						System.out.print("'"+rs[0].charAt(i)+rs[1].charAt(j)+"' ");
				}
			}
			else
				System.out.print("'"+rs[0].charAt(i)+"' ");
			
		}
		System.out.println(" }");
	}
	
	public static void main(String[] args)throws NullPointerException
	{
		Scanner scan = new Scanner(System.in);
		DialPad l = new DialPad();
		System.out.println("Enter number max 5 value in between 2 to 9");
		l.s = scan.nextLine();
		boolean flag=false;
		for(int i=0 ; i<l.s.length(); i++)
		{
			if(l.s.charAt(i)<'2' || l.s.charAt(i)>'9' || l.s.length()>5)
			{
				flag=true;
			}
		}
		
		if(flag)
		System.out.println("Enter valide input");
		
		else
		{
		l.setString();
		l.printOut();
		}
    }
}