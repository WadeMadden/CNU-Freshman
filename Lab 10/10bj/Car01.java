public class Car01{
    private int capacity;
    private Person driver;
    private Person passengers[];
    private int occupancy;
    private int seat;

    public Car01(){
        /**
        (constructor) It creates a small car seating 4 people.
        */
        capacity = 4;
        passengers = new Person[capacity];
        occupancy = 0;
    }

    public Car01(int aCapacity){
        /**
        (constructor) It creates a car whose capacity is set by 
        the parameter given. If the parameter is not from 4 to 8 
        then the closest value should be used; for example, if an 
        occupancy value of 2 is given then the car’s occupancy will 
        be set to 4.
        */
        if(aCapacity <=4){
            capacity = 4;
        }
        else if (aCapacity >= 8){
            capacity = 8;
        }
        else {
            capacity=aCapacity;
        }
        passengers = new Person[capacity];
        occupancy=0;
    }

    public int getCapacity(){
        /**
        (method) It returns the maximum capacity of the car.
        */
       return capacity;
    }

    public int getOccupancy(){
        /**
        (method) It returns the current number of passengers.
        */
        occupancy = 0;
        for(int i=0;i<passengers.length;i++){
            if(passengers[i]!=null){
                occupancy++;
            }
        }
        return occupancy;
    }

    public boolean hasRoom(){
        /**
        (method) It indicates whether the car is full or not, as 
        calculated by the difference between current passengers and 
        the car’s capacity.
        */        
        boolean results;
        if (getCapacity()>getOccupancy()){
            results = true;
        }
        else {
            results = false;
        }
        return results;
    }   

    public Person getDriver(){
        /**
        (method) It returns the person driving the car or “null” 
        if none has been set.
        */
        return driver;
    }

    public boolean setDriver(Person person){
        /**
        (method) It assigns a person as the driver. The method 
        returns true if the indicated person can be set as the 
        driver or false otherwise. The method succeeds if the 
        person is of driving age and if this person is or can 
        become a passenger (you can assume that 2 persons are 
        the same if they have the same name and age). If a driver 
        already exists then it is replaced by the new driver but 
        it is kept as a passenger. The method fails only if the 
        person being proposed as a driver is not of driving age 
        or if the person could drive but he/she is not a passenger 
        and there is no room to add him/her as a passenger.
        */
        boolean result;
        if(canDrive(person)==true && hasPassenger(person)==true && hasRoom()==true){
            driver=person;
            result=true;
        }
        else{
            driver=null;
            result=false;
        }
    
        return result;
    }

    public Person[] getPassengers(){
        /**
        (method) It returns the passengers in the car (which includes 
        the driver). The array returned should be a shallow copy of 
        the one kept in the car (thus changes in the copy are not 
        reflected in the original). To make a shallow copy, create a 
        new array of persons, copy all passengers to the new array, 
        and return this copy at the end of the method. Be aware that 
        returning a reference to the list of passengers does not result 
        in a copy.
        */
        Person [] passengersList = new Person[getCapacity()];
        for(int i=0;i < passengers.length;i++){ 
            if (passengers[i]!=null){
                passengersList[i]=passengers[i];
            }
        }
        return passengersList; 
    }

    public boolean hasPassenger(Person person){
        /**
        (method) It receives a person and indicates whether this person 
        is a passenger. As mentioned earlier, any 2 persons are the same 
        if they bear the same name and age.
        */
        boolean results=false;
        if (person!=null){
            for(int i = 0;i<passengers.length;i++){
                if(passengers[i]==person){
                    results=true;
                    seat=i;
                }
            }
        }
        return results;
    }

    public boolean addPassenger(Person person){
        /**
        (method) It adds a person as a passenger. The method fails if the 
        person to add is “null”, if the person is a passenger already, or 
        if there is no room left in the car to add it.
        */
        boolean results = false;
        if(person!=null && hasPassenger(person)==false && hasRoom()==true){
            int i=0;
            for(i=0;passengers[i]!=null;i++){}
            passengers[i]=person;
            results=true;
        }   
        return results;
    }

    public boolean removePassenger(Person person){
        /**
        (method) It receives a person and removes it as a passenger. If the 
        person is also the driver, then the driver seat becomes available
        (that is, it is set to “null”). The method fails if the person is 
        “null”, or if he/she is not a passenger.
        */
        boolean results;
        if(hasPassenger(person)==true){
            passengers[seat]=null;
            if(person==driver){
                driver=null;
            }
            results = true;
        }
        else{
            results = false;
        }
        return results;
    }

    public boolean canDrive(Person person){
        /**
        (method)It indicates whether a person is of driving age (that is, 16 years 
        or older). The method returns false if the person is “null” or if 
        the person's age is less that 16.
        */
        boolean results;
        if(person!=null){
            results=person.canDrive();
        }
        else{
            results = false;
        }
        return results;
    }
}