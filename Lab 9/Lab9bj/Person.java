public class Person
{
	private String personName;
	private int age;
	
	public Person()
	{
		personName = "no name";
		age = 0;
	}
	public Person(String aName, int anAge)
	{
		personName = aName;
		age = anAge;
	}
	public String getName()
	{
		return personName;
	}
	public void setName(String aName)
	{
		personName = aName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int anAge)
	{
		if(anAge<0)
		{
			age = 0;
		}
		else
		{
			age = anAge;
		}
	}
	public boolean canDrive()
	{
		if(age>=16)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean canDrive(int age)
	{
	    if(age>=16)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}