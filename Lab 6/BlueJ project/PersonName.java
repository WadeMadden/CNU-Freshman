public class PersonName
{
    public static int NumberNames(String wholename)
    {   
        // store the name passed in to the method
        // and replace multiple whitespaces for a single space
        // and take the "white space" from the beginning and end
        String testname = wholename.replaceAll("\\s+", " ").trim();
        int testnameLength = testname.length();
        // initialize number of names found
        int numnames = 0;
        // on each iteration remove one name
        while (testnameLength > 0)
        {   
           // determine the position of the first blank
           // .. end of the first word
           int posBlank = testname.indexOf(' ');
           // if we reached the last word, break the while-loop
           if(posBlank == -1)
           {
               numnames++;
               break;
           }
           // cut off word
           testname = testname.substring(posBlank + 1, testnameLength);
           testnameLength = testname.length();
           //System.out.println(numnames);
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