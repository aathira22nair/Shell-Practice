package shell_marksheet;

public class marksheet {
	String mark;
	
	public String check_mark(int m)
	{
		if(m<=35)
		{
			mark= "fail";
			
		}
		else if(m>=36 && m<=50)
		{
			mark= "3rd class";
			
		}
		else if(m>=51 && m<=75)
		{
			mark= "2nd class";
			
		}
		else if(m>=76 && m<=100)
		{
			mark= "1st class";
			
		}
		return mark;
	}
}
