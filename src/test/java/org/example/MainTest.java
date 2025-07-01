package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void checkPasswordLength_FalseWhen6Letters() {
        assertFalse(Main.checkPasswordLength("asdasd"));
    }
    @Test
    void checkPasswordLength_TrueWhen8Letters() {
        assertTrue(Main.checkPasswordLength("asdasdad"));
    }


    @Test
    void checkContainsNumber_TrueWhenASD3() {
        assertTrue(Main.checkContainsNumber("asd3"));
    }

    @Test
    void checkUpperLowerCase_TrueWhenasdASD() {
        assertTrue(Main.checkUpperLowerCase("asdASD"));
    }

    @Test
    void checkFrequentlyUsed_trueWhenasdASD() {
        assertTrue(Main.checkFrequentlyUsed("asdASD"));
    }
}