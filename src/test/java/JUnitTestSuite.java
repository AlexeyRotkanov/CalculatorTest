import com.epam.at.junittests.AdditionTest;
import com.epam.at.junittests.CosineTest;
import com.epam.at.junittests.IsPositiveTest;
import com.epam.at.junittests.MultiplicationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdditionTest.class,
        CosineTest.class,
        MultiplicationTest.class,
        IsPositiveTest.class
})
public class JUnitTestSuite {

}
