
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
    private tiendaReparaciones tiendaRe1;


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
        tiendaRe1 = new tiendaReparaciones();
        tiendaRe1.añadirOrdenador("Asus", 8, true, "2018-09-11");
        tiendaRe1.añadirOrdenador("HP", 8, true, "2018-08-23");
        tiendaRe1.añadirOrdenador("HP", 4, true, "2014-02-13");
        tiendaRe1.añadirOrdenador("Asus", 4, true, "2014-02-13");
        tiendaRe1.añadirOrdenador("HP", 9, true, "2019-12-12");
        tiendaRe1.añadirOrdenador("MSI", 9, false, "2019-02-20");
        tiendaRe1.añadirOrdenador("MSI", 7, true, "2018-12-01");
        tiendaRe1.añadirOrdenador("Toshiba", 6, true, "2019-05-26");
        tiendaRe1.añadirOrdenador("Dell", 6, true, "2014-02-25");
        tiendaRe1.añadirOrdenador("Asus", 4, false, "2019-01-01");
        tiendaRe1.añadirOrdenador("Macbook Pro", 9, true, "2018-08-24");
        tiendaRe1.añadirOrdenador("Packard Bell", 5, true, "2015-07-02");
        tiendaRe1.añadirOrdenador("Huawei", 7, true, "2017-06-23");
        tiendaRe1.añadirOrdenador("Samsung", 4, true, "2014-02-12");
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

    @Test
    public void testCommit7()
    {
        tiendaReparaciones tiendaRe2 = new tiendaReparaciones();
        assertEquals("", tiendaRe2.mostrarTodosLosPC());
        tiendaRe2.añadirOrdenador("hp", 1, false, "2014-05-06");
        tiendaRe2.añadirOrdenador("Asus", 2, true , "2018-06-01");
        tiendaRe2.añadirOrdenador("hp", 3, false, "2014-05-06");
        tiendaRe2.añadirOrdenador("Asus", 5, true , "2018-06-01");
        tiendaRe2.añadirOrdenador("hp", 4, false, "2014-05-06");
        tiendaRe2.añadirOrdenador("Asus", 8, true , "2018-06-01");
        tiendaRe2.añadirOrdenador("hp", 6, false, "2014-05-06");
        tiendaRe2.añadirOrdenador("Asus", 7, true , "2018-06-01");
        assertEquals("hp 1\nAsus 2\nhp 3\nhp 4\nAsus 5\nhp 6\nAsus 7\nAsus 8\n", tiendaRe2.mostrarTodosLosPCOrdenados());
    }

    

    @Test
    public void testHashMap()
    {
        tiendaReparaciones tiendaRe2 = new tiendaReparaciones();
        tiendaRe2.añadirOrdenador("Asus", 8, true, "2018-09-11");
        tiendaRe2.añadirOrdenador("HP", 8, true, "2018-08-23");
        tiendaRe2.añadirOrdenador("HP", 4, true, "2014-02-13");
        tiendaRe2.añadirOrdenador("Asus", 4, true, "2014-02-13");
        tiendaRe2.añadirOrdenador("HP", 9, true, "2019-12-12");
        tiendaRe2.añadirOrdenador("MSI", 9, false, "2019-02-20");
        tiendaRe2.añadirOrdenador("MSI", 7, true, "2018-12-01");
        tiendaRe2.añadirOrdenador("Toshiba", 6, true, "2019-05-26");
        tiendaRe2.añadirOrdenador("Dell", 6, true, "2014-02-25");
        tiendaRe2.añadirOrdenador("Asus", 4, false, "2019-01-01");
        tiendaRe2.añadirOrdenador("Macbook Pro", 9, true, "2018-08-24");
        tiendaRe2.añadirOrdenador("Packard Bell", 5, true, "2015-07-02");
        tiendaRe2.añadirOrdenador("Huawei", 7, true, "2017-06-23");
        tiendaRe2.añadirOrdenador("Samsung", 4, true, "2014-02-12");
        assertEquals("Generación 4:\nHP 4 Tiene SO 2014-02-13 3 \nAsus 4 Tiene SO 2014-02-13 4 \nAsus 4 No tiene SO 2019-01-01 10 \nSamsung 4 Tiene SO 2014-02-12 14 \nGeneración 5:\nPackard Bell 5 Tiene SO 2015-07-02 12 \nGeneración 6:\nToshiba 6 Tiene SO 2019-05-26 8 \nDell 6 Tiene SO 2014-02-25 9 \nGeneración 7:\nMSI 7 Tiene SO 2018-12-01 7 \nHuawei 7 Tiene SO 2017-06-23 13 \nGeneración 8:\nAsus 8 Tiene SO 2018-09-11 1 \nHP 8 Tiene SO 2018-08-23 2 \nGeneración 9:\nHP 9 Tiene SO 2019-12-12 5 \nMSI 9 No tiene SO 2019-02-20 6 \nMacbook Pro 9 Tiene SO 2018-08-24 11 \n", tiendaRe2.obtenerDatosOrdenadoresHashMap());
    }
}



