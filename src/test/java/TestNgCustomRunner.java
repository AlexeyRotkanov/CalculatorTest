import com.epam.at.listeners.TestListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNgCustomRunner {
    public static void main(String[] args) {
        TestNG testNg = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("Runner Suite");
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/testng.xml"));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testNg.setXmlSuites(suites);

        testNg.run();
    }
}
