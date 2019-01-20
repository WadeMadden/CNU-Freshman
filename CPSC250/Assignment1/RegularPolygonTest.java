package Assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class RegularPolygonTest {

    @Test
    public void testReflection() {
        Class<?> cClass = RegularPolygon.class;
        Field[] cFields = cClass.getDeclaredFields();

        for (Field f : cFields) {
            if (!f.isSynthetic()) {
                assertTrue("Field \"" + f.getName() + "\" should be private",
                        Modifier.isPrivate(f.getModifiers()));
                assertFalse("Field \"" + f.getName() + "\" can't be static",
                        Modifier.isStatic(f.getModifiers()));
            }
        }
    }

    @Test
    public void testGetSides() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(2);
        RegularPolygon poly3 = new RegularPolygon(4);

        assertEquals("poly1 should have 3 sides", 3, poly1.getSides());
        assertEquals("poly2 should have 3 sides", 3, poly2.getSides());
        assertEquals("poly3 should have 4 sides", 4, poly3.getSides());

    }

    @Test
    public void testGetLength() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(2);
        RegularPolygon poly3 = new RegularPolygon(4);

        assertEquals("poly1 should have length 1.0 sides", 1.0,
                poly1.getLength(), 0.001);
        assertEquals("poly2 should have length 1.0 sides", 1.0,
                poly2.getLength(), 0.001);
        assertEquals("poly3 should have length 1.0 sides", 1.0,
                poly3.getLength(), 0.001);
    }

    @Test
    public void testSetSides() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon();
        RegularPolygon poly3 = new RegularPolygon();

        poly1.setSides(-3);
        poly2.setSides(1);
        poly3.setSides(8);

        assertEquals("poly1 should have 3 sides", 3, poly1.getSides());
        assertEquals("poly2 should have 3 sides", 3, poly2.getSides());
        assertEquals("poly3 should have 8 sides", 8, poly3.getSides());

    }

    @Test
    public void testSetLength() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon();
        RegularPolygon poly3 = new RegularPolygon();

        poly1.setLength(-5.5);
        poly2.setLength(0.0);
        poly3.setLength(6.2);

        assertEquals("poly1 should have length 1.0 sides", 1.0,
                poly1.getLength(), 0.001);
        assertEquals("poly2 should have length 1.0 sides", 1.0,
                poly2.getLength(), 0.001);
        assertEquals("poly3 should have length 6.2 sides", 6.2,
                poly3.getLength(), 0.001);
    }

    @Test
    public void testPerimeter1() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(4);
        RegularPolygon poly3 = new RegularPolygon(5);

        assertEquals("poly1 should have perimeter 3.0", 3.0,
                poly1.getPerimeter(), 0.001);
        assertEquals("poly2 should have perimeter 4.0", 4.0,
                poly2.getPerimeter(), 0.001);
        assertEquals("poly3 should have perimeter 5.0", 5.0,
                poly3.getPerimeter(), 0.001);

    }

    @Test
    public void testPerimeter2() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(4);
        RegularPolygon poly3 = new RegularPolygon(5);

        poly1.setLength(2.5);
        poly2.setLength(4.6);
        poly3.setLength(7.25);

        assertEquals("poly1 should have perimeter 7.5", 7.5,
                poly1.getPerimeter(), 0.001);
        assertEquals("poly2 should have perimeter 18.4", 18.4,
                poly2.getPerimeter(), 0.001);
        assertEquals("poly3 should have perimeter 36.25", 36.25,
                poly3.getPerimeter(), 0.001);

    }

    @Test
    public void testArea1() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(4);
        RegularPolygon poly3 = new RegularPolygon(5);

        assertEquals("poly1 should have area 0.433", 0.433, poly1.getArea(),
                0.001);
        assertEquals("poly2 should have area 1.000", 1.0, poly2.getArea(),
                0.001);
        assertEquals("poly3 should have area 1.720", 1.720, poly3.getArea(),
                0.001);

    }

    @Test
    public void testArea2() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(4);
        RegularPolygon poly3 = new RegularPolygon(5);

        poly1.setLength(2.5);
        poly2.setLength(4.6);
        poly3.setLength(7.25);

        assertEquals("poly1 should have area 2.706", 2.706, poly1.getArea(),
                0.001);
        assertEquals("poly2 should have area 21.16", 21.16, poly2.getArea(),
                0.001);
        assertEquals("poly3 should have area 90.433", 90.433, poly3.getArea(),
                0.001);

    }

    @Test
    public void testMaxCount() {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon();
        RegularPolygon poly3 = new RegularPolygon();
        RegularPolygon poly4 = new RegularPolygon();

        double[] array1 = { 2.0, 2.0, 2.0, 1.5, 1.0, 1.2, 2.0 }; // 4 of 2.0
        double[] array2 = { 1.2, 3.5, 1.2, 3.5, 1.2, 3.5, 1.2 }; // 3 of 3.5
        double[] array3 = { 1.0, 2.0, 3.0, 4.0, 5.0 };           // 1 of 5.0
        double[] array4 = { -1.0, -1.0, -1.0, -1.0, -1.0 };      // 5 of -1.0

        poly1.newPolyMaxCount(array1);
        poly2.newPolyMaxCount(array2);
        poly3.newPolyMaxCount(array3);
        poly4.newPolyMaxCount(array4);

        assertEquals("poly1 should have 4 sides", 4, poly1.getSides());
        assertEquals("poly2 should have 3 sides", 3, poly2.getSides());
        assertEquals("poly3 should have 3 sides", 3, poly3.getSides());
        assertEquals("poly4 should have 3 sides", 3, poly4.getSides());

        assertEquals("poly1 should have length 2.0 sides", 2.0,
                poly1.getLength(), 0.001);
        assertEquals("poly2 should have length 3.5 sides", 3.5,
                poly2.getLength(), 0.001);
        assertEquals("poly3 should have length 1.0 sides", 1.0,
                poly3.getLength(), 0.001);
        assertEquals("poly4 should have length 1.0 sides", 1.0,
                poly4.getLength(), 0.001);
    }

}