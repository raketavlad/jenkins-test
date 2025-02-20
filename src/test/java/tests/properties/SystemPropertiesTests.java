package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("properties")
public class SystemPropertiesTests {

    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser); // null
    }

    @Test
    void someTest2() {
        System.setProperty("some_browser", "safari");
        String browser = System.getProperty("some_browser");
        System.out.println(browser); // safari
    }

    @Test
    void someTest3() {
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); // opera
    }

    @Test
    void someTest4() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300x300");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);

        // gradle clean test
        // gradle clean test -Dbrowser=mozilla -Dversion=80 -DbrowserSize=600x600
    }
}
