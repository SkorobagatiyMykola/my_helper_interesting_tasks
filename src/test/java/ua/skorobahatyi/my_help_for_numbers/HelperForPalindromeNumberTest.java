package ua.skorobahatyi.my_help_for_numbers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HelperForPalindromeNumberTest {

    HelperForPalindromeNumber helper = new HelperForPalindromeNumber();

    @DisplayName("Palindromes is true")
    @ParameterizedTest(name = "Check palindrome number => TRUE")
    @ValueSource(ints = {1,121,1221,12321,122221})
    void testIsPalindromeTrue(long number) {
        assertTrue(helper.isPalindrome(number));
    }

    @DisplayName("Palindromes is false")
    @ParameterizedTest(name = "Check palindrome number => FALSE")
    @ValueSource(ints = {12,122,1224,12323,122222})
    void testIsPalindromeFalse(long number) {
        assertFalse(helper.isPalindrome(number));
    }
}