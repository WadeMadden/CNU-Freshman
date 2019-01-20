

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestPersonName.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestPersonName extends junit.framework.TestCase
{
    /**
     * Default constructor for test class TestPersonName
     */
    public TestPersonName()
    {
    }
    public static void testBobby()
    {
        PersonName One= new PersonName();
        int testBobbyResult = One.NumberNames("Bobby");
        assertEquals(1, testBobbyResult);
    }
    public static void testBobby2()
    {
        PersonName One= new PersonName();
        int testBobbyResult = One.NumberNames("Bobby Smith");
        assertEquals(2, testBobbyResult);
    }
    public static void testBobby3()
    {
        PersonName One= new PersonName();
        int testBobbyResult = One.NumberNames("Bobby L. Smith");
        assertEquals(3, testBobbyResult);
    }
    public static void testBobby4()
    {
        PersonName One= new PersonName();
        int testBobbyResult = One.NumberNames("  Bobby  Paul Smith Jr.  ");
        assertEquals(4, testBobbyResult);
    }
   
}
