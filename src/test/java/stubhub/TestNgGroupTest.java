package test.java.stubhub;

import org.testng.annotations.*;

/**
 * Created by Roman on 29.03.2017.
 */
public class TestNgGroupTest {

    @Test(groups={"unit1","integration"})
    public void testingMethod_1() {
        System.out.println("This is Integration testingMethod1");
    }

    @Test(groups={"unit1","functional"})
    public void testingMethod_2() {
        System.out.println("This is Functional testingMethod2");
    }

    @Test(groups={"unit1","integration"})
    public void testingMethod_3() {
        System.out.println("This is Integration testingMethod3");
    }
    @Test(groups={"unit1","functional"})
    public void testingMethod_4() {
        System.out.println("This is Functional testingMethod4");
}

    @Test (dependsOnGroups={"unit1"})
    public void initEnvironmentTest() {
        System.out.println("This is initEnvironmentTest");
    }

    @Test(dependsOnMethods={"initEnvironmentTest"})
    public void testmethod() {
        System.out.println("This is testmethod");
    }

}
