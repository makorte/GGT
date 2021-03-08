/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.maxkorte;

import org.junit.Test;
import static org.junit.Assert.*;

public class GGTTest {
    @Test
    public void testGetGGT() {
        assertThrows(IllegalArgumentException.class, () -> {
            GGT.getGGT(0, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            GGT.getGGT(5, -3);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            GGT.getGGT(-6532748, 87);
        });
        assertEquals(5, GGT.getGGT(0, 5));
        assertEquals(7, GGT.getGGT(7, 0));
        assertEquals(25, GGT.getGGT(25, 50));
        assertEquals(3, GGT.getGGT(9, 6));
        assertEquals(27, GGT.getGGT(27, 27));
    }
}
