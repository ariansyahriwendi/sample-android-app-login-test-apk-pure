package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Register extends BaseSetUp {

    private final By notAccountYetCreateOne = new By.ById("textViewLinkRegister");
    public void setNotAccountYetCreateOne() {
        click(notAccountYetCreateOne);
    }

    private final By name = new By.ById("textInputEditTextName");
    public void setName(String x) {
        input(name, x);
    }

    private final By email = new By.ById("textInputEditTextEmail");
    public void setEmail(String x) {
        input(email, x);
    }

    private final By password = new By.ById("textInputEditTextPassword");
    public void setPassword(String x) {
        input(password, x);
    }

    private final By confirmPassword = new By.ById("textInputEditTextConfirmPassword");
    public void setConfirmPassword(String x) {
        input(confirmPassword, x);
    }

    private final By register = new By.ById("appCompatButtonRegister");
    public void setRegister() {
        click(register);
    }

    private final By alreadyAMember = new By.ById("appCompatTextViewLoginLink");
    public void setAlreadyAMember() {
        click(alreadyAMember);
    }

}


