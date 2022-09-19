package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        String pass = "Qw254,W32";
        for (int index = 0; index < pass.length(); index++) {
            if (password.equals(password.toUpperCase())) {
                throw new IllegalArgumentException( "The password must contain lowercase character.");
            }
        }
        if (pass.length() < 8) {
            throw new IllegalArgumentException("less than 8");
        }
        if (pass.length() < 32) {
            throw new IllegalArgumentException("less than 32");
        }
        return pass;
    }
}

