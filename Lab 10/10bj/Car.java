import java.util.ArrayList;

public class Car
{
    private Person driver;
    private Person [] passengers;
  
    public Car()
    {
        passengers = new Person [4];
    }
    public Car(int aCapacity)
    {
        if(aCapacity<4)
        {
            passengers = new  Person [4];
        }
        else if(aCapacity>8)
        {
            passengers = new  Person [8];
        }
        else
        {
            passengers = new Person [aCapacity];
        }
    }
    public int getCapacity()
    {
        int num = 0;
        for(int i = 0;i<passengers.length;i++)
        {
            num++;
        }
        return num;
    }
    public int getOccupancy()
    {
        int num = 0;
        for(int i = 0;i<passengers.length;i++)
        {
            if(passengers[i]!=null)
            {
                num++;
            }
        }
        return num;
    }
    public boolean hasRoom()
    {
        boolean room;
        if(getOccupancy()<getCapacity())
        {
            room = true;
        }
        else
        {
            room = false;
        }
        return room;
    }
    public Person getDriver()
    {
        if(driver == null)
        {
            return null;
        }
        return driver;
    }
    public boolean setDriver(Person person)
    {
        boolean test = false;
        if(hasPassenger(person)==true&&canDrive(person)==true)
        {
            driver=person;
            test=true;
        }
        else if(hasRoom()==true&&canDrive(person)==true)
        {
            for(int i =0;i<passengers.length;i++)
            {
                if(passengers[i]==driver)
                {
                    passengers[i]=person;
                }
                if(passengers[i]==null)
                {
                    passengers[i]=driver;
                }
            }
            driver=person;
            test=true;
        }
        return test;
    }
    public Person[] getPassengers()
    {
        Person[] newPassengers = new Person [getCapacity()];
        for(int i = 0;i<passengers.length;i++)
        {
            if(passengers[i]!=null)
            {
                newPassengers[i]=passengers[i];
            }
        }
        
        
        return newPassengers;
    }
    public boolean hasPassenger(Person person)
    {
        boolean test=false;
        if(person==null)
        {
            test = false;
        }
        else
        {
            for(int i = 0;i<passengers.length;i++)
            {
                if(passengers[i]==person)
                {
                    test=true;
                }
            }
        }
        return test;
    }
    public boolean addPassenger(Person person)
    {
        boolean test = false;
        int j = 0;
        if(hasPassenger(person)==false&&hasRoom()==true&&person!=null)
        {
            int num=0;
            for(j=0;passengers[j]!=null;j++){
                num++;
            }
                passengers[num]=person;
                test=true;
        }
        return test;
    }
    public boolean removePassenger(Person person)
    {
        boolean test = false;
        if(person!=null&&hasPassenger(person)==true)
        {
            for(int i = 0;i<passengers.length;i++)
            {
                if(person.equals(passengers[i]))
                {
                    if(person==driver)
                    {
                        driver=null;
                    }
                    passengers[i]=null;
                    break;
                }
            }
            test = true;
        }
        else
        {
            test = false;
        }
        return test;
    }
    public boolean canDrive(Person person)
    {
        boolean test;
        if(person!=null)
        {
            test=person.canDrive();
        }
        else
        {
            test = false;
        }
        return test;
    }
}