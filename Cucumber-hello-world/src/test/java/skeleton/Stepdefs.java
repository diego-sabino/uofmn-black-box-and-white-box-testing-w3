package skeleton;

import cucumber.api.java.en.When;

public class Stepdefs {
    @When("^test_posint (\\d+)$")
    public void testPositiveInteger(int number) throws Throwable {
        System.out.println("test_posint true for: " + number);
    }

    @When("^test_int (-?\\d+)$")
    public void testInteger(int number) throws Throwable {
        System.out.println("test_int true for: " + number);
    }

    @When("^test_float [+-]?([0-9]*[.])?[0-9]+$")
    public void testFloat(float number) throws Throwable {
        System.out.println("test_float true for: " + number);
    }

    @When("^test_ip_address ((?:(?:(?:\\d)|(?:1[0-2]\\d)|(?:[1-9]\\d))\\.){3}(?:(?:\\d)|(?:[1-9]\\d)|(?:1[0-2]\\d)))$")
    public void testIPAddress(String ipAddress) throws Throwable {
        System.out.println("test_ip_address true for: " + ipAddress);
    }

    @When("^test_splitter (?:\\bspill|Sponge|tap|rebuild\\b)((?!si|egregious|Foul|Test|top|ta|\\w).)*$")
    public void testSplitter(String match) throws Throwable {
        System.out.println("test_splitter true for: " + match);
    }

    @When("^test_splitter2 (?:\\bspill|Sponge|tap|rebuild\\b)((?!spall|egregious|foul|test|top|tapper|\\w).)*$")
    public void testSplitter2(String match) throws Throwable {
        System.out.println("test_splitter2 true for: " + match);
    }
}
