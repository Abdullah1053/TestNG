import javafx.scene.layout.Priority;
import org.testng.annotations.Test;

public class TestCases {
    @Test(priority = 1)
    void setup(){
        System.out.print("inside setup");

    }
    @Test(priority = 2)
    void TestSteps(){
        System.out.print("inside TestSteps");

    }
    @Test(priority = 3)
    void TearDown(){
        System.out.print("inside TearDown");

    }

}
