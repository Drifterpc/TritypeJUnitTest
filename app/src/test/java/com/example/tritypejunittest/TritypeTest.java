package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang1() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
    } //不是三角形

    @Test
    public void testTriang2() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, 2, 7));
    } //边长为负数，不是三角形


    @Test
    public void testTriang3() {
        Tritype tri = new Tritype();
        assertEquals(1, tri.Triang(3, 4, 5));
    } //普通三角形

    @Test
    public void testTriang4() {
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(3, 3, 2));
    } //等腰三角形

    @Test
    public void testTriang5() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(3, 3, 3));
    } //等边三角形

    @Test
    public void testTriang6() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(2, 2, 4));
    } //等腰，两边之和等于第三边，不是三角形

    @Test
    public void testTriang7() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(2, 2, 5));
    } //等腰，两边之和小于第三边，不是三角形

    @Test
    public void testTriang8() {
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(3, 2, 3));
    } //等腰三角形

    @Test
    public void testTriang9() {
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(2, 3, 3));
    } //等腰三角形
}