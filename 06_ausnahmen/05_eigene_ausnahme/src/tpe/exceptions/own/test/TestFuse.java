package tpe.exceptions.own.test;

//import org.junit.Test;
//
//import tpe.exceptions.own.Fuse;
//import tpe.exceptions.own.FuseTrippedException;
//import tpe.exceptions.own.IllegalCurrentException;

/**
 * Testet die Sicherung.
 */
public class TestFuse {

    // TODO: Quellcode wieder einkommentieren

//    /**
//     * Testet die Erzeugung von Sicherungen mit gültigen Werten.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test
//    public void testCreationValid() throws IllegalCurrentException {
//        new Fuse(Fuse.A16);
//        new Fuse(Fuse.A25);
//        new Fuse(Fuse.A32);
//    }
//
//    /**
//     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = IllegalCurrentException.class)
//    public void testCreationValid1() throws IllegalCurrentException {
//        new Fuse(15);
//    }
//
//    /**
//     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = IllegalCurrentException.class)
//    public void testCreationValid2() throws IllegalCurrentException {
//        new Fuse(-1);
//    }
//
//    /**
//     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = IllegalCurrentException.class)
//    public void testCreationValid3() throws IllegalCurrentException {
//        new Fuse(0);
//    }
//
//    /**
//     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = IllegalCurrentException.class)
//    public void testCreationValid4() throws IllegalCurrentException {
//        new Fuse(Integer.MAX_VALUE);
//    }
//
//    /**
//     * Testet die Erzeugung von Sicherungen mit ungültigen Werten.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = IllegalCurrentException.class)
//    public void testCreationValid5() throws IllegalCurrentException {
//        new Fuse(Integer.MIN_VALUE);
//    }
//
//    /**
//     * Testet das Auslösen der Sicherung.
//     * @throws FuseTrippedException Sicherung hat ausgelöst.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test
//    public void testTripping1()
//            throws FuseTrippedException, IllegalCurrentException {
//
//        Fuse f = new Fuse(Fuse.A16);
//        f.use(5);
//        f.use(16);
//        f.use(0);
//
//        f = new Fuse(Fuse.A25);
//        f.use(5);
//        f.use(16);
//        f.use(25);
//
//        f = new Fuse(Fuse.A32);
//        f.use(0);
//        f.use(16);
//        f.use(25);
//        f.use(32);
//    }
//
//    /**
//     * Testet das Auslösen der Sicherung.
//     * @throws FuseTrippedException Sicherung hat ausgelöst.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = FuseTrippedException.class)
//    public void testTripping2()
//            throws FuseTrippedException, IllegalCurrentException {
//
//        new Fuse(Fuse.A16).use(17);
//    }
//
//    /**
//     * Testet das Auslösen der Sicherung.
//     * @throws FuseTrippedException Sicherung hat ausgelöst.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = FuseTrippedException.class)
//    public void testTripping3()
//            throws FuseTrippedException, IllegalCurrentException {
//
//        new Fuse(Fuse.A16).use(Integer.MAX_VALUE);
//    }
//
//    /**
//     * Testet das Auslösen der Sicherung.
//     * @throws FuseTrippedException Sicherung hat ausgelöst.
//     * @throws IllegalCurrentException ungültiger Wert für die Sicherung.
//     */
//    @Test(expected = FuseTrippedException.class)
//    public void testTripping4()
//            throws FuseTrippedException, IllegalCurrentException {
//
//        new Fuse(Fuse.A32).use(40);
//    }
}
