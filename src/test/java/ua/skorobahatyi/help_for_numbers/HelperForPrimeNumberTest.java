package ua.skorobahatyi.help_for_numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HelperForPrimeNumberTest {

    private static int[] arrayPrimaryNumberForCheck = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
            61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
            179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283,
            293, 307, 311, 313, 317};

    PrimeNumber primaryNumber = new PrimeNumber();

    @DisplayName("Prime number is true")
    @ParameterizedTest(name = "Check prime number => TRUE")
    @ValueSource(ints = {2, 3, 5, 7, 997})
    void testPrimaryNumberCheckTrue(int number) {

        assertTrue(primaryNumber.isPrimeNumber(number));
    }

    @DisplayName("Prime number is false")
    @ParameterizedTest(name = "Check prime number => FALSE")
    @ValueSource(ints = {4, 8, 100, 14})
    void testPrimaryNumberCheckFalse(int number) {
        assertFalse(primaryNumber.isPrimeNumber(number));
    }

    @DisplayName("Prime number is true, for 5-digit number")
    @ParameterizedTest(name = "Check 5-digit number, quick prime number check => TRUE")
    @ValueSource(ints = {11939, 19937, 37199, 71993,99371})
    void testIsPrimeNumberQuickCheck(int number) {
        assertTrue(primaryNumber.isPrimeNumberQuickCheck(number, arrayPrimaryNumberForCheck));
    }
}