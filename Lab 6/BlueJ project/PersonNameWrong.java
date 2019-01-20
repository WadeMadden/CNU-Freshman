public class PersonNameWrong {
    

    int NumberNames(String wholename)
    {    // store the name passed in to the method
        String testname=wholename;
         // initialize number of names found
        int numnames=0;
         // on each iteration remove one name
        while (testname.length()>0)
        {   // take the "white space" from the beginning and end
           testname = testname.trim();
            // determine the position of the first blank
            // .. end of the first word
           int posBlank= testname.indexOf(' ');
          // cut off word
           testname=testname.substring(posBlank+1,testname.length());
          System.out.println(numnames);
          //System.out.println(testname);
           numnames++;
        }    
        return numnames;
    }

     
    public static void main(String args[])
    {
        PersonName One= new PersonName();
  
        System.out.println(One.NumberNames("Bobby"));
        System.out.println(One.NumberNames("Bobby Smith"));
        System.out.println(One.NumberNames("Bobby L. Smith"));
        System.out.println(One.NumberNames("  Bobby  Paul Smith Jr.  "));
        
    
    
    }
}