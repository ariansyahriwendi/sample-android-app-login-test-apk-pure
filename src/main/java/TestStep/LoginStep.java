package TestStep;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseStep {

    @Given("Account created")
    public void accountCreated() {
    }

    @Given("Application opened")
    public void applicationOpened() {
    }

    @Given("Account not logged in")
    public void accountNotLoggedIn() {
    }

    @When("I click button Masuk")
    public void iClickButtonMasuk() {
    }

    @And("I input {string} on field Nomor HP atau No. kartu member")
    public void iInputOnFieldNomorHPNoKartuMember(String arg0) {
    }

    @And("I input {string} on field Masukkan Password")
    public void iInputOnFieldMasukkanPassword(String arg0) {
    }

    @And("I click button Lanjut")
    public void iClickButtonLanjut() {
    }

    @Then("Success to login")
    public void successToLogin() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("Open to beranda page")
    public void openToBerandaPage() {
    }

    @Then("Fail to login")
    public void failToLogin() {
    }

    @Then("Error mesage Password Anda salah. Silahkan coba lagi")
    public void errorMesagePasswordAndaSalahSilahkanCobaLagi() {
    }

    @Given("Device connected with account 081806442929")
    public void deviceConnectedWithAccount081806442929() {
    }

    @Then("Pop up error message Login Gagal, Maaf device ini sudah terhubung dengan Id:xxx, No:xxx, dan No Hp:{int}xxxxx{int}. Mohon hubungi Sahabat Alfamart")
    public void popUpErrorMessageLoginGagalMaafDeviceIniSudahTerhubungDenganIdXxxNoXxxDanNoHpXxxxxMohonHubungiSahabatAlfamart(int arg0, int arg1) {
    }

    @Then("Error message Nomor HP atau No. kartu Member tidak boleh kosong")
    public void errorMessageNomorHPAtauNoKartuMemberTidakBolehKosong() {
    }

    @Then("Error message Kolom ini diperlukan")
    public void errorMessageKolomIniDiperlukan() {
    }

    @Then("Error message Password minimum delapan karakter")
    public void errorMessagePasswordMinimumDelapanKarakter() {
    }

    @And("I click icon visible password")
    public void iClickIconVisiblePassword() {
    }
}
