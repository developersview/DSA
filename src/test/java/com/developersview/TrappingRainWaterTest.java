package com.developersview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author pranoy.chakraborty
 * @Date 09/07/22
 */
public class TrappingRainWaterTest {
    @Test
    public void test0() {
        assertEquals(6, TrappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void test1() {
        assertEquals(2, TrappingRainWater.trap(new int[]{2, 0, 2}));
    }

    @Test
    public void test2() {
        assertEquals(7, TrappingRainWater.trap(new int[]{3, 0, 2, 0, 4}));
    }

    @Test
    public void test3() {
        assertEquals(9, TrappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
