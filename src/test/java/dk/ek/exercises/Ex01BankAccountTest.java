package dk.ek.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01BankAccountTest {
    Ex01BankAccount instance = new Ex01BankAccount();

    @Test
    void ex1() {
        assertFalse(instance.ex1());
    }
}