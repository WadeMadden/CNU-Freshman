

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestPerson.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestPerson extends junit.framework.TestCase
{
    /**
     * Default constructor for test class TestPerson
     */
    public TestPerson()
    {
    }

    public static void test1()
    {
        Person One = new Person("Bob",15);
        boolean test1Result = One.canDrive();
        assertEquals(false, test1Result);
    }
    public static void test2()
    {
        Person One = new Person("Carl",16);
        boolean test2Result = One.canDrive();
        assertEquals(true, test2Result);
    }
    public static void test3()
    {
        Person One = new Person("Tom",18);
        boolean test3Result = One.canDrive();
        assertEquals(true, test3Result);
    }
}
