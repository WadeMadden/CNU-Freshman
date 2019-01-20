import	java.util.StringTokenizer;

public class PersonName
{
	private static int numberOfNames;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffixName;
	
	public PersonName()
	{
		numberOfNames = 0;
		firstName = "";
		middleName = "";
		lastName = "";
		suffixName = "";
	}
	public PersonName(String wholename)
    {   
    	firstName="";
    	middleName=""; 
    	lastName=""; 
    	suffixName="";
    	numberOfNames=0;
    
        // store the name passed in to the method
        final int MAXNAMES=4;
        String [] words = new String [MAXNAMES];
        String testname=wholename;
         // initialize number of names found
        int numnames=0;
         // on each iteration remove one name
       StringTokenizer st = new StringTokenizer(wholename);
       while (st.hasMoreTokens()) {
         words[numnames++]=st.nextToken();
     }
     
     if (numnames ==1)
      {  setFirstName(words[0]);}
     else if (numnames == 2)
      {  setFirstName(words[0]);
        setLastName(words[1]);
      }
     else if (numnames == 3)
      {  setFirstName(words[0]);
        setMiddleName(words[1]);
        setLastName(words[2]);
      }
     else if (numnames == 4)
      {  setFirstName(words[0]);
        setMiddleName(words[1]);
        setLastName(words[2]);
        setSuffixName(words[3]);
        
      }
      
      
    }
	public void setFirstName(String first_name)
	{
		if(((first_name.length()>0)&&(firstName.length()>0))||((first_name.length()==0)&&(firstName.length()==0)))
		{
			numberOfNames--;
		}
		numberOfNames++;
		firstName = first_name;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setMiddleName(String middle_name)
	{
		if(((middle_name.length()>0)&&(middleName.length()>0))||((middle_name.length()==0)&&(middleName.length()==0)))
		{
			numberOfNames--;
		}
		numberOfNames++;
		middleName = middle_name;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public void setLastName(String last_name)
	{
		if(((last_name.length()>0)&&(lastName.length()>0))||((last_name.length()==0)&&(lastName.length()==0)))
		{
			numberOfNames--;
		}
		numberOfNames++;
		lastName = last_name;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setSuffixName(String suffix_name)
	{
		if(((suffix_name.length()>0)&&(suffixName.length()>0))||((suffix_name.length()==0)&&(suffixName.length()==0)))
		{
			numberOfNames--;
		}
		numberOfNames++;
		suffixName = suffix_name;
	}
	public String getSuffixName()
	{
		return suffixName;
	}
	public int getNumberOfNames()
	{
		return numberOfNames;
	}
	public String EntireName()
	{
		String wholename = getFirstName()+" "+getMiddleName()+" "+getLastName()+" "+getSuffixName();
		System.out.println(wholename);
		return wholename;
	}
	public String Initials()
	{
		String thirdIn = "";
		String secondIn = "";
		String firstIn = getFirstName().substring(0,1);
		if(getMiddleName().length()>0)
		{
			secondIn = getMiddleName().substring(0,1);
		}
		if(getLastName().length()>0)
		{
			thirdIn = getLastName().substring(0,1);
		}
		String initials = firstIn+secondIn+thirdIn;
		return initials;	
	}
}