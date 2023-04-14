package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Login extends BaseSetUp {

    private final By login = new By.ById("appCompatButtonLogin");
    public void setLogin() {
        click(login);
    }

}
