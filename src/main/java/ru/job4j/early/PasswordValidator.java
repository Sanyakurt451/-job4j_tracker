package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        String pass = "Qw254,W32";
        for (int index = 0; index < pass.length(); index++) {
            if (password.equals(password.toUpperCase())) {
                throw new IllegalArgumentException( "The password must contain lowercase character.");
            }
        }
        return password;
    }
}

