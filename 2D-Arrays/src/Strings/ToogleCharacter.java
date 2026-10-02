package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ToogleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        String string = str.chars()
                .mapToObj(ascii -> (char) (ascii))
                .map(character -> {
                    if (Character.isUpperCase(character)) {
                        return Character.toLowerCase(character);
                    } else if (Character.isLowerCase(character)) {
                        return Character.toUpperCase(character);
                    } else {
                        return character;
                    }
                }).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

        System.out.println(string);

    }
}
