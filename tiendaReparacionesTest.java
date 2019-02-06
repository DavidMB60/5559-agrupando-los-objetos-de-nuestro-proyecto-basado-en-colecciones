

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class tiendaReparacionesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class tiendaReparacionesTest
{
    /**
     * Default constructor for test class tiendaReparacionesTest
     */
    public tiendaReparacionesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCommit5()
    {
        tiendaReparaciones tiendaRe1 = new tiendaReparaciones();
        tiendaRe1.añadirOrdenador("Asus", 8, false, "2019-02-06");
        tiendaRe1.añadirOrdenador("Acer", 5, true, "2010-10-05");
    }
}

