package TestStep.Hooks;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks extends BaseStep {

    @Before
    public void setUp() throws MalformedURLException {
        BaseSetUp.setup();
    }

    @After
    public void tearDown() {
        BaseSetUp.teardown();
        }

}


