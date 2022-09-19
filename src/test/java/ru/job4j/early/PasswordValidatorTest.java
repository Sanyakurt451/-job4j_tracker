package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordValidatorTest {

    @Test
    public void WhenPasswordIsValid() {
        PasswordValidator pv = new PasswordValidator();
        assertEquals(pv.validate("1a23123"), "Qw254,W32");
        assertEquals(pv.validate("1abc12"), "Qw254,W32");
        assertEquals(pv.validate("aSa"), "Qw254,W32");
    }
}

