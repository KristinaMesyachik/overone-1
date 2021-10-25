package by.overone.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "Hello WorldWorldWorld WorldWorldWorld   Helllo";
        Pattern pattern = Pattern.compile("(World){3}");
        Matcher matcher = pattern.matcher(str);
//        System.out.println(matcher.matches());
        matcher.find();
        System.out.println(matcher.group(2));
    }
}
