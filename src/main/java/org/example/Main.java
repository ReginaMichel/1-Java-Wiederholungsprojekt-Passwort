package org.example;


import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println(checkContainsNumber("ad3a"));
        System.out.println(randomPasswordGenerator());
    }

    public static boolean checkPasswordLength(String password) {
        return password.length() >= 8;
    }
    public static boolean checkContainsNumber(String password) {
        // \\d find digit in regular expression
        // .* allows random content before or after
        return password.matches(".*\\d.*");
    }
    public static boolean checkUpperLowerCase(String password) {
        // [A-Z] find upper case letters in regular expression
        // [a-z] find lower case letters in regular expression
        // .* allows random content before or after
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }
    public static boolean checkFrequentlyUsed(String password) {
        boolean isFrequentlyUsed = false;
        if (password.matches(".*1234.*")
                || password.matches(".*password.*")
                || password.matches(".*Password.*")
                || password.matches(".*Passwort.*")
                || password.matches(".*passwort.*")
                || password.matches(".*asd.*")
                || password.matches(".*ASD.*")
                || password.matches(".*abc.*")
                || password.matches(".*ABC.*")){
            isFrequentlyUsed = true;
        }

        return isFrequentlyUsed;
    }

    public static String randomPasswordGenerator() {
        Random random = new Random();
        StringBuilder generatedPassword = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            generatedPassword.append((char) ('a' + random.nextInt(26)));
            generatedPassword.append((char) ('A' + random.nextInt(26)));
            generatedPassword.append((char) ('0' + random.nextInt(10)));
        }
        return generatedPassword.toString();
    }
}