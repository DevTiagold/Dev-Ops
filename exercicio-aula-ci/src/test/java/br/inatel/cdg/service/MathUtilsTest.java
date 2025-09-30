package br.inatel.cdg.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {
    // ---------- add ----------
    @Test
    public void givenTwoZeros_whenAdd_thenReturnZero() {
        assertEquals(0, MathUtils.add(0, 0));
    }

    @Test
    public void givenTwoPositives_whenAdd_thenReturnSum() {
        assertEquals(7, MathUtils.add(3, 4));
    }

    @Test
    public void givenNegativeAndPositive_whenAdd_thenReturnZero() {
        assertEquals(0, MathUtils.add(-5, 5));
    }

    @Test
    public void givenTwoNegatives_whenAdd_thenReturnNegativeSum() {
        assertEquals(-12, MathUtils.add(-5, -7));
    }

    @Test
    public void givenLargeNumbers_whenAdd_thenReturnLargeSum() {
        assertEquals(3000, MathUtils.add(1000, 2000));
    }

    // ---------- subtract ----------
    @Test
    public void givenTwoZeros_whenSubtract_thenReturnZero() {
        assertEquals(0, MathUtils.subtract(0, 0));
    }

    @Test
    public void givenTwoPositives_whenSubtract_thenReturnDifference() {
        assertEquals(1, MathUtils.subtract(2, 1));
    }

    @Test
    public void givenSmallerMinusGreater_whenSubtract_thenReturnNegative() {
        assertEquals(-1, MathUtils.subtract(1, 2));
    }

    @Test
    public void givenTwoNegatives_whenSubtract_thenReturnPositive() {
        assertEquals(2, MathUtils.subtract(-5, -7));
    }

    @Test
    public void givenLargeNumbers_whenSubtract_thenReturnLargeDifference() {
        assertEquals(999, MathUtils.subtract(1000, 1));
    }

    // ---------- multiply ----------
    @Test
    public void givenAnyNumberAndZero_whenMultiply_thenReturnZero() {
        assertEquals(0, MathUtils.multiply(0, 5));
    }

    @Test
    public void givenTwoPositives_whenMultiply_thenReturnProduct() {
        assertEquals(7, MathUtils.multiply(1, 7));
    }

    @Test
    public void givenNegativeAndPositive_whenMultiply_thenReturnNegative() {
        assertEquals(-12, MathUtils.multiply(-3, 4));
    }

    @Test
    public void givenTwoNegatives_whenMultiply_thenReturnPositive() {
        assertEquals(12, MathUtils.multiply(-3, -4));
    }

    @Test
    public void givenLargeNumbers_whenMultiply_thenReturnLargeProduct() {
        assertEquals(100, MathUtils.multiply(20, 5));
    }

    // ---------- divide ----------
    @Test
    public void givenTwoPositives_whenDivide_thenReturnQuotient() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    public void givenOddByTwo_whenDivide_thenReturnTruncatedQuotient() {
        assertEquals(4, MathUtils.divide(9, 2));
    }

    @Test
    public void givenNegativeAndPositive_whenDivide_thenReturnNegative() {
        assertEquals(-4, MathUtils.divide(-9, 2));
    }

    @Test
    public void givenZeroByPositive_whenDivide_thenReturnZero() {
        assertEquals(0, MathUtils.divide(0, 7));
    }

    @Test
    public void givenTwoNegatives_whenDivide_thenReturnPositive() {
        assertEquals(4, MathUtils.divide(-12, -3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenDivisorZero_whenDivide_thenThrowIllegalArgumentException() {
        MathUtils.divide(1, 0);
    }

    // ---------- factorial ----------
    @Test
    public void givenZero_whenFactorial_thenReturnOne() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    public void givenOne_whenFactorial_thenReturnOne() {
        assertEquals(1, MathUtils.factorial(1));
    }

    @Test
    public void givenFive_whenFactorial_thenReturn120() {
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    public void givenTen_whenFactorial_thenReturn3628800() {
        assertEquals(3_628_800, MathUtils.factorial(10));
    }

    @Test
    public void givenTwelveLimit_whenFactorial_thenReturn479001600() {
        assertEquals(479_001_600, MathUtils.factorial(12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNegative_whenFactorial_thenThrowIllegalArgumentException() {
        MathUtils.factorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenGreaterThanTwelve_whenFactorial_thenThrowIllegalArgumentException() {
        MathUtils.factorial(13);
    }

    // ---------- isPrime ----------
    @Test
    public void givenPrimeNumbers_whenIsPrime_thenReturnTrue() {
        assertTrue(MathUtils.isPrime(2));
        assertTrue(MathUtils.isPrime(3));
        assertTrue(MathUtils.isPrime(5));
        assertTrue(MathUtils.isPrime(7));
        assertTrue(MathUtils.isPrime(13));
        assertTrue(MathUtils.isPrime(97));
    }

    @Test
    public void givenNonPrimeNumbers_whenIsPrime_thenReturnFalse() {
        assertFalse(MathUtils.isPrime(0));
        assertFalse(MathUtils.isPrime(1));
        assertFalse(MathUtils.isPrime(4));
        assertFalse(MathUtils.isPrime(6));
        assertFalse(MathUtils.isPrime(8));
        assertFalse(MathUtils.isPrime(9));
        assertFalse(MathUtils.isPrime(100));
    }
}
