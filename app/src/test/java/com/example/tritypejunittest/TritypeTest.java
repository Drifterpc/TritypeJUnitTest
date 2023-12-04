package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang1() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
    }

    @Test
    public void testTriang2() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, 2, 7));
    }

    @Test
    public void testTriang3() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    }

    @Test
    public void testTriang4() {
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(3, 3, 2));
    }

    @Test
    public void testTriang5() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(3, 3, 3));
    }

}