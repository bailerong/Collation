package ProPritecs;

import java.util.Properties;

public class TestPro {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("x","xian");
        properties.setProperty("z","zhang");
        System.out.println(properties.getProperty("x"));
        System.out.println(properties.getProperty("z"));

    }
}
