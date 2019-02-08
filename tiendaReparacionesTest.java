

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

    @Test
    public void testCommit6()
    {
        tiendaReparaciones tiendaRe2 = new tiendaReparaciones();
        assertEquals("", tiendaRe2.mostrarTodosLosPC());
        tiendaRe2.añadirOrdenador("hp", 4, false, "2014-05-06");
        tiendaRe2.añadirOrdenador("Asus", 8, true , "2018-06-01");
        assertEquals("hp 4 No tiene SO 2014-05-06 1\nAsus 8 Tiene SO 2018-06-01 2\n", tiendaRe2.mostrarTodosLosPC());
    }
}


