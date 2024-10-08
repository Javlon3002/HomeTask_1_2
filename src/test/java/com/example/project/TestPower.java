package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestPower {

    @Test
    @DisplayName("Test power calculations")
    public void testCalculatePower() {
        // Test cases for calculatePower method
        assertEquals(8, Power.calculatePower(2, 3));  // 2^3 = 8
        assertEquals(16, Power.calculatePower(4, 2)); // 4^2 = 16
        assertEquals(64, Power.calculatePower(8, 2)); // 8^2 = 64
        assertEquals(1, Power.calculatePower(5, 0));  // 5^0 = 1
        assertEquals(0, Power.calculatePower(0, 5));  // 0^5 = 0
    }
}
